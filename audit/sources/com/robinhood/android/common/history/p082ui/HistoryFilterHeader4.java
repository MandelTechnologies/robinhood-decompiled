package com.robinhood.android.common.history.p082ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: HistoryFilterHeader.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\f\u001aK\u0010\r\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"HistoryFilterHeader", "", "filters", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/common/history/ui/HistoryFilter;", "selectedFilter", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "onFilterSelected", "Lkotlin/Function1;", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/common/history/ui/HistoryFilter;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "HistoryCustomNamedFilterHeader", "customNamedFilters", "Lcom/robinhood/android/common/history/ui/CustomNamedHistoryFilter;", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "lib-history-row_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.history.ui.HistoryFilterHeaderKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class HistoryFilterHeader4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryCustomNamedFilterHeader$lambda$7(ImmutableList immutableList, HistoryFilter historyFilter, Modifier modifier, String str, Function1 function1, int i, int i2, Composer composer, int i3) {
        HistoryCustomNamedFilterHeader(immutableList, historyFilter, modifier, str, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryFilterHeader$lambda$1(ImmutableList immutableList, HistoryFilter historyFilter, Modifier modifier, String str, Function1 function1, int i, int i2, Composer composer, int i3) {
        HistoryFilterHeader(immutableList, historyFilter, modifier, str, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$8(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0105 A[LOOP:0: B:79:0x00ff->B:81:0x0105, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HistoryFilterHeader(final ImmutableList<? extends HistoryFilter> filters, final HistoryFilter selectedFilter, Modifier modifier, String str, final Function1<? super HistoryFilter, Unit> onFilterSelected, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        String str2;
        String strStringResource;
        int i4;
        Modifier modifier3;
        final Modifier modifier4;
        final String str3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
        Intrinsics.checkNotNullParameter(onFilterSelected, "onFilterSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1084591376);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(filters) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(selectedFilter.ordinal()) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    str2 = str;
                    int i6 = composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    str2 = str;
                }
                i3 |= i6;
            } else {
                str2 = str;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onFilterSelected) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                } else {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 8) == 0) {
                        strStringResource = StringResources_androidKt.stringResource(C11183R.string.history_title, composerStartRestartGroup, 0);
                        i4 = i3 & (-7169);
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1084591376, i4, -1, "com.robinhood.android.common.history.ui.HistoryFilterHeader (HistoryFilterHeader.kt:30)");
                    }
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filters, 10));
                    for (HistoryFilter historyFilter : filters) {
                        arrayList.add(new CustomNamedHistoryFilter(StringResource.INSTANCE.invoke(historyFilter.getLabelResId(), new Object[0]), historyFilter));
                    }
                    HistoryCustomNamedFilterHeader(extensions2.toPersistentList(arrayList), selectedFilter, modifier3, strStringResource, onFilterSelected, composerStartRestartGroup, StringResource.$stable | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = strStringResource;
                }
                i4 = i3;
                modifier3 = modifier2;
                strStringResource = str2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(filters, 10));
                while (r8.hasNext()) {
                }
                HistoryCustomNamedFilterHeader(extensions2.toPersistentList(arrayList2), selectedFilter, modifier3, strStringResource, onFilterSelected, composerStartRestartGroup, StringResource.$stable | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                str3 = strStringResource;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                str3 = str2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryFilterHeaderKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HistoryFilterHeader4.HistoryFilterHeader$lambda$1(filters, selectedFilter, modifier4, str3, onFilterSelected, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i5 != 0) {
                }
                if ((i2 & 8) == 0) {
                    i4 = i3;
                    modifier3 = modifier2;
                    strStringResource = str2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(filters, 10));
                while (r8.hasNext()) {
                }
                HistoryCustomNamedFilterHeader(extensions2.toPersistentList(arrayList22), selectedFilter, modifier3, strStringResource, onFilterSelected, composerStartRestartGroup, StringResource.$stable | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                str3 = strStringResource;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HistoryCustomNamedFilterHeader(final ImmutableList<CustomNamedHistoryFilter> customNamedFilters, final HistoryFilter selectedFilter, Modifier modifier, String str, final Function1<? super HistoryFilter, Unit> onFilterSelected, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        String str2;
        Modifier modifier3;
        String strStringResource;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final String str3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(customNamedFilters, "customNamedFilters");
        Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
        Intrinsics.checkNotNullParameter(onFilterSelected, "onFilterSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(-827464364);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(customNamedFilters) : composerStartRestartGroup.changedInstance(customNamedFilters) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(selectedFilter.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    str2 = str;
                    int i5 = composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                    i3 |= i5;
                } else {
                    str2 = str;
                }
                i3 |= i5;
            } else {
                str2 = str;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onFilterSelected) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        i3 &= -7169;
                        modifier3 = modifier5;
                        strStringResource = StringResources_androidKt.stringResource(C11183R.string.history_title, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-827464364, i3, -1, "com.robinhood.android.common.history.ui.HistoryCustomNamedFilterHeader (HistoryFilterHeader.kt:52)");
                        }
                        float value = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
                        float value2 = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier3, value, 0.0f, value2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 2, null);
                        Modifier modifier6 = modifier3;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        int i7 = i3;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, (i3 >> 9) & 14, 0, 8188);
                        String str4 = strStringResource;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM());
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        z = ((i7 & 14) != 4 || ((i7 & 8) != 0 && composerStartRestartGroup.changedInstance(customNamedFilters))) | ((i7 & 112) != 32) | ((i7 & 57344) == 16384);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryFilterHeaderKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HistoryFilterHeader4.HistoryCustomNamedFilterHeader$lambda$6$lambda$5$lambda$4(customNamedFilters, selectedFilter, onFilterSelected, (LazyListScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        LazyDslKt.LazyRow(modifierFillMaxWidth$default, null, null, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer2, 6, 494);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str3 = str4;
                        modifier4 = modifier6;
                    } else {
                        modifier3 = modifier5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                strStringResource = str2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                float value3 = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
                float value22 = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifier3, value3, 0.0f, value22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 2, null);
                Modifier modifier62 = modifier3;
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleMedium();
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    int i72 = i3;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, (i3 >> 9) & 14, 0, 8188);
                    String str42 = strStringResource;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM());
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    if ((i72 & 14) != 4) {
                        z = ((i72 & 14) != 4 || ((i72 & 8) != 0 && composerStartRestartGroup.changedInstance(customNamedFilters))) | ((i72 & 112) != 32) | ((i72 & 57344) == 16384);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryFilterHeaderKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HistoryFilterHeader4.HistoryCustomNamedFilterHeader$lambda$6$lambda$5$lambda$4(customNamedFilters, selectedFilter, onFilterSelected, (LazyListScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            LazyDslKt.LazyRow(modifierFillMaxWidth$default2, null, null, false, horizontalOrVerticalM5089spacedBy0680j_42, null, null, false, null, (Function1) objRememberedValue, composer2, 6, 494);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            str3 = str42;
                            modifier4 = modifier62;
                        }
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
                str3 = str2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryFilterHeaderKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HistoryFilterHeader4.HistoryCustomNamedFilterHeader$lambda$7(customNamedFilters, selectedFilter, modifier4, str3, onFilterSelected, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1005752268);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1005752268, i, -1, "com.robinhood.android.common.history.ui.Preview (HistoryFilterHeader.kt:89)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, HistoryFilterHeader.INSTANCE.m12221getLambda$416728188$lib_history_row_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryFilterHeaderKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HistoryFilterHeader4.Preview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryCustomNamedFilterHeader$lambda$6$lambda$5$lambda$4(final ImmutableList immutableList, final HistoryFilter historyFilter, final Function1 function1, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final C11186x752ad9d0 c11186x752ad9d0 = new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryFilterHeaderKt$HistoryCustomNamedFilterHeader$lambda$6$lambda$5$lambda$4$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(CustomNamedHistoryFilter customNamedHistoryFilter) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((CustomNamedHistoryFilter) obj);
            }
        };
        LazyRow.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.common.history.ui.HistoryFilterHeaderKt$HistoryCustomNamedFilterHeader$lambda$6$lambda$5$lambda$4$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c11186x752ad9d0.invoke(immutableList.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.HistoryFilterHeaderKt$HistoryCustomNamedFilterHeader$lambda$6$lambda$5$lambda$4$$inlined$items$default$4
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
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                CustomNamedHistoryFilter customNamedHistoryFilter = (CustomNamedHistoryFilter) immutableList.get(i);
                composer.startReplaceGroup(1067278363);
                final HistoryFilter historyFilter2 = customNamedHistoryFilter.getHistoryFilter();
                String string2 = StringResource2.getString(customNamedHistoryFilter.getLabel(), composer, StringResource.$stable);
                boolean z = historyFilter2 == historyFilter;
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changed(historyFilter2.ordinal());
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.common.history.ui.HistoryFilterHeaderKt$HistoryCustomNamedFilterHeader$1$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(historyFilter2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoChip.BentoSelectionChip((Function0) objRememberedValue, null, false, z, null, string2, composer, 0, 22);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
