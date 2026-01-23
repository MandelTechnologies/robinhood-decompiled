package com.robinhood.android.common.portfolio.instrument;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.portfolio.C11511R;
import com.robinhood.android.common.portfolio.unified.DisplayType;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.Preconditions;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: InstrumentDisplayTypeComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\u001f\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\"\u0018\u0010\u0012\u001a\u00020\u0013*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"InstrumentDisplayTypeComposable", "", "activeDisplayType", "Lcom/robinhood/android/common/portfolio/unified/DisplayType;", "displayTypes", "Lkotlinx/collections/immutable/PersistentList;", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "onDisplayTypeClicked", "Lkotlin/Function1;", "(Lcom/robinhood/android/common/portfolio/unified/DisplayType;Lkotlinx/collections/immutable/PersistentList;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "valueDisplayRowMeta", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "activeItem", "(Lcom/robinhood/android/common/portfolio/unified/DisplayType;Lcom/robinhood/android/common/portfolio/unified/DisplayType;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", AnnotatedPrivateKey.LABEL, "", "getLabel", "(Lcom/robinhood/android/common/portfolio/unified/DisplayType;)I", "feature-lib-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.instrument.InstrumentDisplayTypeComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class InstrumentDisplayTypeComposable {

    /* compiled from: InstrumentDisplayTypeComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.instrument.InstrumentDisplayTypeComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisplayType.values().length];
            try {
                iArr[DisplayType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplayType.LAST_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplayType.PERCENT_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisplayType.TOTAL_PERCENT_CHANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentDisplayTypeComposable$lambda$4(DisplayType displayType, ImmutableList3 immutableList3, Modifier modifier, String str, Function1 function1, int i, int i2, Composer composer, int i3) {
        InstrumentDisplayTypeComposable(displayType, immutableList3, modifier, str, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstrumentDisplayTypeComposable(final DisplayType activeDisplayType, final ImmutableList3<? extends DisplayType> displayTypes, Modifier modifier, String str, final Function1<? super DisplayType, Unit> onDisplayTypeClicked, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        String str2;
        Modifier modifier3;
        int i4;
        String strStringResource;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier4;
        final String str3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(activeDisplayType, "activeDisplayType");
        Intrinsics.checkNotNullParameter(displayTypes, "displayTypes");
        Intrinsics.checkNotNullParameter(onDisplayTypeClicked, "onDisplayTypeClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(467391248);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(activeDisplayType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(displayTypes) ? 32 : 16;
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
                i3 |= composerStartRestartGroup.changedInstance(onDisplayTypeClicked) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        i4 = i3 & (-7169);
                        strStringResource = StringResources_androidKt.stringResource(C11511R.string.instrument_display_data_title, composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(467391248, i4, -1, "com.robinhood.android.common.portfolio.instrument.InstrumentDisplayTypeComposable (InstrumentDisplayTypeComposable.kt:30)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    int i8 = i4;
                    String str4 = strStringResource;
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 7, null), bentoTheme.getColors(composerStartRestartGroup, i7).m21372getBg20d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                    BentoText2.m20747BentoText38GnDrw(str4, PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleSmall(), composerStartRestartGroup, (i8 >> 9) & 14, 0, 8124);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(-683841007);
                    for (final DisplayType displayType : displayTypes) {
                        String strStringResource2 = StringResources_androidKt.stringResource(getLabel(displayType), composerStartRestartGroup, 0);
                        BentoBaseRowState.Meta metaValueDisplayRowMeta = valueDisplayRowMeta(displayType, activeDisplayType, composerStartRestartGroup, (i8 << 3) & 112);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChanged = composerStartRestartGroup.changed(displayType.ordinal()) | ((i8 & 57344) == 16384);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentDisplayTypeComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InstrumentDisplayTypeComposable.m1846x33cc6d00(onDisplayTypeClicked, displayType);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer2 = composerStartRestartGroup;
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource2, null, null, metaValueDisplayRowMeta, null, false, false, false, 0L, (Function0) objRememberedValue, composer2, BentoBaseRowState.Meta.$stable << 15, 0, 2011);
                        composerStartRestartGroup = composer2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                i4 = i3;
                strStringResource = str2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    int i82 = i4;
                    String str42 = strStringResource;
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default22, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), 7, null), bentoTheme2.getColors(composerStartRestartGroup, i72).m21372getBg20d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                    BentoText2.m20747BentoText38GnDrw(str42, PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion22, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleSmall(), composerStartRestartGroup, (i82 >> 9) & 14, 0, 8124);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(-683841007);
                    while (r26.hasNext()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    str3 = str42;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                str3 = str2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentDisplayTypeComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InstrumentDisplayTypeComposable.InstrumentDisplayTypeComposable$lambda$4(activeDisplayType, displayTypes, modifier4, str3, onDisplayTypeClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                    i4 = i3;
                    strStringResource = str2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierFillMaxWidth$default32 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default32);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InstrumentDisplayTypeComposable$lambda$3$lambda$2$lambda$1$lambda$0 */
    public static final Unit m1846x33cc6d00(Function1 function1, DisplayType displayType) {
        function1.invoke(displayType);
        return Unit.INSTANCE;
    }

    private static final BentoBaseRowState.Meta valueDisplayRowMeta(DisplayType displayType, DisplayType displayType2, Composer composer, int i) {
        composer.startReplaceGroup(1515118733);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1515118733, i, -1, "com.robinhood.android.common.portfolio.instrument.valueDisplayRowMeta (InstrumentDisplayTypeComposable.kt:67)");
        }
        BentoBaseRowState.Meta.Icon icon = displayType == displayType2 ? new BentoBaseRowState.Meta.Icon(ServerToBentoAssetMapper2.CHECKMARK_24, StringResources_androidKt.stringResource(C11511R.string.holdings_display_value_active_row, new Object[]{StringResources_androidKt.stringResource(getLabel(displayType), composer, 0)}, composer, 0), (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null) : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return icon;
    }

    private static final int getLabel(DisplayType displayType) {
        int i = WhenMappings.$EnumSwitchMapping$0[displayType.ordinal()];
        if (i == 1) {
            Preconditions.INSTANCE.failUnknownEnumKotlin(displayType);
            throw new ExceptionsH();
        }
        if (i == 2) {
            return C11511R.string.instrument_display_data_last_price_label;
        }
        if (i == 3) {
            return C11511R.string.instrument_display_data_percent_change_label;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return C11511R.string.instrument_display_data_total_percent_change_label;
    }
}
