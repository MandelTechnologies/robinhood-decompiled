package com.robinhood.android.advisory.portfolio.update.donut;

import advisory.update_investor_profile.proto.p009v1.Direction;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
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
import com.robinhood.android.advisory.portfolio.PortfolioDonutChart;
import com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutData;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: UpdateInvestorProfileDonut.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\u001a\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000b²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002"}, m3636d2 = {"UpdateInvestorProfileDonutTag", "", "UpdateInvestorProfileDonut", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/advisory/portfolio/update/donut/UpdateInvestorProfileDonutData;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/portfolio/update/donut/UpdateInvestorProfileDonutData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "UpdateInvestorProfileDonutPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-advisory-portfolio_externalDebug", "activeSliceIndex", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class UpdateInvestorProfileDonut3 {
    public static final String UpdateInvestorProfileDonutTag = "update_investor_profile_donut";

    /* compiled from: UpdateInvestorProfileDonut.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.f20UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.DIRECTION_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Direction.FLAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateInvestorProfileDonut$lambda$9(UpdateInvestorProfileDonutData updateInvestorProfileDonutData, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UpdateInvestorProfileDonut(updateInvestorProfileDonutData, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateInvestorProfileDonutPreview$lambda$10(int i, Composer composer, int i2) {
        UpdateInvestorProfileDonutPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015a A[LOOP:0: B:80:0x0154->B:82:0x015a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UpdateInvestorProfileDonut(final UpdateInvestorProfileDonutData data, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        boolean z;
        Object objRememberedValue;
        UpdateInvestorProfileDonutData.Slice slice;
        final String defaultPrimaryText;
        String secondaryText;
        final String defaultSecondaryText;
        int i4;
        final long jM21426getFg20d7_KjU;
        Iterator<UpdateInvestorProfileDonutData.Slice> it;
        boolean zChanged;
        Object objRememberedValue2;
        boolean zChanged2;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1123187783);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1123187783, i3, -1, "com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonut (UpdateInvestorProfileDonut.kt:30)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 14) != 4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Integer numUpdateInvestorProfileDonut$lambda$1 = UpdateInvestorProfileDonut$lambda$1(snapshotState);
                slice = numUpdateInvestorProfileDonut$lambda$1 == null ? (UpdateInvestorProfileDonutData.Slice) CollectionsKt.getOrNull(data.getSlices(), numUpdateInvestorProfileDonut$lambda$1.intValue()) : null;
                if (slice != null || (defaultPrimaryText = slice.getPrimaryText()) == null) {
                    defaultPrimaryText = data.getDefaultPrimaryText();
                }
                secondaryText = slice == null ? slice.getSecondaryText() : null;
                if (secondaryText == null && secondaryText.length() != 0) {
                    defaultSecondaryText = slice.getSecondaryText();
                } else {
                    defaultSecondaryText = data.getDefaultSecondaryText();
                }
                Direction direction = slice != null ? slice.getDirection() : null;
                i4 = direction != null ? -1 : WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
                if (i4 == -1) {
                    composerStartRestartGroup.startReplaceGroup(-1346642212);
                    jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                    ImmutableList<UpdateInvestorProfileDonutData.Slice> slices = data.getSlices();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(slices, 10));
                    it = slices.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Float.valueOf(it.next().getAllocationPercentage()));
                    }
                    ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
                    Modifier modifierTestTag = TestTag3.testTag(modifier3, UpdateInvestorProfileDonutTag);
                    Integer numUpdateInvestorProfileDonut$lambda$12 = UpdateInvestorProfileDonut$lambda$1(snapshotState);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(snapshotState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return UpdateInvestorProfileDonut3.UpdateInvestorProfileDonut$lambda$6$lambda$5(snapshotState, ((Integer) obj).intValue());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function1 = (Function1) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged2 = composerStartRestartGroup.changed(snapshotState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return UpdateInvestorProfileDonut3.UpdateInvestorProfileDonut$lambda$8$lambda$7(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    PortfolioDonutChart.PortfolioDonutChart(persistentList, function1, modifierTestTag, false, numUpdateInvestorProfileDonut$lambda$12, false, (Function0) objRememberedValue3, ComposableLambda3.rememberComposableLambda(-302435938, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutKt.UpdateInvestorProfileDonut.4
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                            invoke(boxScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope PortfolioDonutChart, Composer composer2, int i6) {
                            Intrinsics.checkNotNullParameter(PortfolioDonutChart, "$this$PortfolioDonutChart");
                            if ((i6 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-302435938, i6, -1, "com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonut.<anonymous> (UpdateInvestorProfileDonut.kt:63)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            String str = defaultPrimaryText;
                            String str2 = defaultSecondaryText;
                            long j = jM21426getFg20d7_KjU;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                            TextStyle textS = bentoTheme.getTypography(composer2, i7).getTextS();
                            FontWeight bold = FontWeight.INSTANCE.getBold();
                            TextAlign.Companion companion2 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, bold, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textS, composer2, 24576, 0, 8106);
                            BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(j), null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 0, 0, 8122);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 40);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i4 == 1) {
                        composerStartRestartGroup.startReplaceGroup(-1346647775);
                        jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i4 == 2) {
                        composerStartRestartGroup.startReplaceGroup(-1346646079);
                        jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21452getNegative0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i4 != 3 && i4 != 4) {
                            composerStartRestartGroup.startReplaceGroup(-1346649894);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1346642212);
                        jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    ImmutableList<UpdateInvestorProfileDonutData.Slice> slices2 = data.getSlices();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(slices2, 10));
                    it = slices2.iterator();
                    while (it.hasNext()) {
                    }
                    ImmutableList3 persistentList2 = extensions2.toPersistentList(arrayList2);
                    Modifier modifierTestTag2 = TestTag3.testTag(modifier3, UpdateInvestorProfileDonutTag);
                    Integer numUpdateInvestorProfileDonut$lambda$122 = UpdateInvestorProfileDonut$lambda$1(snapshotState);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(snapshotState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return UpdateInvestorProfileDonut3.UpdateInvestorProfileDonut$lambda$6$lambda$5(snapshotState, ((Integer) obj).intValue());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        Function1 function12 = (Function1) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged2 = composerStartRestartGroup.changed(snapshotState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return UpdateInvestorProfileDonut3.UpdateInvestorProfileDonut$lambda$8$lambda$7(snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            PortfolioDonutChart.PortfolioDonutChart(persistentList2, function12, modifierTestTag2, false, numUpdateInvestorProfileDonut$lambda$122, false, (Function0) objRememberedValue3, ComposableLambda3.rememberComposableLambda(-302435938, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutKt.UpdateInvestorProfileDonut.4
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                                    invoke(boxScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxScope PortfolioDonutChart, Composer composer2, int i6) {
                                    Intrinsics.checkNotNullParameter(PortfolioDonutChart, "$this$PortfolioDonutChart");
                                    if ((i6 & 17) == 16 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-302435938, i6, -1, "com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonut.<anonymous> (UpdateInvestorProfileDonut.kt:63)");
                                    }
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    String str = defaultPrimaryText;
                                    String str2 = defaultSecondaryText;
                                    long j = jM21426getFg20d7_KjU;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i7 = BentoTheme.$stable;
                                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                                    TextStyle textS = bentoTheme.getTypography(composer2, i7).getTextS();
                                    FontWeight bold = FontWeight.INSTANCE.getBold();
                                    TextAlign.Companion companion2 = TextAlign.INSTANCE;
                                    BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, bold, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textS, composer2, 24576, 0, 8106);
                                    BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(j), null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 0, 0, 8122);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 40);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UpdateInvestorProfileDonut3.UpdateInvestorProfileDonut$lambda$9(data, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 14) != 4) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Integer numUpdateInvestorProfileDonut$lambda$13 = UpdateInvestorProfileDonut$lambda$1(snapshotState2);
                if (numUpdateInvestorProfileDonut$lambda$13 == null) {
                }
                if (slice != null) {
                    defaultPrimaryText = data.getDefaultPrimaryText();
                    if (slice == null) {
                    }
                    if (secondaryText == null) {
                        defaultSecondaryText = data.getDefaultSecondaryText();
                        if (slice != null) {
                        }
                        if (direction != null) {
                        }
                        if (i4 == -1) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateInvestorProfileDonut$lambda$6$lambda$5(SnapshotState snapshotState, int i) {
        snapshotState.setValue(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateInvestorProfileDonut$lambda$8$lambda$7(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    private static final Integer UpdateInvestorProfileDonut$lambda$1(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue();
    }

    private static final void UpdateInvestorProfileDonutPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1137689214);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1137689214, i, -1, "com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutPreview (UpdateInvestorProfileDonut.kt:87)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, UpdateInvestorProfileDonut.INSTANCE.m11186getLambda$1174500662$feature_advisory_portfolio_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdateInvestorProfileDonut3.UpdateInvestorProfileDonutPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
