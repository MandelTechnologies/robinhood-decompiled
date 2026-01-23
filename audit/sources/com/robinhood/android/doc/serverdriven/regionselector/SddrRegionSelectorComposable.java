package com.robinhood.android.doc.serverdriven.regionselector;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
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
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoFlagIcon;
import com.robinhood.compose.bento.component.BentoRadioButton2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SddrRegionSelectorComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u000b\u001a\u00020\bX\u008a\u008e\u0002"}, m3636d2 = {"SddrRegionSelectorComposable", "", "selected", "Lcom/robinhood/iso/countrycode/CountryCode;", "options", "Lkotlinx/collections/immutable/ImmutableList;", "onSearchChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "query", "onOptionSelected", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "onDone", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/iso/countrycode/CountryCode;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-doc-upload_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SddrRegionSelectorComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SddrRegionSelectorComposable$lambda$11(CountryCode countryCode, ImmutableList immutableList, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SddrRegionSelectorComposable(countryCode, immutableList, function1, function12, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SddrRegionSelectorComposable(CountryCode countryCode, final ImmutableList<? extends CountryCode> options, final Function1<? super String, Unit> onSearchChanged, final Function1<? super CountryCode, Unit> onOptionSelected, final Function0<Unit> onDone, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue2;
        final CountryCode countryCode2;
        boolean zChangedInstance;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onSearchChanged, "onSearchChanged");
        Intrinsics.checkNotNullParameter(onOptionSelected, "onOptionSelected");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Composer composerStartRestartGroup = composer.startRestartGroup(199841898);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(countryCode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(options) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSearchChanged) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOptionSelected) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDone) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(199841898, i3, -1, "com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposable (SddrRegionSelectorComposable.kt:38)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                int i5 = i3;
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SddrRegionSelectorComposable.SddrRegionSelectorComposable$lambda$10$lambda$1$lambda$0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                String strSddrRegionSelectorComposable$lambda$10$lambda$2 = SddrRegionSelectorComposable$lambda$10$lambda$2(snapshotState);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_search, composerStartRestartGroup, 0);
                BentoTextInput8.Icon.Size24 size24 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_24, null, null, 6, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(snapshotState) | ((i5 & 896) != 256);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SddrRegionSelectorComposable.SddrRegionSelectorComposable$lambda$10$lambda$5$lambda$4(onSearchChanged, snapshotState, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTextInput4.BentoTextInput(strSddrRegionSelectorComposable$lambda$10$lambda$2, (Function1) objRememberedValue2, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, strStringResource, null, null, size24, null, null, null, null, null, false, false, composerStartRestartGroup, BentoTextInput8.Icon.Size24.$stable << 21, 0, 32616);
                Modifier modifierWeight$default = Column5.weight$default(column6, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                countryCode2 = countryCode;
                zChangedInstance = composerStartRestartGroup.changedInstance(options) | composerStartRestartGroup.changedInstance(countryCode2) | ((i5 & 7168) != 2048);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SddrRegionSelectorComposable.SddrRegionSelectorComposable$lambda$10$lambda$9$lambda$8(options, countryCode2, onOptionSelected, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                LazyDslKt.LazyColumn(modifierWeight$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue3, composerStartRestartGroup, 0, 510);
                BentoButtonKt.m20586BentoButtonEikTQX8(onDone, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0), PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), null, null, countryCode2 == null, false, null, null, null, null, false, null, composerStartRestartGroup, (i5 >> 12) & 14, 0, 8152);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                countryCode2 = countryCode;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final CountryCode countryCode3 = countryCode2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SddrRegionSelectorComposable.SddrRegionSelectorComposable$lambda$11(countryCode3, options, onSearchChanged, onOptionSelected, onDone, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
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
                int i52 = i3;
                Object[] objArr2 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                String strSddrRegionSelectorComposable$lambda$10$lambda$22 = SddrRegionSelectorComposable$lambda$10$lambda$2(snapshotState);
                Modifier.Companion companion32 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2 = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_action_search, composerStartRestartGroup, 0);
                BentoTextInput8.Icon.Size24 size242 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_24, null, null, 6, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(snapshotState) | ((i52 & 896) != 256);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SddrRegionSelectorComposable.SddrRegionSelectorComposable$lambda$10$lambda$5$lambda$4(onSearchChanged, snapshotState, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTextInput4.BentoTextInput(strSddrRegionSelectorComposable$lambda$10$lambda$22, (Function1) objRememberedValue2, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2, null, strStringResource2, null, null, size242, null, null, null, null, null, false, false, composerStartRestartGroup, BentoTextInput8.Icon.Size24.$stable << 21, 0, 32616);
                    Modifier modifierWeight$default2 = Column5.weight$default(column62, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    countryCode2 = countryCode;
                    zChangedInstance = composerStartRestartGroup.changedInstance(options) | composerStartRestartGroup.changedInstance(countryCode2) | ((i52 & 7168) != 2048);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SddrRegionSelectorComposable.SddrRegionSelectorComposable$lambda$10$lambda$9$lambda$8(options, countryCode2, onOptionSelected, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        LazyDslKt.LazyColumn(modifierWeight$default2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue3, composerStartRestartGroup, 0, 510);
                        BentoButtonKt.m20586BentoButtonEikTQX8(onDone, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0), PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM()), null, null, countryCode2 == null, false, null, null, null, null, false, null, composerStartRestartGroup, (i52 >> 12) & 14, 0, 8152);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState SddrRegionSelectorComposable$lambda$10$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SddrRegionSelectorComposable$lambda$10$lambda$5$lambda$4(Function1 function1, SnapshotState snapshotState, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        snapshotState.setValue(text);
        function1.invoke(text);
        return Unit.INSTANCE;
    }

    private static final String SddrRegionSelectorComposable$lambda$10$lambda$2(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SddrRegionSelectorComposable$lambda$10$lambda$9$lambda$8(final ImmutableList immutableList, final CountryCode countryCode, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final C14305x142c635f c14305x142c635f = new Function1() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposableKt$SddrRegionSelectorComposable$lambda$10$lambda$9$lambda$8$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(CountryCode countryCode2) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((CountryCode) obj);
            }
        };
        LazyColumn.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposableKt$SddrRegionSelectorComposable$lambda$10$lambda$9$lambda$8$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c14305x142c635f.invoke(immutableList.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposableKt$SddrRegionSelectorComposable$lambda$10$lambda$9$lambda$8$$inlined$items$default$4
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
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final CountryCode countryCode2 = (CountryCode) immutableList.get(i);
                composer.startReplaceGroup(-2014840810);
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean zAreEqual = Intrinsics.areEqual(countryCode, countryCode2);
                Role roleM7472boximpl = Role.m7472boximpl(Role.INSTANCE.m7484getRadioButtono7Vup1c());
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(countryCode2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposableKt$SddrRegionSelectorComposable$1$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(countryCode2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierM5316selectableXHw0xAI$default = Selectable3.m5316selectableXHw0xAI$default(companion, zAreEqual, false, roleM7472boximpl, (Function0) objRememberedValue, 2, null);
                final CountryCode countryCode3 = countryCode;
                BentoBaseRowLayout.BentoBaseRowLayout(modifierM5316selectableXHw0xAI$default, null, ComposableLambda3.rememberComposableLambda(-470033554, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposableKt$SddrRegionSelectorComposable$1$2$1$1$2
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
                            ComposerKt.traceEventStart(-470033554, i4, -1, "com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SddrRegionSelectorComposable.kt:68)");
                        }
                        BentoRadioButton2.BentoRadioButton(Intrinsics.areEqual(countryCode3, countryCode2), null, false, composer2, 0, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), ComposableLambda3.rememberComposableLambda(-603737617, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposableKt$SddrRegionSelectorComposable$1$2$1$1$3
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
                            ComposerKt.traceEventStart(-603737617, i4, -1, "com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SddrRegionSelectorComposable.kt:71)");
                        }
                        BentoText2.m20747BentoText38GnDrw(CountryCode.getDisplayCountry$default(countryCode2, null, 1, null), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), null, null, ComposableLambda3.rememberComposableLambda(-1004849806, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposableKt$SddrRegionSelectorComposable$1$2$1$1$4
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
                            ComposerKt.traceEventStart(-1004849806, i4, -1, "com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SddrRegionSelectorComposable.kt:74)");
                        }
                        BentoFlagIcon.BentoFlagIcon(countryCode2.getIso3166CountryCode(), null, composer2, 0, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), false, false, false, null, composer, 1576320, 0, 1970);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
