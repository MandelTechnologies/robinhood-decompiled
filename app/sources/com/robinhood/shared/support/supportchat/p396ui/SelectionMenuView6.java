package com.robinhood.shared.support.supportchat.p396ui;

import android.net.Uri;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.Divider5;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
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
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.p355ui.p356v2.SelectionMenuRowModel;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.shared.support.supportchat.C40042R;
import com.robinhood.shared.support.supportchat.p396ui.SelectionMenuView6;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SelectionMenuView.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\f\u001aH\u0010\r\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00112!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0012\u001a5\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u001a\u001a%\u0010\u001b\u001a\u00020\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010!\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010\"\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u008e\u0002"}, m3636d2 = {"SelectionMenuView", "", "message", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$SelectionMenu;", "modifier", "Landroidx/compose/ui/Modifier;", "onRowSelected", "Lkotlin/Function1;", "Lcom/robinhood/models/ui/v2/SelectionMenuRowModel;", "Lkotlin/ParameterName;", "name", "row", "(Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$SelectionMenu;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SelectionMenuBottomSheetContent", "title", "", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SelectionMenuRow", "rowIndex", "", "onClick", "Lkotlin/Function0;", "(Lcom/robinhood/models/ui/v2/SelectionMenuRowModel;ILkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SelectionMenuDivider", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SelectionMenuToggle", "onToggle", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewSelectionMenuViewCollapsedNight", "(Landroidx/compose/runtime/Composer;I)V", "PreviewSelectionMenuViewCollapsed", "PreviewSelectionMenuViewExpanded", "PreviewSelectionMenuViewWithIcons", "lib-support-chat_externalDebug", "isSheetOpen", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SelectionMenuView6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSelectionMenuViewCollapsed$lambda$30(int i, Composer composer, int i2) {
        PreviewSelectionMenuViewCollapsed(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSelectionMenuViewCollapsedNight$lambda$29(int i, Composer composer, int i2) {
        PreviewSelectionMenuViewCollapsedNight(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSelectionMenuViewExpanded$lambda$31(int i, Composer composer, int i2) {
        PreviewSelectionMenuViewExpanded(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSelectionMenuViewWithIcons$lambda$32(int i, Composer composer, int i2) {
        PreviewSelectionMenuViewWithIcons(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionMenuBottomSheetContent$lambda$15(String str, ImmutableList immutableList, Function1 function1, int i, Composer composer, int i2) {
        SelectionMenuBottomSheetContent(str, immutableList, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionMenuDivider$lambda$26(Modifier modifier, int i, int i2, Composer composer, int i3) {
        SelectionMenuDivider(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionMenuRow$lambda$25(SelectionMenuRowModel selectionMenuRowModel, int i, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        SelectionMenuRow(selectionMenuRowModel, i, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionMenuToggle$lambda$28(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SelectionMenuToggle(function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionMenuView$lambda$9(UiChatMessage.Regular.SelectionMenu selectionMenu, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        SelectionMenuView(selectionMenu, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectionMenuView(UiChatMessage.Regular.SelectionMenu message, Modifier modifier, Function1<? super SelectionMenuRowModel, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        UiChatMessage.Regular.SelectionMenu selectionMenu;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function1<? super SelectionMenuRowModel, Unit> onRowSelected = function1;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onRowSelected, "onRowSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(1692732937);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(message) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onRowSelected) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1692732937, i3, -1, "com.robinhood.shared.support.supportchat.ui.SelectionMenuView (SelectionMenuView.kt:61)");
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
                SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(message);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = message.getMaxQuickReplyRows() != null ? message.getRows() : CollectionsKt.take(message.getRows(), message.getMaxQuickReplyRows().intValue());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                List list = (List) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(12));
                Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), "SelectionMenu");
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
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
                Modifier modifierClip = Clip.clip(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), roundedCornerShapeM5327RoundedCornerShape0680j_4);
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier4 = modifier3;
                SurfaceKt.m5967SurfaceT9BRK9s(BorderKt.m4876borderxT4_qwU(modifierClip, fM7995constructorimpl, bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), roundedCornerShapeM5327RoundedCornerShape0680j_4), roundedCornerShapeM5327RoundedCornerShape0680j_4, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(1371603866, true, new SelectionMenuView8(list, onRowSelected), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 120);
                z = message.getMaxQuickReplyRows() == null && message.getRows().size() > message.getMaxQuickReplyRows().intValue();
                composerStartRestartGroup.startReplaceGroup(1959631955);
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SelectionMenuView6.SelectionMenuView$lambda$6$lambda$5$lambda$4(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SelectionMenuToggle((Function0) objRememberedValue3, TestTag3.testTag(companion3, "SelectionMenuToggle"), composerStartRestartGroup, 6, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (SelectionMenuView$lambda$1(snapshotState)) {
                    selectionMenu = message;
                    onRowSelected = function1;
                } else {
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
                    Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(WindowInsetsPadding_androidKt.imePadding(WindowInsetsPadding_androidKt.navigationBarsPadding(companion3)));
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SelectionMenuView6.SelectionMenuView$lambda$8$lambda$7(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    selectionMenu = message;
                    onRowSelected = function1;
                    ModalBottomSheetKt.m5886ModalBottomSheetdYc4hso((Function0) objRememberedValue4, modifierStatusBarsPadding, sheetStateRememberModalBottomSheetState, 0.0f, null, jM21371getBg0d7_KjU, 0L, 0.0f, 0L, null, null, null, ComposableLambda3.rememberComposableLambda(-1825662719, true, new C400673(selectionMenu, onRowSelected, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 6, 384, 4056);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                selectionMenu = message;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final UiChatMessage.Regular.SelectionMenu selectionMenu2 = selectionMenu;
                final Modifier modifier5 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SelectionMenuView6.SelectionMenuView$lambda$9(selectionMenu2, modifier5, onRowSelected, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
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
            SheetState sheetStateRememberModalBottomSheetState2 = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(message);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = message.getMaxQuickReplyRows() != null ? message.getRows() : CollectionsKt.take(message.getRows(), message.getMaxQuickReplyRows().intValue());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                List list2 = (List) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(12));
                Modifier modifierTestTag2 = TestTag3.testTag(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), "SelectionMenu");
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
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
                    Modifier modifierClip2 = Clip.clip(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), roundedCornerShapeM5327RoundedCornerShape0680j_42);
                    float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    Modifier modifier42 = modifier3;
                    SurfaceKt.m5967SurfaceT9BRK9s(BorderKt.m4876borderxT4_qwU(modifierClip2, fM7995constructorimpl2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU(), roundedCornerShapeM5327RoundedCornerShape0680j_42), roundedCornerShapeM5327RoundedCornerShape0680j_42, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(1371603866, true, new SelectionMenuView8(list2, onRowSelected), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 120);
                    if (message.getMaxQuickReplyRows() == null) {
                        composerStartRestartGroup.startReplaceGroup(1959631955);
                        if (z) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (SelectionMenuView$lambda$1(snapshotState)) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier42;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectionMenuView$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SelectionMenuView$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionMenuView$lambda$6$lambda$5$lambda$4(SnapshotState snapshotState) {
        SelectionMenuView$lambda$2(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionMenuView$lambda$8$lambda$7(SnapshotState snapshotState) {
        SelectionMenuView$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* compiled from: SelectionMenuView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$SelectionMenuView$3 */
    static final class C400673 implements Function3<Column5, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $isSheetOpen$delegate;
        final /* synthetic */ UiChatMessage.Regular.SelectionMenu $message;
        final /* synthetic */ Function1<SelectionMenuRowModel, Unit> $onRowSelected;

        /* JADX WARN: Multi-variable type inference failed */
        C400673(UiChatMessage.Regular.SelectionMenu selectionMenu, Function1<? super SelectionMenuRowModel, Unit> function1, SnapshotState<Boolean> snapshotState) {
            this.$message = selectionMenu;
            this.$onRowSelected = function1;
            this.$isSheetOpen$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
            invoke(column5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Column5 ModalBottomSheet, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1825662719, i, -1, "com.robinhood.shared.support.supportchat.ui.SelectionMenuView.<anonymous> (SelectionMenuView.kt:128)");
            }
            String takeoverTitle = this.$message.getTakeoverTitle();
            ImmutableList immutableList = extensions2.toImmutableList(this.$message.getRows());
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onRowSelected);
            final Function1<SelectionMenuRowModel, Unit> function1 = this.$onRowSelected;
            final SnapshotState<Boolean> snapshotState = this.$isSheetOpen$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$SelectionMenuView$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SelectionMenuView6.C400673.invoke$lambda$1$lambda$0(function1, snapshotState, (SelectionMenuRowModel) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SelectionMenuView6.SelectionMenuBottomSheetContent(takeoverTitle, immutableList, (Function1) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, SnapshotState snapshotState, SelectionMenuRowModel row) {
            Intrinsics.checkNotNullParameter(row, "row");
            function1.invoke(row);
            SelectionMenuView6.SelectionMenuView$lambda$2(snapshotState, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectionMenuBottomSheetContent(final String str, ImmutableList<SelectionMenuRowModel> immutableList, Function1<? super SelectionMenuRowModel, Unit> function1, Composer composer, final int i) {
        int i2;
        int i3;
        Modifier.Companion companion;
        final ImmutableList<SelectionMenuRowModel> immutableList2 = immutableList;
        final Function1<? super SelectionMenuRowModel, Unit> function12 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1564325724);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(immutableList2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1564325724, i2, -1, "com.robinhood.shared.support.supportchat.ui.SelectionMenuBottomSheetContent (SelectionMenuView.kt:145)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(TestTag3.testTag(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), "SelectionMenuBottomSheet"), C2002Dp.m7995constructorimpl(24), 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1471806807);
            if (str == null || str.length() == 0) {
                i3 = i2;
                companion = companion2;
            } else {
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                i3 = i2;
                companion = companion2;
                BentoText2.m20747BentoText38GnDrw(str, TestTag3.testTag(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(12), 7, null), 0.0f, 1, null), "SelectionMenuBottomSheetTitle"), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextL(), composerStartRestartGroup, i2 & 14, 0, 8120);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            immutableList2 = immutableList;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(immutableList2) | ((i3 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                function12 = function1;
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SelectionMenuView6.SelectionMenuBottomSheetContent$lambda$14$lambda$13$lambda$12(immutableList2, function12, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                function12 = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierFillMaxWidth$default, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 6, 508);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectionMenuView6.SelectionMenuBottomSheetContent$lambda$15(str, immutableList2, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectionMenuRow(final SelectionMenuRowModel selectionMenuRowModel, final int i, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i2, final int i3) {
        SelectionMenuRowModel selectionMenuRowModel2;
        int i4;
        Function0<Unit> function02;
        int i5;
        Modifier modifier2;
        RichText subtitle;
        String string2;
        RichText subtitle2;
        List<RichText.Attribute> listEmptyList;
        float fM7995constructorimpl;
        String trailingContent;
        String str;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        String icon;
        Modifier.Companion companion;
        Row6 row6;
        String str2;
        List<RichText.Attribute> list;
        Modifier modifier3;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int i6;
        final Modifier modifier4;
        String string3;
        String text;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1389049039);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            selectionMenuRowModel2 = selectionMenuRowModel;
        } else if ((i2 & 6) == 0) {
            selectionMenuRowModel2 = selectionMenuRowModel;
            i4 = (composerStartRestartGroup.changedInstance(selectionMenuRowModel2) ? 4 : 2) | i2;
        } else {
            selectionMenuRowModel2 = selectionMenuRowModel;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                function02 = function0;
                i4 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i4 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                } else {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1389049039, i4, -1, "com.robinhood.shared.support.supportchat.ui.SelectionMenuRow (SelectionMenuView.kt:193)");
                    }
                    subtitle = selectionMenuRowModel2.getSubtitle();
                    if (subtitle != null || (text = subtitle.getText()) == null || (string2 = StringsKt.trim(text).toString()) == null || StringsKt.isBlank(string2)) {
                        string2 = null;
                        subtitle2 = selectionMenuRowModel2.getSubtitle();
                        if (subtitle2 == null || (listEmptyList = subtitle2.getAttributes()) == null) {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        fM7995constructorimpl = C2002Dp.m7995constructorimpl((string2 != null || StringsKt.isBlank(string2)) ? 16 : 12);
                        trailingContent = selectionMenuRowModel2.getTrailingContent();
                        if (trailingContent != null || (string3 = StringsKt.trim(trailingContent).toString()) == null || StringsKt.isBlank(string3)) {
                            str = null;
                            float f = 16;
                            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(ClickableKt.m4893clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null), false, null, null, function02, 7, null), C2002Dp.m7995constructorimpl(f), fM7995constructorimpl);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor2);
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            icon = selectionMenuRowModel2.getIcon();
                            composerStartRestartGroup.startReplaceGroup(148106139);
                            if (icon != null) {
                                row6 = row62;
                                str2 = str;
                                modifier3 = modifier5;
                                companion = companion4;
                                list = listEmptyList;
                            } else {
                                ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(icon);
                                composerStartRestartGroup.startReplaceGroup(148109070);
                                if (serverToBentoAssetMapper2FromServerValue == null) {
                                    row6 = row62;
                                    str2 = str;
                                    modifier3 = modifier5;
                                    companion = companion4;
                                    list = listEmptyList;
                                } else {
                                    companion = companion4;
                                    row6 = row62;
                                    str2 = str;
                                    list = listEmptyList;
                                    modifier3 = modifier5;
                                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper2FromServerValue), null, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, 11, null), ChatMessageComposable7.SelectionMenuRowIcon.indexedTestTag(i)), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 48);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier.Companion companion5 = companion;
                            Modifier modifierWeight$default = Row5.weight$default(row6, companion5, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor3);
                            }
                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                            String title = selectionMenuRowModel.getTitle();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(title, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.startReplaceGroup(1207673043);
                            if (string2 != null) {
                                i6 = 6;
                            } else {
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, C2002Dp.m7995constructorimpl(4)), composerStartRestartGroup, 6);
                                i6 = 6;
                                BentoRichText.m15948BentoRichText0sCZWFg(new RichText(string2, list), TestTag3.testTag(companion5, ChatMessageComposable7.SelectionMenuRowSubtitle.indexedTestTag(i)), bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS(), bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU(), 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composerStartRestartGroup, 0, 1008);
                                composerStartRestartGroup = composerStartRestartGroup;
                                Unit unit2 = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.startReplaceGroup(148149859);
                            if (str2 != null) {
                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion5, C2002Dp.m7995constructorimpl(8)), composerStartRestartGroup, i6);
                                Composer composer2 = composerStartRestartGroup;
                                BentoText2.m20747BentoText38GnDrw(str2, TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(companion5, 0.0f, C2002Dp.m7995constructorimpl(10), 1, null), ChatMessageComposable7.SelectionMenuRowTrailing.indexedTestTag(i)), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU()), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composer2, 817889280, 0, 7544);
                                composerStartRestartGroup = composer2;
                                Unit unit3 = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                        } else {
                            String lowerCase = string3.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            if (!Intrinsics.areEqual(lowerCase, "null")) {
                                str = string3;
                            }
                            float f2 = 16;
                            Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(ClickableKt.m4893clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null), false, null, null, function02, 7, null), C2002Dp.m7995constructorimpl(f2), fM7995constructorimpl);
                            Arrangement arrangement2 = Arrangement.INSTANCE;
                            Arrangement.Vertical top2 = arrangement2.getTop();
                            Alignment.Companion companion22 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
                                Modifier.Companion companion42 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
                                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting()) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                    Row6 row622 = Row6.INSTANCE;
                                    icon = selectionMenuRowModel2.getIcon();
                                    composerStartRestartGroup.startReplaceGroup(148106139);
                                    if (icon != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    Modifier.Companion companion52 = companion;
                                    Modifier modifierWeight$default2 = Row5.weight$default(row6, companion52, 1.0f, false, 2, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                                    Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl3.getInserting()) {
                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                                        String title2 = selectionMenuRowModel.getTitle();
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i72 = BentoTheme.$stable;
                                        BentoText2.m20747BentoText38GnDrw(title2, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                                        composerStartRestartGroup = composerStartRestartGroup;
                                        composerStartRestartGroup.startReplaceGroup(1207673043);
                                        if (string2 != null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endNode();
                                        composerStartRestartGroup.startReplaceGroup(148149859);
                                        if (str2 != null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endNode();
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier4 = modifier3;
                                    }
                                }
                            }
                        }
                    } else {
                        String lowerCase2 = string2.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                        if (Intrinsics.areEqual(lowerCase2, "null")) {
                        }
                        subtitle2 = selectionMenuRowModel2.getSubtitle();
                        if (subtitle2 == null) {
                            listEmptyList = CollectionsKt.emptyList();
                            if (string2 != null) {
                                fM7995constructorimpl = C2002Dp.m7995constructorimpl((string2 != null || StringsKt.isBlank(string2)) ? 16 : 12);
                                trailingContent = selectionMenuRowModel2.getTrailingContent();
                                if (trailingContent != null) {
                                    str = null;
                                    float f22 = 16;
                                    Modifier modifierM5143paddingVpY3zN422 = PaddingKt.m5143paddingVpY3zN4(ClickableKt.m4893clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null), false, null, null, function02, 7, null), C2002Dp.m7995constructorimpl(f22), fM7995constructorimpl);
                                    Arrangement arrangement22 = Arrangement.INSTANCE;
                                    Arrangement.Vertical top22 = arrangement22.getTop();
                                    Alignment.Companion companion222 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(top22, companion222.getStart(), composerStartRestartGroup, 0);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN422);
                                    ComposeUiNode.Companion companion322 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor42 = companion322.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy32, companion322.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap42, companion322.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion322.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting()) {
                                    }
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SelectionMenuView6.SelectionMenuRow$lambda$25(selectionMenuRowModel, i, function0, modifier4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 3072;
            modifier2 = modifier;
            if ((i4 & 1171) == 1170) {
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                subtitle = selectionMenuRowModel2.getSubtitle();
                if (subtitle != null) {
                    string2 = null;
                    subtitle2 = selectionMenuRowModel2.getSubtitle();
                    if (subtitle2 == null) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        if ((i4 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionMenuBottomSheetContent$lambda$14$lambda$13$lambda$12(final ImmutableList immutableList, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyColumn.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$SelectionMenuBottomSheetContent$lambda$14$lambda$13$lambda$12$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                immutableList.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$SelectionMenuBottomSheetContent$lambda$14$lambda$13$lambda$12$$inlined$itemsIndexed$default$3
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
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final SelectionMenuRowModel selectionMenuRowModel = (SelectionMenuRowModel) immutableList.get(i);
                composer.startReplaceGroup(-1458824848);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(selectionMenuRowModel);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$SelectionMenuBottomSheetContent$1$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(selectionMenuRowModel);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                SelectionMenuView6.SelectionMenuRow(selectionMenuRowModel, i, (Function0) objRememberedValue, TestTag3.testTag(Modifier.INSTANCE, ChatMessageComposable7.SelectionMenuBottomSheetRow.indexedTestTag(i)), composer, i3 & 112, 0);
                composer.startReplaceGroup(1199876857);
                if (i < CollectionsKt.getLastIndex(immutableList)) {
                    SelectionMenuView6.SelectionMenuDivider(null, composer, 0, 1);
                }
                composer.endReplaceGroup();
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectionMenuDivider(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1114130385);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1114130385, i3, -1, "com.robinhood.shared.support.supportchat.ui.SelectionMenuDivider (SelectionMenuView.kt:264)");
            }
            Divider5.m5851HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), C2002Dp.m7995constructorimpl(1), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), composerStartRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectionMenuView6.SelectionMenuDivider$lambda$26(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SelectionMenuToggle(final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2054459058);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2054459058, i3, -1, "com.robinhood.shared.support.supportchat.ui.SelectionMenuToggle (SelectionMenuView.kt:276)");
                }
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(ClickableKt.m4893clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), false, null, null, function0, 7, null), 0.0f, C2002Dp.m7995constructorimpl(12), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterEnd(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                String strStringResource = StringResources_androidKt.stringResource(C40042R.string.support_chat_show_more, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                FontWeight bold = FontWeight.INSTANCE.getBold();
                TextDecoration underline = TextDecoration.INSTANCE.getUnderline();
                Color colorM6701boximpl = Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU());
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, colorM6701boximpl, null, bold, underline, null, 0, false, 0, 0, null, 0, textS, composer2, 221184, 0, 8138);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SelectionMenuView6.SelectionMenuToggle$lambda$28(function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(ClickableKt.m4893clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), false, null, null, function0, 7, null), 0.0f, C2002Dp.m7995constructorimpl(12), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterEnd(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                String strStringResource2 = StringResources_androidKt.stringResource(C40042R.string.support_chat_show_more, composerStartRestartGroup, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
                FontWeight bold2 = FontWeight.INSTANCE.getBold();
                TextDecoration underline2 = TextDecoration.INSTANCE.getUnderline();
                Color colorM6701boximpl2 = Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU());
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, null, colorM6701boximpl2, null, bold2, underline2, null, 0, false, 0, 0, null, 0, textS2, composer2, 221184, 0, 8138);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void PreviewSelectionMenuViewCollapsedNight(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-66947037);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-66947037, i, -1, "com.robinhood.shared.support.supportchat.ui.PreviewSelectionMenuViewCollapsedNight (SelectionMenuView.kt:297)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, SelectionMenuView.INSTANCE.getLambda$912401259$lib_support_chat_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectionMenuView6.PreviewSelectionMenuViewCollapsedNight$lambda$29(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewSelectionMenuViewCollapsed(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1967586995);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1967586995, i, -1, "com.robinhood.shared.support.supportchat.ui.PreviewSelectionMenuViewCollapsed (SelectionMenuView.kt:348)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, SelectionMenuView.INSTANCE.m25763getLambda$134387451$lib_support_chat_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectionMenuView6.PreviewSelectionMenuViewCollapsed$lambda$30(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewSelectionMenuViewExpanded(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1012594011);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1012594011, i, -1, "com.robinhood.shared.support.supportchat.ui.PreviewSelectionMenuViewExpanded (SelectionMenuView.kt:385)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, SelectionMenuView.INSTANCE.m25764getLambda$175196509$lib_support_chat_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectionMenuView6.PreviewSelectionMenuViewExpanded$lambda$31(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewSelectionMenuViewWithIcons(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(372026090);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(372026090, i, -1, "com.robinhood.shared.support.supportchat.ui.PreviewSelectionMenuViewWithIcons (SelectionMenuView.kt:436)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, SelectionMenuView.INSTANCE.m25765getLambda$2089741662$lib_support_chat_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectionMenuView6.PreviewSelectionMenuViewWithIcons$lambda$32(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
