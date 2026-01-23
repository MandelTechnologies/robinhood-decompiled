package com.robinhood.android.advisory.dashboard.overview.portfolio;

import android.content.Context;
import android.view.View;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchors;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.advisory.portfolio.PortfolioDonutChart;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CategoryDrillDown.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\u001a5\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002"}, m3636d2 = {"VelocityThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "SwipeOffset", "CategoryDrillDown", "", "categorySlice", "Lcom/robinhood/android/advisory/dashboard/overview/portfolio/CategorySlice;", "accountNumber", "", "onBackClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/dashboard/overview/portfolio/CategorySlice;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-advisory-dashboard_externalDebug", "activeAssetIndexWithoutWraparound", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class CategoryDrillDown {
    private static final float VelocityThreshold = C2002Dp.m7995constructorimpl(75);
    private static final float SwipeOffset = C2002Dp.m7995constructorimpl(50);

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CategoryDrillDown$lambda$12$lambda$11(float f) {
        return f * 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CategoryDrillDown$lambda$27(CategorySlice categorySlice, String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CategoryDrillDown(categorySlice, str, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CategoryDrillDown$lambda$6(CategorySlice categorySlice, String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CategoryDrillDown(categorySlice, str, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CategoryDrillDown(final CategorySlice categorySlice, final String accountNumber, final Function0<Unit> onBackClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final AssetSlice assetSlice;
        DraggableAnchors draggableAnchors;
        AssetSlice assetSlice2;
        Composer composer2;
        Continuation continuation;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(categorySlice, "categorySlice");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(2001895726);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(categorySlice) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(accountNumber) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2001895726, i3, -1, "com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDown (CategoryDrillDown.kt:76)");
                }
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                Object[] objArr = {categorySlice.getCategory()};
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CategoryDrillDown.CategoryDrillDown$lambda$1$lambda$0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                final int size = categorySlice.getAssetSlices().size();
                int intValue = snapshotIntState2.getIntValue() % size;
                final int i5 = intValue + ((((intValue ^ size) & ((-intValue) | intValue)) >> 31) & size);
                assetSlice = (AssetSlice) CollectionsKt.getOrNull(categorySlice.getAssetSlices(), i5);
                composerStartRestartGroup.startReplaceGroup(-323531147);
                if (assetSlice != null) {
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChanged = composerStartRestartGroup.changed(i5) | composerStartRestartGroup.changed(size) | ((i3 & 896) == 256);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new CategoryDrillDown4(i5, size, onBackClicked, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final Modifier modifier5 = modifier4;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CategoryDrillDown.CategoryDrillDown$lambda$6(categorySlice, accountNumber, onBackClicked, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifier6 = modifier4;
                composerStartRestartGroup.endReplaceGroup();
                final float fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(SwipeOffset);
                int intValue2 = snapshotIntState2.getIntValue();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged2 = composerStartRestartGroup.changed(intValue2);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new AnchoredDraggableState(CategoryDrillDown5.RESTING);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                final AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged3 = composerStartRestartGroup.changed(density);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = AnchoredDraggableKt.DraggableAnchors(new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CategoryDrillDown.CategoryDrillDown$lambda$10$lambda$9(fMo5016toPx0680j_4, (DraggableAnchorsConfig) obj);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                DraggableAnchors draggableAnchors2 = (DraggableAnchors) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAspectRatio$default = AspectRatio3.aspectRatio$default(SizeKt.m5158heightInVpY3zN4$default(modifier6, 0.0f, PortfolioDonutChart.getDonutChartMaxSize(), 1, null), 1.0f, false, 2, null);
                Orientation orientation = Orientation.Horizontal;
                AnchoredDraggableDefaults anchoredDraggableDefaults = AnchoredDraggableDefaults.INSTANCE;
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(100, 0, null, 6, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(CategoryDrillDown.CategoryDrillDown$lambda$12$lambda$11(((Float) obj).floatValue()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i6 = i3;
                Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(modifierAspectRatio$default, anchoredDraggableState, true, orientation, false, null, null, anchoredDraggableDefaults.flingBehavior(anchoredDraggableState, (Function1) objRememberedValue5, tweenSpecTween$default, composerStartRestartGroup, (AnchoredDraggableDefaults.$stable << 9) | 432, 0), 56, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAnchoredDraggable$default);
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
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierWeight$default = Column5.weight$default(column6, companion4, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                String shortName = categorySlice.getDetails().getShortName();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(assetSlice) | composerStartRestartGroup.changedInstance(categorySlice) | ((i6 & 112) == 32);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                    draggableAnchors = draggableAnchors2;
                    Function0 function0 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CategoryDrillDown.CategoryDrillDown$lambda$22$lambda$15$lambda$14$lambda$13(navigator, context, assetSlice, categorySlice, accountNumber);
                        }
                    };
                    assetSlice2 = assetSlice;
                    composerStartRestartGroup.updateRememberedValue(function0);
                    objRememberedValue6 = function0;
                } else {
                    assetSlice2 = assetSlice;
                    draggableAnchors = draggableAnchors2;
                }
                composerStartRestartGroup.endReplaceGroup();
                AssetSliceHeader.AssetSliceHeader(assetSlice2, shortName, (Function0) objRememberedValue6, null, composerStartRestartGroup, 0, 8);
                composerStartRestartGroup.endNode();
                Modifier modifierWeight$default2 = Column5.weight$default(column6, companion4, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getBottomCenter(), false);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                List<AssetSlice> assetSlices = categorySlice.getAssetSlices();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(assetSlices, 10));
                Iterator<T> it = assetSlices.iterator();
                while (it.hasNext()) {
                    arrayList.add(Float.valueOf(((AssetSlice) it.next()).getAllocation()));
                }
                ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
                int intValue3 = snapshotIntState2.getIntValue();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChanged4 = composerStartRestartGroup.changed(i5) | composerStartRestartGroup.changed(size) | composerStartRestartGroup.changed(snapshotIntState2);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CategoryDrillDown.CategoryDrillDown$lambda$22$lambda$21$lambda$18$lambda$17(i5, size, snapshotIntState2, ((Integer) obj).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                CategoryDrillDownRing.CategoryDrillDownRing(persistentList, (Function1) objRememberedValue7, intValue3, null, composerStartRestartGroup, 0, 8);
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Spacer2.Spacer(Background3.background$default(SizeKt.m5156height3ABfNKs(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21594getXlargeD9Ej5fM()), Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i7).m21595getXsmallD9Ej5fM());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion6 = Composer.INSTANCE;
                if (objRememberedValue8 == companion6.getEmpty()) {
                    objRememberedValue8 = InteractionSource2.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(ClickableKt.m4891clickableO2vRcR0$default(companion5, (InteractionSource3) objRememberedValue8, null, false, null, null, onBackClicked, 28, null), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21594getXlargeD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21594getXlargeD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21594getXlargeD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM());
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composerStartRestartGroup, 48);
                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR0);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion7.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion7.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                final DraggableAnchors draggableAnchors3 = draggableAnchors;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11048R.string.general_label_back, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS(), composerStartRestartGroup, 0, 0, 8122);
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_UP_16), null, bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 56);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                composer2.endNode();
                composer2.endNode();
                composer2.startReplaceGroup(-1633490746);
                boolean zChanged5 = composer2.changed(anchoredDraggableState) | composer2.changedInstance(draggableAnchors3);
                Object objRememberedValue9 = composer2.rememberedValue();
                if (zChanged5 || objRememberedValue9 == companion6.getEmpty()) {
                    objRememberedValue9 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CategoryDrillDown.CategoryDrillDown$lambda$24$lambda$23(anchoredDraggableState, draggableAnchors3);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue9);
                }
                composer2.endReplaceGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue9, composer2, 0);
                composer2.startReplaceGroup(-1633490746);
                boolean zChanged6 = composer2.changed(anchoredDraggableState) | composer2.changed(snapshotIntState2);
                Object objRememberedValue10 = composer2.rememberedValue();
                if (zChanged6 || objRememberedValue10 == companion6.getEmpty()) {
                    continuation = null;
                    objRememberedValue10 = new CategoryDrillDown2(anchoredDraggableState, snapshotIntState2, null);
                    composer2.updateRememberedValue(objRememberedValue10);
                } else {
                    continuation = null;
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composer2, 0);
                Integer numValueOf = Integer.valueOf(i5);
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer2.changedInstance(view);
                Object objRememberedValue11 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue11 == companion6.getEmpty()) {
                    objRememberedValue11 = new CategoryDrillDown3(view, continuation);
                    composer2.updateRememberedValue(objRememberedValue11);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CategoryDrillDown.CategoryDrillDown$lambda$27(categorySlice, accountNumber, onBackClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            View view2 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Object[] objArr2 = {categorySlice.getCategory()};
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            final int size2 = categorySlice.getAssetSlices().size();
            int intValue4 = snapshotIntState22.getIntValue() % size2;
            final int i52 = intValue4 + ((((intValue4 ^ size2) & ((-intValue4) | intValue4)) >> 31) & size2);
            assetSlice = (AssetSlice) CollectionsKt.getOrNull(categorySlice.getAssetSlices(), i52);
            composerStartRestartGroup.startReplaceGroup(-323531147);
            if (assetSlice != null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 CategoryDrillDown$lambda$1$lambda$0() {
        return SnapshotIntState3.mutableIntStateOf(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CategoryDrillDown$lambda$10$lambda$9(float f, DraggableAnchorsConfig DraggableAnchors) {
        Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
        DraggableAnchors.m99at(CategoryDrillDown5.LEFT, -f);
        DraggableAnchors.m99at(CategoryDrillDown5.RESTING, 0.0f);
        DraggableAnchors.m99at(CategoryDrillDown5.RIGHT, f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CategoryDrillDown$lambda$22$lambda$15$lambda$14$lambda$13(Navigator navigator, Context context, AssetSlice assetSlice, CategorySlice categorySlice, String str) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.EquityInstrumentDetail(assetSlice.getInstrumentId(), categorySlice.getInstrumentIds(), str, InstrumentDetailSource.NONE, false, 16, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CategoryDrillDown$lambda$22$lambda$21$lambda$18$lambda$17(int i, int i2, SnapshotIntState2 snapshotIntState2, int i3) {
        if (i != i3) {
            int iMin = Math.min(Math.abs(i - i3), Math.min((i3 + i2) - i, (i + i2) - i3));
            int i4 = (i - iMin) % i2;
            if (i4 + (i2 & (((i4 ^ i2) & ((-i4) | i4)) >> 31)) == i3) {
                snapshotIntState2.setIntValue(snapshotIntState2.getIntValue() - iMin);
            } else {
                snapshotIntState2.setIntValue(snapshotIntState2.getIntValue() + iMin);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CategoryDrillDown$lambda$24$lambda$23(AnchoredDraggableState anchoredDraggableState, DraggableAnchors draggableAnchors) {
        AnchoredDraggableState.updateAnchors$default(anchoredDraggableState, draggableAnchors, null, 2, null);
        return Unit.INSTANCE;
    }
}
