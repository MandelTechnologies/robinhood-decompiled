package com.robinhood.android.slip.lib.history;

import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.slip.lib.C28536R;
import com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailState3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.SlipGroupedPaymentItem;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SlipGroupedPaymentDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"SlipGroupedPaymentDetailComposable", "", "viewState", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailViewState$Loaded;", "resources", "Landroid/content/res/Resources;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailViewState$Loaded;Landroid/content/res/Resources;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Item", AnnotatedPrivateKey.LABEL, "", "value", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "feature-lib-slip_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragmentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SlipGroupedPaymentDetailFragment2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Item$lambda$5(String str, String str2, int i, Composer composer, int i2) {
        Item(str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SlipGroupedPaymentDetailComposable$lambda$3(SlipGroupedPaymentDetailState3.Loaded loaded, Resources resources, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        SlipGroupedPaymentDetailComposable(loaded, resources, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SlipGroupedPaymentDetailComposable(final SlipGroupedPaymentDetailState3.Loaded viewState, final Resources resources, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1540927705);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(resources) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1540927705, i3, -1, "com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailComposable (SlipGroupedPaymentDetailFragment.kt:86)");
                }
                composerStartRestartGroup.startReplaceGroup(932199708);
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                composerStartRestartGroup.startReplaceGroup(932199575);
                if (viewState.getAccount() != null) {
                    listCreateListBuilder.add(new Tuples2(resources.getString(C28536R.string.account_used_label), StringResources6.getTextAsString(viewState.getAccount(), composerStartRestartGroup, StringResource.$stable)));
                }
                composerStartRestartGroup.endReplaceGroup();
                if (viewState.getDateReceived() != null) {
                    listCreateListBuilder.add(new Tuples2(resources.getString(C28536R.string.date_label), viewState.getDateReceived()));
                }
                if (viewState.getWithheldAmount() != null) {
                    listCreateListBuilder.add(new Tuples2(resources.getString(C28536R.string.backup_withholding_label), "-" + Money.format$default(viewState.getWithheldAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null)));
                }
                if (viewState.getNetCredit() != null) {
                    listCreateListBuilder.add(new Tuples2(resources.getString(C28536R.string.net_credit_label), "+" + Money.format$default(viewState.getNetCredit(), null, false, null, false, 0, null, false, null, false, false, 1023, null)));
                }
                CollectionsKt.build(listCreateListBuilder);
                composerStartRestartGroup.endReplaceGroup();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM());
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(viewState) | composerStartRestartGroup.changedInstance(resources);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragmentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SlipGroupedPaymentDetailFragment2.SlipGroupedPaymentDetailComposable$lambda$2$lambda$1(viewState, resources, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                LazyDslKt.LazyColumn(modifierM5143paddingVpY3zN4, null, null, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 494);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragmentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SlipGroupedPaymentDetailFragment2.SlipGroupedPaymentDetailComposable$lambda$3(viewState, resources, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(932199708);
            List listCreateListBuilder2 = CollectionsKt.createListBuilder();
            composerStartRestartGroup.startReplaceGroup(932199575);
            if (viewState.getAccount() != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            if (viewState.getDateReceived() != null) {
            }
            if (viewState.getWithheldAmount() != null) {
            }
            if (viewState.getNetCredit() != null) {
            }
            CollectionsKt.build(listCreateListBuilder2);
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(modifier4, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21591getLargeD9Ej5fM());
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(viewState) | composerStartRestartGroup.changedInstance(resources);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragmentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SlipGroupedPaymentDetailFragment2.SlipGroupedPaymentDetailComposable$lambda$2$lambda$1(viewState, resources, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                LazyDslKt.LazyColumn(modifierM5143paddingVpY3zN42, null, null, false, horizontalOrVerticalM5089spacedBy0680j_42, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 494);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SlipGroupedPaymentDetailComposable$lambda$2$lambda$1(final SlipGroupedPaymentDetailState3.Loaded loaded, final Resources resources, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (loaded.getAccount() != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(247339095, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragmentKt$SlipGroupedPaymentDetailComposable$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(247339095, i, -1, "com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailComposable.<anonymous>.<anonymous>.<anonymous> (SlipGroupedPaymentDetailFragment.kt:130)");
                    }
                    String string2 = resources.getString(C28536R.string.account_used_label);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    SlipGroupedPaymentDetailFragment2.Item(string2, StringResources6.getTextAsString(loaded.getAccount(), composer, StringResource.$stable), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        if (loaded.getDateReceived() != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-905232562, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragmentKt$SlipGroupedPaymentDetailComposable$1$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-905232562, i, -1, "com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailComposable.<anonymous>.<anonymous>.<anonymous> (SlipGroupedPaymentDetailFragment.kt:138)");
                    }
                    String string2 = resources.getString(C28536R.string.date_label);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    SlipGroupedPaymentDetailFragment2.Item(string2, loaded.getDateReceived(), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        if (!loaded.getPayments().isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-782328625, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragmentKt$SlipGroupedPaymentDetailComposable$1$1$3
                public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
                    Composer composer2 = composer;
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-782328625, i, -1, "com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailComposable.<anonymous>.<anonymous>.<anonymous> (SlipGroupedPaymentDetailFragment.kt:146)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i2).m21593getSmallD9Ej5fM(), 7, null);
                    String string2 = resources.getString(C28536R.string.grouped_symbols_label);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    BentoText2.m20747BentoText38GnDrw(string2, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer2, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i2).getTextS(), composer2, 0, 0, 8184);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM());
                    SlipGroupedPaymentDetailState3.Loaded loaded2 = loaded;
                    int i3 = 0;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
                    composer2.startReplaceGroup(209146298);
                    Iterator it = loaded2.getPayments().iterator();
                    while (it.hasNext()) {
                        SlipGroupedPaymentItem slipGroupedPaymentItem = (SlipGroupedPaymentItem) it.next();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getTop(), composer2, 6);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, i3);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        String symbol = slipGroupedPaymentItem.getSymbol();
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(symbol, null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i4).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i4).getTextM(), composer2, 0, 0, 8186);
                        BentoText2.m20747BentoText38GnDrw("+" + Money.format$default(slipGroupedPaymentItem.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i4).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i4).getTextM(), composer2, 0, 0, 8186);
                        composer.endNode();
                        it = it;
                        composer2 = composer;
                        i3 = i3;
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }
            }), 3, null);
        }
        if (loaded.getWithheldAmount() != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-659424688, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragmentKt$SlipGroupedPaymentDetailComposable$1$1$4
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-659424688, i, -1, "com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailComposable.<anonymous>.<anonymous>.<anonymous> (SlipGroupedPaymentDetailFragment.kt:177)");
                    }
                    String string2 = resources.getString(C28536R.string.backup_withholding_label);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    SlipGroupedPaymentDetailFragment2.Item(string2, "-" + Money.format$default(loaded.getWithheldAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        if (loaded.getNetCredit() != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-536520751, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragmentKt$SlipGroupedPaymentDetailComposable$1$1$5
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-536520751, i, -1, "com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailComposable.<anonymous>.<anonymous>.<anonymous> (SlipGroupedPaymentDetailFragment.kt:185)");
                    }
                    String string2 = resources.getString(C28536R.string.net_credit_label);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    SlipGroupedPaymentDetailFragment2.Item(string2, "+" + Money.format$default(loaded.getNetCredit(), null, false, null, false, 0, null, false, null, false, false, 1023, null), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Item(final String str, String str2, Composer composer, final int i) {
        int i2;
        final String str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1105535245);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str2;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1105535245, i2, -1, "com.robinhood.android.slip.lib.history.Item (SlipGroupedPaymentDetailFragment.kt:198)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composerStartRestartGroup, i2 & 14, 0, 8186);
            str3 = str2;
            BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, (i2 >> 3) & 14, 0, 8186);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlipGroupedPaymentDetailFragment2.Item$lambda$5(str, str3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
