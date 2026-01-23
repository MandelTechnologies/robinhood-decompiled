package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.CenterAlignedListPage;
import com.robinhood.models.serverdriven.experimental.api.PageThemeOverride;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import com.robinhood.models.serverdriven.experimental.api.TopAlignedListPage;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SduiStandardPage.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b¢\u0006\u0002\u0010\n\u001a@\u0010\u000b\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b¢\u0006\u0002\u0010\n¨\u0006\f"}, m3636d2 = {"SduiStandardPage", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SduiStandardPageContent", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStandardPageKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiStandardPage3 {
    public static final /* synthetic */ <ActionT extends Parcelable> void SduiStandardPage(final StandardPageTemplate<? extends ActionT> component, final SduiActionHandler<? super ActionT> actionHandler, Modifier modifier, Composer composer, int i, int i2) {
        Arrangement.Vertical top;
        ImmutableList3 immutableList3PersistentListOf;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        composer.startReplaceGroup(-962331744);
        final Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        PageThemeOverride theme_override = component.getTheme_override();
        if (theme_override != null) {
            composer.startReplaceGroup(82012030);
            Boolean boolValueOf = Boolean.valueOf(theme_override == PageThemeOverride.LIGHT);
            Intrinsics.needClassReification();
            BentoTheme2.BentoTheme(boolValueOf, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(873647597, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStandardPageKt.SduiStandardPage.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    Arrangement.Vertical top2;
                    ImmutableList3 immutableList3PersistentListOf2;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(873647597, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStandardPage.<anonymous> (SduiStandardPage.kt:34)");
                    }
                    StandardPageTemplate<ActionT> standardPageTemplate = component;
                    SduiActionHandler<ActionT> sduiActionHandler = actionHandler;
                    Modifier modifier3 = modifier2;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier3, bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU(), null, 2, null);
                    composer2.startReplaceGroup(-430325605);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierM4872backgroundbw27NRU$default, 0.0f, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top3 = arrangement.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top3, companion.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    if (standardPageTemplate instanceof CenterAlignedListPage) {
                        top2 = arrangement.getCenter();
                    } else {
                        if (!(standardPageTemplate instanceof TopAlignedListPage)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        top2 = arrangement.getTop();
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion.getCenterHorizontally(), composer2, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    ImmutableList3 persistentList = extensions2.toPersistentList(standardPageTemplate.getBody());
                    composer2.startReplaceGroup(-1772220517);
                    HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                    Arrangement.Vertical top4 = arrangement.getTop();
                    Alignment.Horizontal start = companion.getStart();
                    Intrinsics.reifiedOperationMarker(4, "ActionT");
                    SduiColumns.SduiColumn(persistentList, Parcelable.class, companion3, null, sduiActionHandler, horizontalPadding, top4, start, true, composer2, 100663296, 0);
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    List footer = standardPageTemplate.getFooter();
                    if (footer == null || (immutableList3PersistentListOf2 = extensions2.toPersistentList(footer)) == null) {
                        immutableList3PersistentListOf2 = extensions2.persistentListOf();
                    }
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 1, null);
                    composer2.startReplaceGroup(-1772220517);
                    Arrangement.Vertical top5 = arrangement.getTop();
                    Alignment.Horizontal start2 = companion.getStart();
                    Intrinsics.reifiedOperationMarker(4, "ActionT");
                    SduiColumns.SduiColumn(immutableList3PersistentListOf2, Parcelable.class, modifierM5144paddingVpY3zN4$default, null, sduiActionHandler, horizontalPadding, top5, start2, true, composer2, 100666368, 0);
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    composer2.endReplaceGroup();
                    SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer2, 0, 1);
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU();
                    Unit unit = Unit.INSTANCE;
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChanged = composer2.changed(systemUiControllerRememberSystemUiController) | composer2.changed(jM21371getBg0d7_KjU);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new SduiStandardPage4(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, null);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(82611105);
            int i3 = i & 1022;
            composer.startReplaceGroup(-430325605);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top2, companion.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            if (component instanceof CenterAlignedListPage) {
                top = arrangement.getCenter();
            } else {
                if (!(component instanceof TopAlignedListPage)) {
                    throw new NoWhenBranchMatchedException();
                }
                top = arrangement.getTop();
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top, companion.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            ImmutableList3 persistentList = extensions2.toPersistentList(component.getBody());
            int i4 = (i3 << 6) & 7168;
            composer.startReplaceGroup(-1772220517);
            HorizontalPadding horizontalPadding = HorizontalPadding.Default;
            Arrangement.Vertical top3 = arrangement.getTop();
            Alignment.Horizontal start = companion.getStart();
            Intrinsics.reifiedOperationMarker(4, "ActionT");
            SduiColumns.SduiColumn(persistentList, Parcelable.class, companion3, null, actionHandler, horizontalPadding, top3, start, true, composer, (((12582912 | i4) << 3) & 57344) | 100663296, 0);
            composer.endReplaceGroup();
            composer.endNode();
            List<UIComponent<ActionT>> footer = component.getFooter();
            if (footer == null || (immutableList3PersistentListOf = extensions2.toPersistentList(footer)) == null) {
                immutableList3PersistentListOf = extensions2.persistentListOf();
            }
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
            composer.startReplaceGroup(-1772220517);
            Arrangement.Vertical top4 = arrangement.getTop();
            Alignment.Horizontal start2 = companion.getStart();
            Intrinsics.reifiedOperationMarker(4, "ActionT");
            SduiColumns.SduiColumn(immutableList3PersistentListOf, Parcelable.class, modifierM5144paddingVpY3zN4$default, null, actionHandler, horizontalPadding, top4, start2, true, composer, (((i4 | 12583296) << 3) & 57344) | 100666368, 0);
            composer.endReplaceGroup();
            composer.endNode();
            composer.endReplaceGroup();
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
    }

    public static final /* synthetic */ <ActionT extends Parcelable> void SduiStandardPageContent(StandardPageTemplate<? extends ActionT> component, SduiActionHandler<? super ActionT> actionHandler, Modifier modifier, Composer composer, int i, int i2) {
        Arrangement.Vertical top;
        ImmutableList3 immutableList3PersistentListOf;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        composer.startReplaceGroup(-430325605);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default((i2 & 4) != 0 ? Modifier.INSTANCE : modifier, 0.0f, 1, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top2 = arrangement.getTop();
        Alignment.Companion companion = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top2, companion.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        if (component instanceof CenterAlignedListPage) {
            top = arrangement.getCenter();
        } else {
            if (!(component instanceof TopAlignedListPage)) {
                throw new NoWhenBranchMatchedException();
            }
            top = arrangement.getTop();
        }
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top, companion.getCenterHorizontally(), composer, 48);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
        ImmutableList3 persistentList = extensions2.toPersistentList(component.getBody());
        int i3 = (i << 6) & 7168;
        composer.startReplaceGroup(-1772220517);
        HorizontalPadding horizontalPadding = HorizontalPadding.Default;
        Arrangement.Vertical top3 = arrangement.getTop();
        Alignment.Horizontal start = companion.getStart();
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        SduiColumns.SduiColumn(persistentList, Parcelable.class, companion3, null, actionHandler, horizontalPadding, top3, start, true, composer, (((12582912 | i3) << 3) & 57344) | 100663296, 0);
        composer.endReplaceGroup();
        composer.endNode();
        List<UIComponent<ActionT>> footer = component.getFooter();
        if (footer == null || (immutableList3PersistentListOf = extensions2.toPersistentList(footer)) == null) {
            immutableList3PersistentListOf = extensions2.persistentListOf();
        }
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
        composer.startReplaceGroup(-1772220517);
        Arrangement.Vertical top4 = arrangement.getTop();
        Alignment.Horizontal start2 = companion.getStart();
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        SduiColumns.SduiColumn(immutableList3PersistentListOf, Parcelable.class, modifierM5144paddingVpY3zN4$default, null, actionHandler, horizontalPadding, top4, start2, true, composer, (((i3 | 12583296) << 3) & 57344) | 100666368, 0);
        composer.endReplaceGroup();
        composer.endNode();
        composer.endReplaceGroup();
    }
}
