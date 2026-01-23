package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.sorting;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.RippleKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.sorting.InvestingMonitorSortButton;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.p320db.CuratedList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: InvestingMonitorSortButton.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aR\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"InvestingMonitorSortButton", "", "currentButtonSortType", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/sorting/InvestingMonitorSortType;", "curatedList", "Lcom/robinhood/models/db/CuratedList;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "selectedSortType", "(Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/sorting/InvestingMonitorSortType;Lcom/robinhood/models/db/CuratedList;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-investing-monitor_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.sorting.InvestingMonitorSortButtonKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class InvestingMonitorSortButton {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorSortButton$lambda$0(InvestingMonitorSortType investingMonitorSortType, CuratedList curatedList, Arrangement.Horizontal horizontal, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        InvestingMonitorSortButton(investingMonitorSortType, curatedList, horizontal, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestingMonitorSortButton(final InvestingMonitorSortType currentButtonSortType, final CuratedList curatedList, final Arrangement.Horizontal horizontalArrangement, Modifier modifier, final Function1<? super InvestingMonitorSortType, Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currentButtonSortType, "currentButtonSortType");
        Intrinsics.checkNotNullParameter(curatedList, "curatedList");
        Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1427404764);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(currentButtonSortType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(curatedList) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontalArrangement) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onClick) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1427404764, i3, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.sorting.InvestingMonitorSortButton (InvestingMonitorSortButton.kt:36)");
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                String analyticsName = currentButtonSortType.getAnalyticsName();
                String lowerCase = curatedList.getChildSortDirection().getServerValue().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, "SortRowButton-" + analyticsName + "-" + lowerCase, null, null, null, null, null, 62, null);
                boolean z = curatedList.getChildSortOrder() != currentButtonSortType.getSortOrder();
                BentoIcon4.Size16 size16 = null;
                if (!currentButtonSortType.getNoIcon()) {
                    if (!z) {
                        size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.THUMBPRINT_16);
                    } else if (curatedList.getChildSortOrder() == ApiCuratedList.SortOrder.CUSTOM) {
                        size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.OPTIONS_FLAT_24);
                    } else if (curatedList.getChildSortDirection() == ApiCuratedList.SortDirection.ASCENDING) {
                        size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.ARROW_UP_12);
                    } else if (curatedList.getChildSortDirection() == ApiCuratedList.SortDirection.DESCENDING) {
                        size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.ARROW_DOWN_12);
                    }
                }
                modifier3 = modifier2;
                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorCopy$default, ComposableLambda3.rememberComposableLambda(574566791, true, new C266141(modifier3, currentButtonSortType, onClick, horizontalArrangement, z, size16), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.sorting.InvestingMonitorSortButtonKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestingMonitorSortButton.InvestingMonitorSortButton$lambda$0(currentButtonSortType, curatedList, horizontalArrangement, modifier3, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            String analyticsName2 = currentButtonSortType.getAnalyticsName();
            String lowerCase2 = curatedList.getChildSortDirection().getServerValue().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default2 = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, "SortRowButton-" + analyticsName2 + "-" + lowerCase2, null, null, null, null, null, 62, null);
            if (curatedList.getChildSortOrder() != currentButtonSortType.getSortOrder()) {
            }
            BentoIcon4.Size16 size162 = null;
            if (!currentButtonSortType.getNoIcon()) {
            }
            modifier3 = modifier2;
            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorCopy$default2, ComposableLambda3.rememberComposableLambda(574566791, true, new C266141(modifier3, currentButtonSortType, onClick, horizontalArrangement, z, size162), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: InvestingMonitorSortButton.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.sorting.InvestingMonitorSortButtonKt$InvestingMonitorSortButton$1 */
    static final class C266141 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ InvestingMonitorSortType $currentButtonSortType;
        final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
        final /* synthetic */ BentoIcon4.Size16 $icon;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<InvestingMonitorSortType, Unit> $onClick;
        final /* synthetic */ boolean $selected;

        /* JADX WARN: Multi-variable type inference failed */
        C266141(Modifier modifier, InvestingMonitorSortType investingMonitorSortType, Function1<? super InvestingMonitorSortType, Unit> function1, Arrangement.Horizontal horizontal, boolean z, BentoIcon4.Size16 size16) {
            this.$modifier = modifier;
            this.$currentButtonSortType = investingMonitorSortType;
            this.$onClick = function1;
            this.$horizontalArrangement = horizontal;
            this.$selected = z;
            this.$icon = size16;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(InvestingMonitorSortType investingMonitorSortType, Function1 function1) {
            if (investingMonitorSortType != InvestingMonitorSortType.CHART) {
                function1.invoke(investingMonitorSortType);
            }
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            long jM21427getFg30d7_KjU;
            long jM21427getFg30d7_KjU2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(574566791, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.sorting.InvestingMonitorSortButton.<anonymous> (InvestingMonitorSortButton.kt:75)");
            }
            Modifier modifier = this.$modifier;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSource2.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
            composer.endReplaceGroup();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            IndicationNodeFactory indicationNodeFactoryM5937rippleH2RKhps$default = RippleKt.m5937rippleH2RKhps$default(true, 0.0f, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), 2, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$currentButtonSortType.ordinal()) | composer.changed(this.$onClick);
            final InvestingMonitorSortType investingMonitorSortType = this.$currentButtonSortType;
            final Function1<InvestingMonitorSortType, Unit> function1 = this.$onClick;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.sorting.InvestingMonitorSortButtonKt$InvestingMonitorSortButton$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InvestingMonitorSortButton.C266141.invoke$lambda$2$lambda$1(investingMonitorSortType, function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(ClickableKt.m4891clickableO2vRcR0$default(modifier, interactionSource3, indicationNodeFactoryM5937rippleH2RKhps$default, false, null, null, (Function0) objRememberedValue2, 28, null), null, true, false, false, true, false, null, 109, null), 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 5, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontal = this.$horizontalArrangement;
            InvestingMonitorSortType investingMonitorSortType2 = this.$currentButtonSortType;
            boolean z = this.$selected;
            BentoIcon4.Size16 size16 = this.$icon;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontal, centerVertically, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(StringResources_androidKt.stringResource(investingMonitorSortType2.getLabel(), composer, 0), Arrays.copyOf(new Object[0], 0));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
            if (z) {
                composer.startReplaceGroup(1605566213);
                jM21427getFg30d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            } else {
                composer.startReplaceGroup(1605567046);
                jM21427getFg30d7_KjU = bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU();
            }
            composer.endReplaceGroup();
            FontWeight.Companion companion3 = FontWeight.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, z ? companion3.getBold() : companion3.getNormal(), null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, textS, composer, 12582912, 0, 8042);
            composer.startReplaceGroup(1605572646);
            if (size16 != null) {
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
                if (z) {
                    composer.startReplaceGroup(1605580709);
                    jM21427getFg30d7_KjU2 = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                } else {
                    composer.startReplaceGroup(1605581542);
                    jM21427getFg30d7_KjU2 = bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU();
                }
                composer.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(size16, null, jM21427getFg30d7_KjU2, null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
