package com.robinhood.shared.discovery.sdui;

import android.os.Parcelable;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridSpan;
import androidx.compose.foundation.lazy.grid.LazyGridSpan2;
import androidx.compose.foundation.lazy.grid.LazyGridSpan3;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.C20692R;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiMarkdownText2;
import com.robinhood.android.sdui.annotations.SduiComposable;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.FeatureDiscovery;
import com.robinhood.models.serverdriven.experimental.api.FeatureDiscoveryContainerStyle;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiFeatureDiscovery.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aE\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\f\"\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0010X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0010X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0010X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0010X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\tX\u008a\u008e\u0002"}, m3636d2 = {"SduiFeatureDiscovery", "", "ActionT", "Landroid/os/Parcelable;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/serverdriven/experimental/api/FeatureDiscovery;", "modifier", "Landroidx/compose/ui/Modifier;", "isExpanded", "", "callback", "Lcom/robinhood/shared/discovery/sdui/FeatureDiscoveryCallback;", "(Lcom/robinhood/models/serverdriven/experimental/api/FeatureDiscovery;Landroidx/compose/ui/Modifier;ZLcom/robinhood/shared/discovery/sdui/FeatureDiscoveryCallback;Landroidx/compose/runtime/Composer;II)V", "sduiFeatureGridMaxItem", "", "GRID_TAG", "", "LIST_TAG", "CAROUSEL_TAG", "INFO_TAG", "SHOW_MORE_TAG", "lib-discovery-sdui_externalDebug", "showMore"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.discovery.sdui.SduiFeatureDiscoveryKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SduiFeatureDiscovery3 {
    public static final String CAROUSEL_TAG = "carousel";
    public static final String GRID_TAG = "grid";
    public static final String INFO_TAG = "info";
    public static final String LIST_TAG = "list";
    public static final String SHOW_MORE_TAG = "show_more";
    private static final int sduiFeatureGridMaxItem = 4;

    /* compiled from: SduiFeatureDiscovery.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.discovery.sdui.SduiFeatureDiscoveryKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeatureDiscoveryContainerStyle.values().length];
            try {
                iArr[FeatureDiscoveryContainerStyle.GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeatureDiscoveryContainerStyle.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiFeatureDiscovery$lambda$14(FeatureDiscovery featureDiscovery, Modifier modifier, boolean z, SduiFeatureDiscovery2 sduiFeatureDiscovery2, int i, int i2, Composer composer, int i3) {
        SduiFeatureDiscovery(featureDiscovery, modifier, z, sduiFeatureDiscovery2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0c69  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0d06  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0d15  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01eb  */
    @SduiComposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiFeatureDiscovery(final FeatureDiscovery<? extends ActionT> data, Modifier modifier, boolean z, SduiFeatureDiscovery2 sduiFeatureDiscovery2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Object objRememberedValue;
        Composer.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue2;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Modifier.Companion companion2;
        Modifier modifier3;
        int i6;
        Modifier modifier4;
        final Modifier modifier5;
        final boolean z3;
        int i7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        SduiFeatureDiscovery2 sduiFeatureDiscovery22 = sduiFeatureDiscovery2;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(770501315);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(sduiFeatureDiscovery22) : composerStartRestartGroup.changedInstance(sduiFeatureDiscovery22) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier5 = modifier2;
                    z3 = z2;
                } else {
                    Modifier modifier6 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z4 = i4 == 0 ? false : z2;
                    if (i5 != 0) {
                        sduiFeatureDiscovery22 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(770501315, i3, -1, "com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery (SduiFeatureDiscovery.kt:61)");
                    }
                    float fM7995constructorimpl = data.getTitle().getStyle() != TextStyle.DISPLAY_MEDIUM ? C2002Dp.m7995constructorimpl(24) : C2002Dp.m7995constructorimpl(16);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(!z4), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier6);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion5, 0.0f, composerStartRestartGroup, 6, 1);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, (InteractionSource3) objRememberedValue2, null, false, null, null, SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), data.getDisclosure_action()), 28, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default);
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    int i9 = 0;
                    SduiMarkdownText2.SduiMarkdownText(data.getTitle(), null, null, 0, 0, composerStartRestartGroup, 0, 30);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(-1508663141);
                    if (data.getDisclosure_action() == null) {
                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                        String strStringResource = StringResources_androidKt.stringResource(C20692R.string.feature_discovery_disclosure_description, composerStartRestartGroup, 0);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i10 = BentoTheme.$stable;
                        long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i10).m21426getFg20d7_KjU();
                        companion2 = companion5;
                        Modifier modifierTestTag = TestTag3.testTag(SizeKt.m5169size3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), fM7995constructorimpl), INFO_TAG);
                        modifier3 = modifier6;
                        BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21426getFg20d7_KjU, modifierTestTag, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable, 48);
                        composerStartRestartGroup = composerStartRestartGroup;
                    } else {
                        companion2 = companion5;
                        modifier3 = modifier6;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    FeatureDiscoveryContainerStyle style = data.getStyle();
                    i6 = style != null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
                    if (i6 != 1) {
                        modifier4 = modifier3;
                        composerStartRestartGroup.startReplaceGroup(-620039458);
                        Modifier modifierTestTag2 = TestTag3.testTag(PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.m5157heightInVpY3zN4(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), C2002Dp.m7995constructorimpl(0), C2002Dp.m7995constructorimpl(400)), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2), GRID_TAG);
                        GridCells.Fixed fixed = new GridCells.Fixed(2);
                        float f = 10;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(f));
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(f));
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(data);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.discovery.sdui.SduiFeatureDiscoveryKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SduiFeatureDiscovery3.SduiFeatureDiscovery$lambda$13$lambda$8$lambda$7(data, (LazyGridScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer2 = composerStartRestartGroup;
                        LazyGridDslKt.LazyVerticalGrid(fixed, modifierTestTag2, null, null, false, horizontalOrVerticalM5089spacedBy0680j_42, horizontalOrVerticalM5089spacedBy0680j_4, null, false, null, (Function1) objRememberedValue3, composer2, 1769472, 0, 924);
                        composerStartRestartGroup = composer2;
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                    } else if (i6 != 2) {
                        composerStartRestartGroup.startReplaceGroup(-613430506);
                        Modifier modifierTestTag3 = TestTag3.testTag(PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(ScrollKt.horizontalScroll$default(companion2, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 1, null), C2002Dp.m7995constructorimpl(12), 0.0f, composerStartRestartGroup, 48, 2), CAROUSEL_TAG);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(8)), companion3.getTop(), composerStartRestartGroup, 6);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag3);
                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                        int size = data.getFeatures().size();
                        composerStartRestartGroup.startReplaceGroup(1858795844);
                        int i11 = 0;
                        for (Object obj : data.getFeatures()) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            final UIComponent uIComponent = (UIComponent) obj;
                            Context eventContext = AutoLoggingCompositionLocals3.INSTANCE.getEventContext(composerStartRestartGroup, AutoLoggingCompositionLocals3.$stable);
                            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, Context.copy$default(eventContext == null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null) : eventContext, i12, size, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, -1, -1, -1, -1, -1, 16383, null), null, null, 55, null), ComposableLambda3.rememberComposableLambda(-479878639, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.discovery.sdui.SduiFeatureDiscoveryKt$SduiFeatureDiscovery$1$5$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i13) {
                                    if ((i13 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-479878639, i13, -1, "com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SduiFeatureDiscovery.kt:239)");
                                    }
                                    SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer3, 0);
                                    final UIComponent<ActionT> uIComponent2 = uIComponent;
                                    SduiActionHandler3.ProvideActionHandler(sduiActionHandlerCurrentActionHandler, ComposableLambda3.rememberComposableLambda(1169292402, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.discovery.sdui.SduiFeatureDiscoveryKt$SduiFeatureDiscovery$1$5$1$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i14) {
                                            if ((i14 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1169292402, i14, -1, "com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SduiFeatureDiscovery.kt:240)");
                                            }
                                            SduiComponent3.SduiComponent(uIComponent2, null, null, composer4, 0, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                            i11 = i12;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-618254230);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i13 = BentoTheme.$stable;
                        modifier4 = modifier3;
                        Modifier modifierTestTag4 = TestTag3.testTag(AnimationModifier.animateContentSize$default(PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composerStartRestartGroup, i13).m21590getDefaultD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2), AnimationSpecKt.tween$default(400, 0, null, 6, null), null, 2, null), "list");
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i13).m21593getSmallD9Ej5fM()), companion3.getStart(), composerStartRestartGroup, 0);
                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag4);
                        Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
                        int size2 = data.getFeatures().size();
                        Integer show_more_cutoff = data.getShow_more_cutoff();
                        int iIntValue = show_more_cutoff != null ? show_more_cutoff.intValue() : 0;
                        composerStartRestartGroup.startReplaceGroup(21881948);
                        for (Object obj2 : data.getFeatures()) {
                            int i14 = i9 + 1;
                            if (i9 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            final UIComponent uIComponent2 = (UIComponent) obj2;
                            if (i9 < iIntValue || !SduiFeatureDiscovery$lambda$1(snapshotState) || iIntValue == 0) {
                                Context eventContext2 = AutoLoggingCompositionLocals3.INSTANCE.getEventContext(composerStartRestartGroup, AutoLoggingCompositionLocals3.$stable);
                                Context context = eventContext2 == null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null) : eventContext2;
                                i7 = size2;
                                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, Context.copy$default(context, i14, size2, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, -1, -1, -1, -1, -1, 16383, null), null, null, 55, null), ComposableLambda3.rememberComposableLambda(2017191107, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.discovery.sdui.SduiFeatureDiscoveryKt$SduiFeatureDiscovery$1$4$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i15) {
                                        if ((i15 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2017191107, i15, -1, "com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SduiFeatureDiscovery.kt:153)");
                                        }
                                        SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer3, 0);
                                        final UIComponent<ActionT> uIComponent3 = uIComponent2;
                                        SduiActionHandler3.ProvideActionHandler(sduiActionHandlerCurrentActionHandler, ComposableLambda3.rememberComposableLambda(1023900132, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.discovery.sdui.SduiFeatureDiscoveryKt$SduiFeatureDiscovery$1$4$1$1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i16) {
                                                if ((i16 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1023900132, i16, -1, "com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SduiFeatureDiscovery.kt:154)");
                                                }
                                                SduiComponent3.SduiComponent(uIComponent3, null, null, composer4, 0, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                            } else {
                                i7 = size2;
                            }
                            size2 = i7;
                            i9 = i14;
                        }
                        int i15 = size2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(21912272);
                        if (iIntValue != 0 && iIntValue < i15) {
                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, SduiFeatureDiscovery$lambda$1(snapshotState) ? "feature_discovery-show_more" : "feature_discovery-show_less", null, 4, null), null, 47, null);
                            if (SduiFeatureDiscovery$lambda$1(snapshotState)) {
                                composerStartRestartGroup.startReplaceGroup(679839209);
                                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(772450545, true, new SduiFeatureDiscovery7(sduiFeatureDiscovery22, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                composerStartRestartGroup.startReplaceGroup(681250763);
                                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-2095870214, true, new SduiFeatureDiscovery8(sduiFeatureDiscovery22, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit3 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    z3 = z4;
                }
                final SduiFeatureDiscovery2 sduiFeatureDiscovery23 = sduiFeatureDiscovery22;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.discovery.sdui.SduiFeatureDiscoveryKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            return SduiFeatureDiscovery3.SduiFeatureDiscovery$lambda$14(data, modifier5, z3, sduiFeatureDiscovery23, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((i3 & 1171) == 1170) {
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (data.getTitle().getStyle() != TextStyle.DISPLAY_MEDIUM) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion32 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion32.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier6);
                ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor5 = companion42.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion42.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion42.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion42.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion52 = Modifier.INSTANCE;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion52, 0.0f, composerStartRestartGroup, 6, 1);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ2, (InteractionSource3) objRememberedValue2, null, false, null, null, SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), data.getDisclosure_action()), 28, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion32.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default2);
                    Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy3, companion42.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion42.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        int i92 = 0;
                        SduiMarkdownText2.SduiMarkdownText(data.getTitle(), null, null, 0, 0, composerStartRestartGroup, 0, 30);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.startReplaceGroup(-1508663141);
                        if (data.getDisclosure_action() == null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        FeatureDiscoveryContainerStyle style2 = data.getStyle();
                        if (style2 != null) {
                        }
                        if (i6 != 1) {
                        }
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier5 = modifier4;
                        z3 = z4;
                    }
                }
            }
            final SduiFeatureDiscovery2 sduiFeatureDiscovery232 = sduiFeatureDiscovery22;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        final SduiFeatureDiscovery2 sduiFeatureDiscovery2322 = sduiFeatureDiscovery22;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SduiFeatureDiscovery$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SduiFeatureDiscovery$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiFeatureDiscovery$lambda$13$lambda$8$lambda$7(FeatureDiscovery featureDiscovery, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final int size = featureDiscovery.getFeatures().size();
        final int i = 0;
        for (Object obj : featureDiscovery.getFeatures()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final UIComponent uIComponent = (UIComponent) obj;
            LazyGridScope.item$default(LazyVerticalGrid, null, new Function1() { // from class: com.robinhood.shared.discovery.sdui.SduiFeatureDiscoveryKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SduiFeatureDiscovery3.m2807x200fccb8((LazyGridSpan2) obj2);
                }
            }, null, ComposableLambda3.composableLambdaInstance(-1202435401, true, new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.discovery.sdui.SduiFeatureDiscoveryKt$SduiFeatureDiscovery$1$3$1$1$2
                public final void invoke(LazyGridItemScope item, Composer composer, int i3) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1202435401, i3, -1, "com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SduiFeatureDiscovery.kt:111)");
                    }
                    Context eventContext = AutoLoggingCompositionLocals3.INSTANCE.getEventContext(composer, AutoLoggingCompositionLocals3.$stable);
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, null, null, Context.copy$default(eventContext == null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null) : eventContext, i + 1, size, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, -1, -1, -1, -1, -1, 16383, null), null, null, 55, null);
                    if (i < 4) {
                        final UIComponent<ActionT> uIComponent2 = uIComponent;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-1600489789, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.discovery.sdui.SduiFeatureDiscoveryKt$SduiFeatureDiscovery$1$3$1$1$2$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i4) {
                                if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1600489789, i4, -1, "com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SduiFeatureDiscovery.kt:120)");
                                }
                                SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer2, 0);
                                final UIComponent<ActionT> uIComponent3 = uIComponent2;
                                SduiActionHandler3.ProvideActionHandler(sduiActionHandlerCurrentActionHandler, ComposableLambda3.rememberComposableLambda(2044297474, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.discovery.sdui.SduiFeatureDiscoveryKt$SduiFeatureDiscovery$1$3$1$1$2$1$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i5) {
                                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2044297474, i5, -1, "com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SduiFeatureDiscovery.kt:121)");
                                        }
                                        SduiComponent3.SduiComponent(uIComponent3, null, null, composer3, 0, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 48);
                        composer.endNode();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
                    invoke(lazyGridItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }
            }), 5, null);
            i = i2;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SduiFeatureDiscovery$lambda$13$lambda$8$lambda$7$lambda$6$lambda$5 */
    public static final LazyGridSpan m2807x200fccb8(LazyGridSpan2 item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        return LazyGridSpan.m5218boximpl(LazyGridSpan3.GridItemSpan(1));
    }
}
