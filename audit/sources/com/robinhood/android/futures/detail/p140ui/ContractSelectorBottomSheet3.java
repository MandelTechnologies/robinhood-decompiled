package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContent2;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.PlaceholderVerticalAlign;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.detail.p140ui.ContractSelectorBottomSheet3;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ContractSelectorBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0001¢\u0006\u0002\u0010\u0015\u001a1\u0010\u0016\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u0017H\u0003¢\u0006\u0002\u0010\u0018\u001am\u0010\u0019\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\fH\u0003¢\u0006\u0002\u0010\u001a\u001a!\u0010\u001b\u001a\u00020\u00012\b\b\u0001\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0003¢\u0006\u0002\u0010 \u001a\r\u0010!\u001a\u00020\"H\u0003¢\u0006\u0002\u0010#¨\u0006$"}, m3636d2 = {"ContractSelectorBottomSheet", "", WebsocketGatewayConstants.DATA_KEY, "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$RelatedContract;", "showSeparateContractAndProductItemsInContractSelector", "", "isViewingProductOnly", "productName", "Lcom/robinhood/utils/resource/StringResource;", "productSymbol", "onContractSelected", "Lkotlin/Function2;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "contractId", "sheetState", "Landroidx/compose/material3/SheetState;", "onDismiss", "Lkotlin/Function0;", "(Lkotlinx/collections/immutable/ImmutableList;ZZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ByContractSelector", "Lkotlin/Function1;", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ByProductSelector", "(Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Title", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "modifier", "Landroidx/compose/ui/Modifier;", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "activePillInlineContent", "Landroidx/compose/foundation/text/InlineTextContent;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/InlineTextContent;", "feature-futures-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.detail.ui.ContractSelectorBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ContractSelectorBottomSheet3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ByContractSelector$lambda$6(ImmutableList immutableList, Function1 function1, int i, Composer composer, int i2) {
        ByContractSelector(immutableList, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ByProductSelector$lambda$15(ImmutableList immutableList, boolean z, StringResource stringResource, StringResource stringResource2, Function2 function2, int i, Composer composer, int i2) {
        ByProductSelector(immutableList, z, stringResource, stringResource2, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractSelectorBottomSheet$lambda$0(ImmutableList immutableList, boolean z, boolean z2, StringResource stringResource, StringResource stringResource2, Function2 function2, SheetState sheetState, Function0 function0, int i, int i2, Composer composer, int i3) {
        ContractSelectorBottomSheet(immutableList, z, z2, stringResource, stringResource2, function2, sheetState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Title$lambda$16(int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        Title(i, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContractSelectorBottomSheet(final ImmutableList<FuturesDetailViewState.RelatedContract> immutableList, final boolean z, final boolean z2, final StringResource productName, final StringResource productSymbol, final Function2<? super UUID, ? super Boolean, Unit> onContractSelected, SheetState sheetState, final Function0<Unit> onDismiss, Composer composer, final int i, final int i2) {
        ImmutableList<FuturesDetailViewState.RelatedContract> immutableList2;
        int i3;
        boolean z3;
        boolean z4;
        SheetState sheetStateRememberModalBottomSheetState;
        final SheetState sheetState2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(productSymbol, "productSymbol");
        Intrinsics.checkNotNullParameter(onContractSelected, "onContractSelected");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-999446789);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            immutableList2 = immutableList;
        } else if ((i & 6) == 0) {
            immutableList2 = immutableList;
            i3 = (composerStartRestartGroup.changedInstance(immutableList2) ? 4 : 2) | i;
        } else {
            immutableList2 = immutableList;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                if ((i & 384) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(productName) : composerStartRestartGroup.changedInstance(productName) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(productSymbol) : composerStartRestartGroup.changedInstance(productSymbol) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onContractSelected) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    if ((i2 & 64) == 0) {
                        sheetStateRememberModalBottomSheetState = sheetState;
                        int i4 = composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) ? 1048576 : 524288;
                        i3 |= i4;
                    } else {
                        sheetStateRememberModalBottomSheetState = sheetState;
                    }
                    i3 |= i4;
                } else {
                    sheetStateRememberModalBottomSheetState = sheetState;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                    } else if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
                    }
                    int i5 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-999446789, i5, -1, "com.robinhood.android.futures.detail.ui.ContractSelectorBottomSheet (ContractSelectorBottomSheet.kt:51)");
                    }
                    SheetState sheetState3 = sheetStateRememberModalBottomSheetState;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE), false, sheetState3, null, 0L, ComposableLambda3.rememberComposableLambda(679092692, true, new C170481(z3, immutableList2, z4, productName, productSymbol, onContractSelected, onDismiss), composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 21) & 14) | 1572864 | ((i5 >> 9) & 7168), 52);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    sheetState2 = sheetState3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    sheetState2 = sheetStateRememberModalBottomSheetState;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.ContractSelectorBottomSheetKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ContractSelectorBottomSheet3.ContractSelectorBottomSheet$lambda$0(immutableList, z, z2, productName, productSymbol, onContractSelected, sheetState2, onDismiss, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z4 = z2;
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((4793491 & i3) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if ((i2 & 64) != 0) {
                    }
                    int i52 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    SheetState sheetState32 = sheetStateRememberModalBottomSheetState;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE), false, sheetState32, null, 0L, ComposableLambda3.rememberComposableLambda(679092692, true, new C170481(z3, immutableList2, z4, productName, productSymbol, onContractSelected, onDismiss), composerStartRestartGroup, 54), composerStartRestartGroup, ((i52 >> 21) & 14) | 1572864 | ((i52 >> 9) & 7168), 52);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    sheetState2 = sheetState32;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z;
        if ((i2 & 4) != 0) {
        }
        z4 = z2;
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((4793491 & i3) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: ContractSelectorBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.detail.ui.ContractSelectorBottomSheetKt$ContractSelectorBottomSheet$1 */
    static final class C170481 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ ImmutableList<FuturesDetailViewState.RelatedContract> $data;
        final /* synthetic */ boolean $isViewingProductOnly;
        final /* synthetic */ Function2<UUID, Boolean, Unit> $onContractSelected;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ StringResource $productName;
        final /* synthetic */ StringResource $productSymbol;
        final /* synthetic */ boolean $showSeparateContractAndProductItemsInContractSelector;

        /* JADX WARN: Multi-variable type inference failed */
        C170481(boolean z, ImmutableList<FuturesDetailViewState.RelatedContract> immutableList, boolean z2, StringResource stringResource, StringResource stringResource2, Function2<? super UUID, ? super Boolean, Unit> function2, Function0<Unit> function0) {
            this.$showSeparateContractAndProductItemsInContractSelector = z;
            this.$data = immutableList;
            this.$isViewingProductOnly = z2;
            this.$productName = stringResource;
            this.$productSymbol = stringResource2;
            this.$onContractSelected = function2;
            this.$onDismiss = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function2 function2, RhModalBottomSheet5 rhModalBottomSheet5, Function0 function0, UUID contractId, boolean z) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            function2.invoke(contractId, Boolean.valueOf(z));
            rhModalBottomSheet5.hideBottomSheet(function0);
            return Unit.INSTANCE;
        }

        public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(679092692, i, -1, "com.robinhood.android.futures.detail.ui.ContractSelectorBottomSheet.<anonymous> (ContractSelectorBottomSheet.kt:57)");
            }
            boolean z = true;
            if (this.$showSeparateContractAndProductItemsInContractSelector) {
                composer.startReplaceGroup(1554505612);
                ImmutableList<FuturesDetailViewState.RelatedContract> immutableList = this.$data;
                boolean z2 = this.$isViewingProductOnly;
                StringResource stringResource = this.$productName;
                StringResource stringResource2 = this.$productSymbol;
                composer.startReplaceGroup(-1746271574);
                boolean zChanged = composer.changed(this.$onContractSelected);
                if ((i & 14) != 4 && ((i & 8) == 0 || !composer.changedInstance(RhModalBottomSheet))) {
                    z = false;
                }
                boolean zChanged2 = zChanged | z | composer.changed(this.$onDismiss);
                final Function2<UUID, Boolean, Unit> function2 = this.$onContractSelected;
                final Function0<Unit> function0 = this.$onDismiss;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function2() { // from class: com.robinhood.android.futures.detail.ui.ContractSelectorBottomSheetKt$ContractSelectorBottomSheet$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ContractSelectorBottomSheet3.C170481.invoke$lambda$1$lambda$0(function2, RhModalBottomSheet, function0, (UUID) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                int i2 = StringResource.$stable;
                ContractSelectorBottomSheet3.ByProductSelector(immutableList, z2, stringResource, stringResource2, (Function2) objRememberedValue, composer, (i2 << 6) | (i2 << 9));
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1554952167);
                ImmutableList<FuturesDetailViewState.RelatedContract> immutableList2 = this.$data;
                composer.startReplaceGroup(-1746271574);
                boolean zChanged3 = composer.changed(this.$onContractSelected);
                if ((i & 14) != 4 && ((i & 8) == 0 || !composer.changedInstance(RhModalBottomSheet))) {
                    z = false;
                }
                boolean zChanged4 = zChanged3 | z | composer.changed(this.$onDismiss);
                final Function2<UUID, Boolean, Unit> function22 = this.$onContractSelected;
                final Function0<Unit> function02 = this.$onDismiss;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.ContractSelectorBottomSheetKt$ContractSelectorBottomSheet$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ContractSelectorBottomSheet3.C170481.invoke$lambda$3$lambda$2(function22, RhModalBottomSheet, function02, (UUID) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                ContractSelectorBottomSheet3.ByContractSelector(immutableList2, (Function1) objRememberedValue2, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Function2 function2, RhModalBottomSheet5 rhModalBottomSheet5, Function0 function0, UUID contractId) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            function2.invoke(contractId, Boolean.FALSE);
            rhModalBottomSheet5.hideBottomSheet(function0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ByContractSelector(final ImmutableList<FuturesDetailViewState.RelatedContract> immutableList, final Function1<? super UUID, Unit> function1, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(67569687);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(67569687, i3, -1, "com.robinhood.android.futures.detail.ui.ByContractSelector (ContractSelectorBottomSheet.kt:84)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 7, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            Title(C17042R.string.futures_detail_contract_selector_title, Column6.INSTANCE.align(companion, companion2.getCenterHorizontally()), composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.startReplaceGroup(-1006425750);
            if (immutableList != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
                for (final FuturesDetailViewState.RelatedContract relatedContract : immutableList) {
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    builder.append(relatedContract.getExpiration());
                    if (relatedContract.isActiveContractForProduct()) {
                        builder.append(PlaceholderUtils.XXShortPlaceholderText);
                        InlineTextContent2.appendInlineContent$default(builder, "activePill", null, 2, null);
                    }
                    BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(BentoSelectionRowState.Type.RadioButton, builder.toAnnotatedString(), relatedContract.isSelected(), (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(relatedContract.getSymbol()), false, true, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) extensions2.persistentMapOf(Tuples4.m3642to("activePill", activePillInlineContent(composerStartRestartGroup, 0))), (Function0) null, 1488, (DefaultConstructorMarker) null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(relatedContract);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.detail.ui.ContractSelectorBottomSheetKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ContractSelectorBottomSheet3.ByContractSelector$lambda$5$lambda$4$lambda$3$lambda$2(function1, relatedContract);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composerStartRestartGroup, BentoSelectionRowState.$stable << 3, 1);
                    arrayList.add(Unit.INSTANCE);
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.ContractSelectorBottomSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContractSelectorBottomSheet3.ByContractSelector$lambda$6(immutableList, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ByContractSelector$lambda$5$lambda$4$lambda$3$lambda$2(Function1 function1, FuturesDetailViewState.RelatedContract relatedContract) {
        function1.invoke(relatedContract.getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ByProductSelector(final ImmutableList<FuturesDetailViewState.RelatedContract> immutableList, final boolean z, final StringResource stringResource, final StringResource stringResource2, final Function2<? super UUID, ? super Boolean, Unit> function2, Composer composer, final int i) {
        final FuturesDetailViewState.RelatedContract relatedContract;
        FuturesDetailViewState.RelatedContract next;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1549943321);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(stringResource2) : composerStartRestartGroup.changedInstance(stringResource2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1549943321, i3, -1, "com.robinhood.android.futures.detail.ui.ByProductSelector (ContractSelectorBottomSheet.kt:129)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 7, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            Title(C17042R.string.futures_detail_contract_selector_title_v2, Column6.INSTANCE.align(companion, companion2.getCenterHorizontally()), composerStartRestartGroup, 0, 0);
            if (immutableList != null) {
                Iterator<FuturesDetailViewState.RelatedContract> it = immutableList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (next.isActiveContractForProduct()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                relatedContract = next;
            } else {
                relatedContract = null;
            }
            composerStartRestartGroup.startReplaceGroup(1667925434);
            if (relatedContract != null) {
                composerStartRestartGroup.startReplaceGroup(1667929273);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                int i4 = StringResource.$stable;
                builder.append(StringResources6.getTextAsString(stringResource, composerStartRestartGroup, ((i3 >> 6) & 14) | i4));
                builder.append(PlaceholderUtils.XXShortPlaceholderText);
                InlineTextContent2.appendInlineContent$default(builder, "activePill", null, 2, null);
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(BentoSelectionRowState.Type.RadioButton, annotatedString, relatedContract.isSelected() && z, (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(StringResources6.getTextAsString(stringResource2, composerStartRestartGroup, ((i3 >> 9) & 14) | i4)), false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) extensions2.persistentMapOf(Tuples4.m3642to("activePill", activePillInlineContent(composerStartRestartGroup, 0))), (Function0) null, 1488, (DefaultConstructorMarker) null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = ((i3 & 57344) == 16384) | composerStartRestartGroup.changedInstance(relatedContract);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.detail.ui.ContractSelectorBottomSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ContractSelectorBottomSheet3.ByProductSelector$lambda$14$lambda$10$lambda$9(function2, relatedContract);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composerStartRestartGroup, BentoSelectionRowState.$stable << 3, 1);
            }
            composerStartRestartGroup.endReplaceGroup();
            String strStringResource = StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_selector_title, composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5145paddingqDBjuR0(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 24576, 0, 8172);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(1667971663);
            if (immutableList != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
                for (final FuturesDetailViewState.RelatedContract relatedContract2 : immutableList) {
                    BentoSelectionRowState bentoSelectionRowState2 = new BentoSelectionRowState(BentoSelectionRowState.Type.RadioButton, relatedContract2.getExpiration(), relatedContract2.isSelected() && !z, (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(relatedContract2.getSymbol()), false, true, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2000, (DefaultConstructorMarker) null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = ((i3 & 57344) == 16384) | composerStartRestartGroup.changedInstance(relatedContract2);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.detail.ui.ContractSelectorBottomSheetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ContractSelectorBottomSheet3.ByProductSelector$lambda$14$lambda$13$lambda$12$lambda$11(function2, relatedContract2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState2, (Function0) objRememberedValue2, composerStartRestartGroup, BentoSelectionRowState.$stable << 3, 1);
                    arrayList.add(Unit.INSTANCE);
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.ContractSelectorBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContractSelectorBottomSheet3.ByProductSelector$lambda$15(immutableList, z, stringResource, stringResource2, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ByProductSelector$lambda$14$lambda$10$lambda$9(Function2 function2, FuturesDetailViewState.RelatedContract relatedContract) {
        function2.invoke(relatedContract.getId(), Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ByProductSelector$lambda$14$lambda$13$lambda$12$lambda$11(Function2 function2, FuturesDetailViewState.RelatedContract relatedContract) {
        function2.invoke(relatedContract.getId(), Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Title(final int i, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1160790912);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i4 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            } else {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1160790912, i4, -1, "com.robinhood.android.futures.detail.ui.Title (ContractSelectorBottomSheet.kt:198)");
                }
                String strStringResource = StringResources_androidKt.stringResource(i, composerStartRestartGroup, i4 & 14);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(modifier2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 5, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleSmall(), composer2, 0, 0, 8188);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.ContractSelectorBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ContractSelectorBottomSheet3.Title$lambda$16(i, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 48;
        modifier2 = modifier;
        if ((i4 & 19) != 18) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String strStringResource2 = StringResources_androidKt.stringResource(i, composerStartRestartGroup, i4 & 14);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifier32 = modifier2;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m5146paddingqDBjuR0$default(modifier2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 5, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleSmall(), composer2, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier32;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final InlineTextContent activePillInlineContent(Composer composer, int i) {
        composer.startReplaceGroup(331732292);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(331732292, i, -1, "com.robinhood.android.futures.detail.ui.activePillInlineContent (ContractSelectorBottomSheet.kt:211)");
        }
        InlineTextContent inlineTextContent = new InlineTextContent(new Placeholder(TextUnit2.getSp(150), TextUnit2.getSp(30), PlaceholderVerticalAlign.INSTANCE.m7577getCenterJ6kI3mc(), null), ContractSelectorBottomSheet.INSTANCE.getLambda$986698327$feature_futures_detail_externalDebug());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return inlineTextContent;
    }
}
