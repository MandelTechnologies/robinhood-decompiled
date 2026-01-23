package com.robinhood.android.slip.onboarding.success;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SuccessComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"SLIP_ONBOARDING_SUCCESS_BUTTON_TEST_TAG", "", "SuccessComposable", "", "imageRes", "", "components", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onButtonClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(ILkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-slip_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.slip.onboarding.success.SuccessComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SuccessComposable {
    public static final String SLIP_ONBOARDING_SUCCESS_BUTTON_TEST_TAG = "SLIP_ONBOARDING_SUCCESS_BUTTON";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuccessComposable$lambda$0(int i, ImmutableList immutableList, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        SuccessComposable(i, immutableList, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SuccessComposable(final int i, final ImmutableList<? extends UIComponent<? extends GenericAction>> components, final Function0<Unit> onButtonClick, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1265709866);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            i4 = i;
        } else if ((i2 & 6) == 0) {
            i4 = i;
            i5 = (composerStartRestartGroup.changed(i4) ? 4 : 2) | i2;
        } else {
            i4 = i;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(components) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onButtonClick) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1265709866, i5, -1, "com.robinhood.android.slip.onboarding.success.SuccessComposable (SuccessComposable.kt:40)");
                }
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                long jet = bentoTheme.getColors(composerStartRestartGroup, i7).getJet();
                long nova = bentoTheme.getColors(composerStartRestartGroup, i7).getNova();
                long jet2 = bentoTheme.getColors(composerStartRestartGroup, i7).getJet();
                final int i8 = i4;
                final Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(jet2, jet, 0L, 0L, nova, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(1041176004, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.success.SuccessComposableKt.SuccessComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1041176004, i9, -1, "com.robinhood.android.slip.onboarding.success.SuccessComposable.<anonymous> (SuccessComposable.kt:49)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i10 = BentoTheme.$stable;
                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m5143paddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme2.getColors(composer3, i10).getIon(), null, 2, null), bentoTheme2.getSpacing(composer3, i10).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM()));
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                        Context context2 = context;
                        Function0<Unit> function0 = onButtonClick;
                        int i11 = i8;
                        ImmutableList<UIComponent<GenericAction>> immutableList = components;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierNavigationBarsPadding);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getCenter(), companion.getCenterHorizontally(), composer3, 54);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        ImageKt.Image(PainterResources_androidKt.painterResource(i11, composer3, 0), (String) null, PaddingKt.m5142padding3ABfNKs(companion3, bentoTheme2.getSpacing(composer3, i10).m21591getLargeD9Ej5fM()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 48, 120);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composer3, i10).m21594getXlargeD9Ej5fM()), composer3, 0);
                        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                        Alignment.Horizontal centerHorizontally2 = companion.getCenterHorizontally();
                        composer3.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(immutableList, GenericAction.class, companion3, null, null, HorizontalPadding.Default, center, centerHorizontally2, false, composer3, 114819072, 0);
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(TestTag3.testTag(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), SuccessComposable.SLIP_ONBOARDING_SUCCESS_BUTTON_TEST_TAG), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.DONE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null);
                        String string2 = context2.getString(C11048R.string.general_label_done);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, string2, modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer3, 0, 0, 8184);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 805306368, 492);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.success.SuccessComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SuccessComposable.SuccessComposable$lambda$0(i, components, onButtonClick, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        modifier2 = modifier;
        if ((i5 & 1171) == 1170) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            long jet3 = bentoTheme2.getColors(composerStartRestartGroup, i72).getJet();
            long nova2 = bentoTheme2.getColors(composerStartRestartGroup, i72).getNova();
            long jet22 = bentoTheme2.getColors(composerStartRestartGroup, i72).getJet();
            final int i82 = i4;
            final Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(jet22, jet3, 0L, 0L, nova2, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(1041176004, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.success.SuccessComposableKt.SuccessComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i9) {
                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1041176004, i9, -1, "com.robinhood.android.slip.onboarding.success.SuccessComposable.<anonymous> (SuccessComposable.kt:49)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier52, 0.0f, 1, null);
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i10 = BentoTheme.$stable;
                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m5143paddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme22.getColors(composer3, i10).getIon(), null, 2, null), bentoTheme22.getSpacing(composer3, i10).m21592getMediumD9Ej5fM(), bentoTheme22.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM()));
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                    Context context22 = context2;
                    Function0<Unit> function0 = onButtonClick;
                    int i11 = i82;
                    ImmutableList<UIComponent<GenericAction>> immutableList = components;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierNavigationBarsPadding);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getCenter(), companion.getCenterHorizontally(), composer3, 54);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    ImageKt.Image(PainterResources_androidKt.painterResource(i11, composer3, 0), (String) null, PaddingKt.m5142padding3ABfNKs(companion3, bentoTheme22.getSpacing(composer3, i10).m21591getLargeD9Ej5fM()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 48, 120);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme22.getSpacing(composer3, i10).m21594getXlargeD9Ej5fM()), composer3, 0);
                    Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                    Alignment.Horizontal centerHorizontally2 = companion.getCenterHorizontally();
                    composer3.startReplaceGroup(-1772220517);
                    SduiColumns.SduiColumn(immutableList, GenericAction.class, companion3, null, null, HorizontalPadding.Default, center, centerHorizontally2, false, composer3, 114819072, 0);
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(TestTag3.testTag(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), SuccessComposable.SLIP_ONBOARDING_SUCCESS_BUTTON_TEST_TAG), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.DONE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null);
                    String string2 = context22.getString(C11048R.string.general_label_done);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    BentoButtonKt.m20586BentoButtonEikTQX8(function0, string2, modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer3, 0, 0, 8184);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 805306368, 492);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
