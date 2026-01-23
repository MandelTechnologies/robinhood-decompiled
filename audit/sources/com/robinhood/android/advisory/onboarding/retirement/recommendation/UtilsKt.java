package com.robinhood.android.advisory.onboarding.retirement.recommendation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.robinhood.android.advisory.onboarding.retirement.recommendation.UtilsKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aW\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a|\u0010%\u001a\u00020\b2\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$\u001a\u0015\u0010(\u001a\u00020\u00012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)\u001a\u0011\u0010*\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b*\u0010+¨\u0006-²\u0006\f\u0010,\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "", "identifier", "autoLogRowEvents", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "ctaText", "ctaIdentifier", "Lkotlin/Function0;", "", "onCtaClicked", "modifier", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "components", "", "enabled", "RetirementOnboardingFooter", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlinx/collections/immutable/ImmutableList;ZLandroidx/compose/runtime/Composer;II)V", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "scrollContent", DirectDepositBrokerageExperimentPage.FOOTER_CONTENT, "Landroidx/compose/foundation/lazy/LazyListState;", "listState", "Landroidx/compose/ui/graphics/Color;", "dividerColor", "useDivider", "Landroidx/compose/foundation/layout/PaddingValues;", "lazyColumnContentPadding", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "lazyColumnVerticalArrangement", "Landroidx/compose/ui/Alignment$Horizontal;", "lazyColumnHorizontalAlignment", "StickyFooterLazyColumn-mxsUjTo", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;JZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;II)V", "StickyFooterLazyColumn", "", "x", "textOfLength", "(I)Ljava/lang/String;", "mergeAndSetLoadingContentDescription", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "showFooterDivider", "feature-advisory-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class UtilsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementOnboardingFooter$lambda$1(String str, String str2, Function0 function0, Modifier modifier, ImmutableList immutableList, boolean z, int i, int i2, Composer composer, int i3) {
        RetirementOnboardingFooter(str, str2, function0, modifier, immutableList, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickyFooterLazyColumn_mxsUjTo$lambda$6(Function1 function1, Function2 function2, Modifier modifier, LazyListState lazyListState, long j, boolean z, PaddingValues paddingValues, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i, int i2, Composer composer, int i3) {
        m11125StickyFooterLazyColumnmxsUjTo(function1, function2, modifier, lazyListState, j, z, paddingValues, vertical, horizontal, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Modifier autoLogRowEvents(Modifier modifier, final String identifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.UtilsKt.autoLogRowEvents.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(-547445222);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-547445222, i, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.autoLogRowEvents.<anonymous> (Utils.kt:40)");
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(composed, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.ROW, identifier, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierAutoLogEvents$default;
            }
        }, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RetirementOnboardingFooter(final String ctaText, final String ctaIdentifier, final Function0<Unit> onCtaClicked, Modifier modifier, ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        ImmutableList<? extends UIComponent<? extends GenericAction>> immutableListPersistentListOf;
        int i5;
        boolean z2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList2;
        final boolean z3;
        final ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(ctaIdentifier, "ctaIdentifier");
        Intrinsics.checkNotNullParameter(onCtaClicked, "onCtaClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(969826875);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(ctaText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(ctaIdentifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCtaClicked) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    immutableListPersistentListOf = immutableList;
                    i3 |= composerStartRestartGroup.changedInstance(immutableListPersistentListOf) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            immutableListPersistentListOf = extensions2.persistentListOf();
                        }
                        boolean z4 = i5 == 0 ? true : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(969826875, i3, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.RetirementOnboardingFooter (Utils.kt:62)");
                        }
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(62544114);
                        if (immutableListPersistentListOf.isEmpty()) {
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            composerStartRestartGroup.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(immutableListPersistentListOf, GenericAction.class, modifierM5146paddingqDBjuR0$default, null, null, HorizontalPadding.Default, arrangement.getTop(), companion.getStart(), false, composerStartRestartGroup, (i3 >> 12) & 14, 0);
                            immutableList2 = immutableListPersistentListOf;
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            immutableList2 = immutableListPersistentListOf;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier5 = modifier4;
                        int i7 = i3;
                        boolean z5 = z4;
                        BentoButtonKt.m20586BentoButtonEikTQX8(onCtaClicked, ctaText, ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, ctaIdentifier, null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), null, null, z5, false, null, null, null, null, false, null, composerStartRestartGroup, ((i7 >> 6) & 14) | ((i7 << 3) & 112) | (i7 & 458752), 0, 8152);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z3 = z5;
                        immutableList3 = immutableList2;
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        immutableList3 = immutableListPersistentListOf;
                        z3 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.UtilsKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return UtilsKt.RetirementOnboardingFooter$lambda$1(ctaText, ctaIdentifier, onCtaClicked, modifier3, immutableList3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z2 = z;
                if ((74899 & i3) == 74898) {
                    if (i6 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion3.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
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
                        composerStartRestartGroup.startReplaceGroup(62544114);
                        if (immutableListPersistentListOf.isEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = modifier4;
                        int i72 = i3;
                        boolean z52 = z4;
                        BentoButtonKt.m20586BentoButtonEikTQX8(onCtaClicked, ctaText, ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, ctaIdentifier, null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), null, null, z52, false, null, null, null, null, false, null, composerStartRestartGroup, ((i72 >> 6) & 14) | ((i72 << 3) & 112) | (i72 & 458752), 0, 8152);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z3 = z52;
                        immutableList3 = immutableList2;
                        modifier3 = modifier52;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            immutableListPersistentListOf = immutableList;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            z2 = z;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        immutableListPersistentListOf = immutableList;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z2 = z;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean StickyFooterLazyColumn_mxsUjTo$lambda$4(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
    /* renamed from: StickyFooterLazyColumn-mxsUjTo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11125StickyFooterLazyColumnmxsUjTo(final Function1<? super LazyListScope, Unit> scrollContent, final Function2<? super Composer, ? super Integer, Unit> footerContent, Modifier modifier, LazyListState lazyListState, long j, boolean z, PaddingValues paddingValues, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final LazyListState lazyListStateRememberLazyListState;
        final long jM21373getBg30d7_KjU;
        int i4;
        boolean z2;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        int i7;
        int i8;
        int i9;
        PaddingValues paddingValuesM5135PaddingValues0680j_4;
        Arrangement.Vertical top;
        long j2;
        Alignment.Horizontal start;
        int i10;
        Modifier modifier3;
        final boolean z3;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final boolean z4;
        final Alignment.Horizontal horizontal2;
        final PaddingValues paddingValues3;
        final Arrangement.Vertical vertical2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(scrollContent, "scrollContent");
        Intrinsics.checkNotNullParameter(footerContent, "footerContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1863805649);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(scrollContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(footerContent) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    lazyListStateRememberLazyListState = lazyListState;
                    int i12 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 2048 : 1024;
                    i3 |= i12;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                i3 |= i12;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    jM21373getBg30d7_KjU = j;
                    int i13 = composerStartRestartGroup.changed(jM21373getBg30d7_KjU) ? 16384 : 8192;
                    i3 |= i13;
                } else {
                    jM21373getBg30d7_KjU = j;
                }
                i3 |= i13;
            } else {
                jM21373getBg30d7_KjU = j;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else {
                    if ((1572864 & i) == 0) {
                        paddingValues2 = paddingValues;
                        i3 |= composerStartRestartGroup.changed(paddingValues2) ? 1048576 : 524288;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else {
                        if ((i & 12582912) == 0) {
                            i7 = i6;
                            i3 |= composerStartRestartGroup.changed(vertical) ? 8388608 : 4194304;
                        }
                        i8 = i2 & 256;
                        if (i8 == 0) {
                            if ((i & 100663296) == 0) {
                                i9 = i8;
                                i3 |= composerStartRestartGroup.changed(horizontal) ? 67108864 : 33554432;
                            }
                            if ((i3 & 38347923) != 38347922 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                vertical2 = vertical;
                                z4 = z2;
                                composer2 = composerStartRestartGroup;
                                paddingValues3 = paddingValues2;
                                horizontal2 = horizontal;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i11 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if ((i2 & 8) == 0) {
                                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                        i3 &= -7169;
                                    }
                                    if ((i2 & 16) != 0) {
                                        jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU();
                                        i3 &= -57345;
                                    }
                                    boolean z5 = i4 == 0 ? true : z2;
                                    paddingValuesM5135PaddingValues0680j_4 = i5 == 0 ? PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)) : paddingValues2;
                                    top = i7 == 0 ? Arrangement.INSTANCE.getTop() : vertical;
                                    if (i9 == 0) {
                                        j2 = jM21373getBg30d7_KjU;
                                        start = Alignment.INSTANCE.getStart();
                                    } else {
                                        j2 = jM21373getBg30d7_KjU;
                                        start = horizontal;
                                    }
                                    i10 = i3;
                                    modifier3 = modifier2;
                                    z3 = z5;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    top = vertical;
                                    j2 = jM21373getBg30d7_KjU;
                                    start = horizontal;
                                    i10 = i3;
                                    modifier3 = modifier2;
                                    z3 = z2;
                                    paddingValuesM5135PaddingValues0680j_4 = paddingValues2;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1863805649, i10, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.StickyFooterLazyColumn (Utils.kt:105)");
                                }
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.UtilsKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Boolean.valueOf(UtilsKt.StickyFooterLazyColumn_mxsUjTo$lambda$3$lambda$2(z3, lazyListStateRememberLazyListState));
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                int i14 = i10 >> 6;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Modifier modifier4 = modifier3;
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
                                int i15 = i10 >> 9;
                                int i16 = (i14 & 112) | ((i10 >> 12) & 896) | (57344 & i15) | (i15 & 458752) | ((i10 << 27) & 1879048192);
                                boolean z6 = z3;
                                int i17 = i10;
                                PaddingValues paddingValues4 = paddingValuesM5135PaddingValues0680j_4;
                                Arrangement.Vertical vertical3 = top;
                                LazyListState lazyListState2 = lazyListStateRememberLazyListState;
                                LazyDslKt.LazyColumn(Column5.weight$default(Column6.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), lazyListState2, paddingValues4, false, vertical3, start, null, false, null, scrollContent, composerStartRestartGroup, i16, WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
                                long j3 = j2;
                                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(j3, !StickyFooterLazyColumn_mxsUjTo$lambda$4(snapshotState4) ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composerStartRestartGroup, 0, 5);
                                footerContent.invoke(composerStartRestartGroup, Integer.valueOf((i17 >> 3) & 14));
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2 = composerStartRestartGroup;
                                z4 = z6;
                                modifier2 = modifier4;
                                horizontal2 = start;
                                jM21373getBg30d7_KjU = j3;
                                paddingValues3 = paddingValues4;
                                vertical2 = vertical3;
                                lazyListStateRememberLazyListState = lazyListState2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.UtilsKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return UtilsKt.StickyFooterLazyColumn_mxsUjTo$lambda$6(scrollContent, footerContent, modifier2, lazyListStateRememberLazyListState, jM21373getBg30d7_KjU, z4, paddingValues3, vertical2, horizontal2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 100663296;
                        i9 = i8;
                        if ((i3 & 38347923) != 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i11 != 0) {
                                }
                                if ((i2 & 8) == 0) {
                                }
                                if ((i2 & 16) != 0) {
                                }
                                if (i4 == 0) {
                                }
                                if (i5 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                i10 = i3;
                                modifier3 = modifier2;
                                z3 = z5;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                int i142 = i10 >> 6;
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Modifier modifier42 = modifier3;
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                    int i152 = i10 >> 9;
                                    int i162 = (i142 & 112) | ((i10 >> 12) & 896) | (57344 & i152) | (i152 & 458752) | ((i10 << 27) & 1879048192);
                                    boolean z62 = z3;
                                    int i172 = i10;
                                    PaddingValues paddingValues42 = paddingValuesM5135PaddingValues0680j_4;
                                    Arrangement.Vertical vertical32 = top;
                                    LazyListState lazyListState22 = lazyListStateRememberLazyListState;
                                    LazyDslKt.LazyColumn(Column5.weight$default(Column6.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), lazyListState22, paddingValues42, false, vertical32, start, null, false, null, scrollContent, composerStartRestartGroup, i162, WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
                                    long j32 = j2;
                                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(j32, !StickyFooterLazyColumn_mxsUjTo$lambda$4(snapshotState42) ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composerStartRestartGroup, 0, 5);
                                    footerContent.invoke(composerStartRestartGroup, Integer.valueOf((i172 >> 3) & 14));
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composer2 = composerStartRestartGroup;
                                    z4 = z62;
                                    modifier2 = modifier42;
                                    horizontal2 = start;
                                    jM21373getBg30d7_KjU = j32;
                                    paddingValues3 = paddingValues42;
                                    vertical2 = vertical32;
                                    lazyListStateRememberLazyListState = lazyListState22;
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i7 = i6;
                    i8 = i2 & 256;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    if ((i3 & 38347923) != 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                paddingValues2 = paddingValues;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i6;
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i3 & 38347923) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            paddingValues2 = paddingValues;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i6;
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i3 & 38347923) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i6;
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i3 & 38347923) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean StickyFooterLazyColumn_mxsUjTo$lambda$3$lambda$2(boolean z, LazyListState lazyListState) {
        return z && lazyListState.getCanScrollForward();
    }

    public static final String textOfLength(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add("x");
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    /* compiled from: Utils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.UtilsKt$mergeAndSetLoadingContentDescription$1 */
    static final class C90781 implements Function3<Modifier, Composer, Integer, Modifier> {
        public static final C90781 INSTANCE = new C90781();

        C90781() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(1595110185);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1595110185, i, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.mergeAndSetLoadingContentDescription.<anonymous> (Utils.kt:139)");
            }
            final String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_status_loading, composer, 0);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.UtilsKt$mergeAndSetLoadingContentDescription$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UtilsKt.C90781.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierSemantics = SemanticsModifier6.semantics(composed, true, (Function1) objRememberedValue);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(strStringResource);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.UtilsKt$mergeAndSetLoadingContentDescription$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UtilsKt.C90781.invoke$lambda$3$lambda$2(strStringResource, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierClearAndSetSemantics = SemanticsModifier6.clearAndSetSemantics(modifierSemantics, (Function1) objRememberedValue2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierClearAndSetSemantics;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(String str, SemanticsPropertyReceiver clearAndSetSemantics) {
            Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
            SemanticsPropertiesKt.setContentDescription(clearAndSetSemantics, str);
            return Unit.INSTANCE;
        }
    }

    public static final Modifier mergeAndSetLoadingContentDescription(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed$default(modifier, null, C90781.INSTANCE, 1, null);
    }
}
