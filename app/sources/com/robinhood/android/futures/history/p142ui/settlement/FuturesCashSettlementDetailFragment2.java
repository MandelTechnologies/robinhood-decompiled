package com.robinhood.android.futures.history.p142ui.settlement;

import android.content.res.Resources;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
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
import com.robinhood.android.futures.history.C17229R;
import com.robinhood.android.futures.history.extensions.StringResources3;
import com.robinhood.android.futures.history.p142ui.order.FuturesOrderDetailToolbar3;
import com.robinhood.android.futures.history.p142ui.settlement.FuturesCashSettlementDetailDuxo4;
import com.robinhood.android.futures.history.p142ui.settlement.FuturesCashSettlementDetailFragment2;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: FuturesCashSettlementDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"FuturesCashSettlementContent", "", "state", "Lcom/robinhood/android/futures/history/ui/settlement/RhdCashSettlementDetailViewState;", "callbacks", "Lcom/robinhood/android/futures/history/ui/settlement/FuturesCashSettlementDetailScreenCallbacks;", "(Lcom/robinhood/android/futures/history/ui/settlement/RhdCashSettlementDetailViewState;Lcom/robinhood/android/futures/history/ui/settlement/FuturesCashSettlementDetailScreenCallbacks;Landroidx/compose/runtime/Composer;I)V", "PreviewExecutionDetail", "(Lcom/robinhood/android/futures/history/ui/settlement/RhdCashSettlementDetailViewState;Landroidx/compose/runtime/Composer;I)V", "ExecutionDetail", "Lcom/robinhood/android/futures/history/ui/settlement/RhdCashSettlementDetailViewState$Loaded;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/futures/history/ui/settlement/RhdCashSettlementDetailViewState$Loaded;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-futures-history_externalDebug", "goldSavingsLabelPositionInWindow", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.history.ui.settlement.FuturesCashSettlementDetailFragmentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesCashSettlementDetailFragment2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExecutionDetail$lambda$12(FuturesCashSettlementDetailDuxo4.Loaded loaded, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        ExecutionDetail(loaded, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesCashSettlementContent$lambda$0(FuturesCashSettlementDetailDuxo4 futuresCashSettlementDetailDuxo4, FuturesCashSettlementDetailScreenCallbacks futuresCashSettlementDetailScreenCallbacks, int i, Composer composer, int i2) {
        FuturesCashSettlementContent(futuresCashSettlementDetailDuxo4, futuresCashSettlementDetailScreenCallbacks, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewExecutionDetail$lambda$1(FuturesCashSettlementDetailDuxo4 futuresCashSettlementDetailDuxo4, int i, Composer composer, int i2) {
        PreviewExecutionDetail(futuresCashSettlementDetailDuxo4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final long ExecutionDetail$lambda$11$lambda$9$lambda$5(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FuturesCashSettlementContent(final FuturesCashSettlementDetailDuxo4 futuresCashSettlementDetailDuxo4, final FuturesCashSettlementDetailScreenCallbacks futuresCashSettlementDetailScreenCallbacks, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(981155021);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(futuresCashSettlementDetailDuxo4) : composerStartRestartGroup.changedInstance(futuresCashSettlementDetailDuxo4) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(futuresCashSettlementDetailScreenCallbacks) : composerStartRestartGroup.changedInstance(futuresCashSettlementDetailScreenCallbacks) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(981155021, i2, -1, "com.robinhood.android.futures.history.ui.settlement.FuturesCashSettlementContent (FuturesCashSettlementDetailFragment.kt:100)");
            }
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(362243985, true, new C172771(futuresCashSettlementDetailDuxo4 instanceof FuturesCashSettlementDetailDuxo4.Loaded ? (FuturesCashSettlementDetailDuxo4.Loaded) futuresCashSettlementDetailDuxo4 : null, futuresCashSettlementDetailScreenCallbacks), composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(9575132, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.history.ui.settlement.FuturesCashSettlementDetailFragmentKt.FuturesCashSettlementContent.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) throws Resources.NotFoundException {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final PaddingValues paddingValues, Composer composer3, int i3) throws Resources.NotFoundException {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i3 & 6) == 0) {
                        i3 |= composer3.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(9575132, i3, -1, "com.robinhood.android.futures.history.ui.settlement.FuturesCashSettlementContent.<anonymous> (FuturesCashSettlementDetailFragment.kt:116)");
                    }
                    FuturesCashSettlementDetailDuxo4 futuresCashSettlementDetailDuxo42 = futuresCashSettlementDetailDuxo4;
                    if (Intrinsics.areEqual(futuresCashSettlementDetailDuxo42, FuturesCashSettlementDetailDuxo4.Loading.INSTANCE)) {
                        composer3.startReplaceGroup(611771634);
                        LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(275621076, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.history.ui.settlement.FuturesCashSettlementDetailFragmentKt.FuturesCashSettlementContent.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) throws Resources.NotFoundException {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i4) throws Resources.NotFoundException {
                                if ((i4 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(275621076, i4, -1, "com.robinhood.android.futures.history.ui.settlement.FuturesCashSettlementContent.<anonymous>.<anonymous> (FuturesCashSettlementDetailFragment.kt:118)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                StringResource.Companion companion = StringResource.INSTANCE;
                                FuturesCashSettlementDetailFragment2.ExecutionDetail(new FuturesCashSettlementDetailDuxo4.Loaded(companion.invoke("---- ----- ---"), companion.invoke("---- --- -----"), null, "--------", OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, "-----", null, OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, null, Tuples4.m3642to(companion.invoke("-----"), "--------")), modifierPadding, composer4, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 3078, 6);
                        composer3.endReplaceGroup();
                    } else {
                        if (!(futuresCashSettlementDetailDuxo42 instanceof FuturesCashSettlementDetailDuxo4.Loaded)) {
                            composer3.startReplaceGroup(611769519);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(1786062754);
                        FuturesCashSettlementDetailFragment2.ExecutionDetail((FuturesCashSettlementDetailDuxo4.Loaded) futuresCashSettlementDetailDuxo4, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 805306422, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.history.ui.settlement.FuturesCashSettlementDetailFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesCashSettlementDetailFragment2.FuturesCashSettlementContent$lambda$0(futuresCashSettlementDetailDuxo4, futuresCashSettlementDetailScreenCallbacks, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: FuturesCashSettlementDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.history.ui.settlement.FuturesCashSettlementDetailFragmentKt$FuturesCashSettlementContent$1 */
    static final class C172771 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ FuturesCashSettlementDetailScreenCallbacks $callbacks;
        final /* synthetic */ FuturesCashSettlementDetailDuxo4.Loaded $loadedState;

        C172771(FuturesCashSettlementDetailDuxo4.Loaded loaded, FuturesCashSettlementDetailScreenCallbacks futuresCashSettlementDetailScreenCallbacks) {
            this.$loadedState = loaded;
            this.$callbacks = futuresCashSettlementDetailScreenCallbacks;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            FuturesExecutionToolbarCta toolbarCta;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(362243985, i, -1, "com.robinhood.android.futures.history.ui.settlement.FuturesCashSettlementContent.<anonymous> (FuturesCashSettlementDetailFragment.kt:105)");
            }
            FuturesCashSettlementDetailDuxo4.Loaded loaded = this.$loadedState;
            StringResource text = (loaded == null || (toolbarCta = loaded.getToolbarCta()) == null) ? null : toolbarCta.getText();
            FuturesCashSettlementDetailScreenCallbacks futuresCashSettlementDetailScreenCallbacks = this.$callbacks;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(futuresCashSettlementDetailScreenCallbacks);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FuturesCashSettlementDetailFragment3(futuresCashSettlementDetailScreenCallbacks);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(this.$loadedState) | composer.changedInstance(this.$callbacks);
            final FuturesCashSettlementDetailDuxo4.Loaded loaded2 = this.$loadedState;
            final FuturesCashSettlementDetailScreenCallbacks futuresCashSettlementDetailScreenCallbacks2 = this.$callbacks;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.history.ui.settlement.FuturesCashSettlementDetailFragmentKt$FuturesCashSettlementContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesCashSettlementDetailFragment2.C172771.invoke$lambda$3$lambda$2(loaded2, futuresCashSettlementDetailScreenCallbacks2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            FuturesOrderDetailToolbar3.FuturesOrderDetailToolbar(text, function0, (Function0) objRememberedValue2, composer, StringResource.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(FuturesCashSettlementDetailDuxo4.Loaded loaded, FuturesCashSettlementDetailScreenCallbacks futuresCashSettlementDetailScreenCallbacks) {
            FuturesExecutionToolbarCta toolbarCta;
            UUID contractId;
            if (loaded != null && (toolbarCta = loaded.getToolbarCta()) != null && (contractId = toolbarCta.getContractId()) != null) {
                futuresCashSettlementDetailScreenCallbacks.onViewFuturesContractCtaClicked(contractId);
            }
            return Unit.INSTANCE;
        }
    }

    private static final void PreviewExecutionDetail(final FuturesCashSettlementDetailDuxo4 futuresCashSettlementDetailDuxo4, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1646121066);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(futuresCashSettlementDetailDuxo4) : composerStartRestartGroup.changedInstance(futuresCashSettlementDetailDuxo4) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1646121066, i2, -1, "com.robinhood.android.futures.history.ui.settlement.PreviewExecutionDetail (FuturesCashSettlementDetailFragment.kt:150)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1595719458, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.history.ui.settlement.FuturesCashSettlementDetailFragmentKt.PreviewExecutionDetail.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1595719458, i3, -1, "com.robinhood.android.futures.history.ui.settlement.PreviewExecutionDetail.<anonymous> (FuturesCashSettlementDetailFragment.kt:152)");
                    }
                    FuturesCashSettlementDetailFragment2.FuturesCashSettlementContent(futuresCashSettlementDetailDuxo4, new FuturesCashSettlementDetailScreenCallbacks() { // from class: com.robinhood.android.futures.history.ui.settlement.FuturesCashSettlementDetailFragmentKt.PreviewExecutionDetail.1.1
                        @Override // com.robinhood.android.futures.history.p142ui.settlement.FuturesCashSettlementDetailScreenCallbacks
                        public void onBack() {
                        }

                        @Override // com.robinhood.android.futures.history.p142ui.settlement.FuturesCashSettlementDetailScreenCallbacks
                        public void onViewFuturesContractCtaClicked(UUID futuresContractId) {
                            Intrinsics.checkNotNullParameter(futuresContractId, "futuresContractId");
                        }
                    }, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.history.ui.settlement.FuturesCashSettlementDetailFragmentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesCashSettlementDetailFragment2.PreviewExecutionDetail$lambda$1(futuresCashSettlementDetailDuxo4, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.compose.runtime.SnapshotMutationPolicy, java.lang.Object, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExecutionDetail(final FuturesCashSettlementDetailDuxo4.Loaded loaded, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        StringResource pageSubtitle;
        Modifier.Companion companion;
        int i4;
        int i5;
        ?? r0;
        StringResource realizedPnlLabel;
        String goldSavings;
        int i6;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1007324975);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1007324975, i3, -1, "com.robinhood.android.futures.history.ui.settlement.ExecutionDetail (FuturesCashSettlementDetailFragment.kt:190)");
                }
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierVerticalScroll$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM(), 7, null);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                StringResource pageTitle = loaded.getPageTitle();
                int i9 = StringResource.$stable;
                String text = StringResources3.getText(pageTitle, composerStartRestartGroup, i9);
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i8).getDisplayCapsuleMedium();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(text, PaddingKt.m5145paddingqDBjuR0(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(0), bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i8).m21595getXsmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8188);
                composer2 = composerStartRestartGroup;
                pageSubtitle = loaded.getPageSubtitle();
                composer2.startReplaceGroup(-700045426);
                if (pageSubtitle != null) {
                    i5 = i8;
                    companion = companion4;
                    r0 = 0;
                    i4 = 2;
                } else {
                    companion = companion4;
                    i4 = 2;
                    i5 = i8;
                    r0 = 0;
                    BentoText2.m20747BentoText38GnDrw(StringResources3.getText(pageSubtitle, composer2, i9), PaddingKt.m5144paddingVpY3zN4$default(companion4, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getTextM(), composer2, 0, 0, 8188);
                    composer2 = composer2;
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                BentoDataRowState bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_executions_detail_account_label, composer2, 0), r0, i4, r0), null, null, null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_executions_detail_account_value, composer2, 0), r0, i4, r0), null, null, null, null, false, false, 4061, null);
                int i10 = BentoDataRowState.$stable;
                BentoDataRowKt.BentoDataRow(bentoDataRowState, null, null, composer2, i10, 6);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_executions_detail_settlement_time_label, composer2, 0), r0, i4, r0), null, null, null, new AnnotatedString(loaded.getSettlementTime(), r0, i4, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i10, 6);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_executions_detail_settlement_price_label, composer2, 0), r0, i4, r0), null, null, null, new AnnotatedString(loaded.getSettlementPrice(), r0, i4, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i10, 6);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_executions_detail_quantity_label, composer2, 0), r0, i4, r0), null, null, null, new AnnotatedString(loaded.getQuantity(), r0, i4, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i10, 6);
                realizedPnlLabel = loaded.getRealizedPnlLabel();
                composer2.startReplaceGroup(-700001760);
                if (realizedPnlLabel != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources3.getText(realizedPnlLabel, composer2, i9), r0, i4, r0), null, null, null, new AnnotatedString(loaded.getRealizedPnlValue(), r0, i4, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i10, 6);
                    Unit unit2 = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_executions_detail_fees_label, composer2, 0), r0, i4, r0), null, null, null, new AnnotatedString(loaded.getFees(), r0, i4, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i10, 6);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_executions_detail_commission_label, composer2, 0), r0, i4, r0), null, null, null, new AnnotatedString(loaded.getCommissions(), r0, i4, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i10, 6);
                goldSavings = loaded.getGoldSavings();
                composer2.startReplaceGroup(-699975613);
                if (goldSavings != null) {
                    i6 = i5;
                } else {
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion5 = Composer.INSTANCE;
                    if (objRememberedValue == companion5.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))), r0, i4, r0);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                    composer2.endReplaceGroup();
                    String strStringResource = StringResources_androidKt.stringResource(C17229R.string.futures_executions_detail_gold_savings, new Object[]{goldSavings}, composer2, 0);
                    int i11 = i5;
                    Composer composer3 = composer2;
                    TextStyle textStylePlus = bentoTheme.getTypography(composer2, i11).getTextS().plus(new TextStyle(GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, ExecutionDetail$lambda$11$lambda$9$lambda$5(snapshotState), null, composer3, 6, 2), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null));
                    float fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composer3, i11).m21592getMediumD9Ej5fM();
                    float fM21592getMediumD9Ej5fM2 = bentoTheme.getSpacing(composer3, i11).m21592getMediumD9Ej5fM();
                    float fM21597getXxsmallD9Ej5fM = bentoTheme.getSpacing(composer3, i11).m21597getXxsmallD9Ej5fM();
                    float fM21595getXsmallD9Ej5fM = bentoTheme.getSpacing(composer3, i11).m21595getXsmallD9Ej5fM();
                    Modifier.Companion companion6 = companion;
                    Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(companion6, fM21592getMediumD9Ej5fM, fM21597getXxsmallD9Ej5fM, fM21592getMediumD9Ej5fM2, fM21595getXsmallD9Ej5fM);
                    composer3.startReplaceGroup(5004770);
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (objRememberedValue2 == companion5.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.futures.history.ui.settlement.FuturesCashSettlementDetailFragmentKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FuturesCashSettlementDetailFragment2.ExecutionDetail$lambda$11$lambda$9$lambda$8$lambda$7(snapshotState, (LayoutCoordinates) obj);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    composer3.endReplaceGroup();
                    companion = companion6;
                    i6 = i11;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, OnGloballyPositionedModifier3.onGloballyPositioned(modifierM5145paddingqDBjuR0, (Function1) objRememberedValue2), null, null, null, null, null, 0, false, 0, 0, null, 0, textStylePlus, composer3, 0, 0, 8188);
                    composer2 = composer3;
                    Unit unit3 = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, new AnnotatedString(StringResources3.getText(loaded.getCostOrCreditLabelAndValue().getFirst(), composer2, i9), r0, i4, r0), null, null, null, new AnnotatedString(loaded.getCostOrCreditLabelAndValue().getSecond(), r0, i4, r0), null, null, null, null, false, false, 4061, null);
                int i12 = i6;
                float fM21592getMediumD9Ej5fM3 = bentoTheme.getSpacing(composer2, i12).m21592getMediumD9Ej5fM();
                Modifier.Companion companion7 = companion;
                BentoDataRowKt.BentoDataRow(bentoDataRowState2, PaddingKt.m5146paddingqDBjuR0$default(companion7, 0.0f, 0.0f, 0.0f, fM21592getMediumD9Ej5fM3, 7, null), null, composer2, i10, 4);
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion7, bentoTheme.getSpacing(composer2, i12).m21592getMediumD9Ej5fM(), 0.0f, i4, r0);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Composer composer4 = composer2;
                BentoMarkdownText2.BentoMarkdownText(StringResources_androidKt.stringResource(C17229R.string.futures_history_disclaimer_markdown, composer2, 0), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i12).getTextS(), 0, bentoTheme.getColors(composer2, i12).m21426getFg20d7_KjU(), 0L, false, composer4, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer4, MarkdownStyle.$stable << 6, 26);
                composerStartRestartGroup = composer4;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.history.ui.settlement.FuturesCashSettlementDetailFragmentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FuturesCashSettlementDetailFragment2.ExecutionDetail$lambda$12(loaded, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i82 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierVerticalScroll$default2, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i82).m21590getDefaultD9Ej5fM(), 7, null);
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                StringResource pageTitle2 = loaded.getPageTitle();
                int i92 = StringResource.$stable;
                String text2 = StringResources3.getText(pageTitle2, composerStartRestartGroup, i92);
                TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i82).getDisplayCapsuleMedium();
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(text2, PaddingKt.m5145paddingqDBjuR0(companion42, bentoTheme2.getSpacing(composerStartRestartGroup, i82).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(0), bentoTheme2.getSpacing(composerStartRestartGroup, i82).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i82).m21595getXsmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 0, 0, 8188);
                composer2 = composerStartRestartGroup;
                pageSubtitle = loaded.getPageSubtitle();
                composer2.startReplaceGroup(-700045426);
                if (pageSubtitle != null) {
                }
                composer2.endReplaceGroup();
                BentoDataRowState bentoDataRowState3 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_executions_detail_account_label, composer2, 0), r0, i4, r0), null, null, null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_executions_detail_account_value, composer2, 0), r0, i4, r0), null, null, null, null, false, false, 4061, null);
                int i102 = BentoDataRowState.$stable;
                BentoDataRowKt.BentoDataRow(bentoDataRowState3, null, null, composer2, i102, 6);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_executions_detail_settlement_time_label, composer2, 0), r0, i4, r0), null, null, null, new AnnotatedString(loaded.getSettlementTime(), r0, i4, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i102, 6);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_executions_detail_settlement_price_label, composer2, 0), r0, i4, r0), null, null, null, new AnnotatedString(loaded.getSettlementPrice(), r0, i4, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i102, 6);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_executions_detail_quantity_label, composer2, 0), r0, i4, r0), null, null, null, new AnnotatedString(loaded.getQuantity(), r0, i4, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i102, 6);
                realizedPnlLabel = loaded.getRealizedPnlLabel();
                composer2.startReplaceGroup(-700001760);
                if (realizedPnlLabel != null) {
                }
                composer2.endReplaceGroup();
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_executions_detail_fees_label, composer2, 0), r0, i4, r0), null, null, null, new AnnotatedString(loaded.getFees(), r0, i4, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i102, 6);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_executions_detail_commission_label, composer2, 0), r0, i4, r0), null, null, null, new AnnotatedString(loaded.getCommissions(), r0, i4, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i102, 6);
                goldSavings = loaded.getGoldSavings();
                composer2.startReplaceGroup(-699975613);
                if (goldSavings != null) {
                }
                composer2.endReplaceGroup();
                BentoDataRowState bentoDataRowState22 = new BentoDataRowState(null, new AnnotatedString(StringResources3.getText(loaded.getCostOrCreditLabelAndValue().getFirst(), composer2, i92), r0, i4, r0), null, null, null, new AnnotatedString(loaded.getCostOrCreditLabelAndValue().getSecond(), r0, i4, r0), null, null, null, null, false, false, 4061, null);
                int i122 = i6;
                float fM21592getMediumD9Ej5fM32 = bentoTheme2.getSpacing(composer2, i122).m21592getMediumD9Ej5fM();
                Modifier.Companion companion72 = companion;
                BentoDataRowKt.BentoDataRow(bentoDataRowState22, PaddingKt.m5146paddingqDBjuR0$default(companion72, 0.0f, 0.0f, 0.0f, fM21592getMediumD9Ej5fM32, 7, null), null, composer2, i102, 4);
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion72, bentoTheme2.getSpacing(composer2, i122).m21592getMediumD9Ej5fM(), 0.0f, i4, r0);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default2);
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composer2.getApplier() == null) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Composer composer42 = composer2;
                    BentoMarkdownText2.BentoMarkdownText(StringResources_androidKt.stringResource(C17229R.string.futures_history_disclaimer_markdown, composer2, 0), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer2, i122).getTextS(), 0, bentoTheme2.getColors(composer2, i122).m21426getFg20d7_KjU(), 0L, false, composer42, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer42, MarkdownStyle.$stable << 6, 26);
                    composerStartRestartGroup = composer42;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void ExecutionDetail$lambda$11$lambda$9$lambda$6(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExecutionDetail$lambda$11$lambda$9$lambda$8$lambda$7(SnapshotState snapshotState, LayoutCoordinates lc) {
        Intrinsics.checkNotNullParameter(lc, "lc");
        ExecutionDetail$lambda$11$lambda$9$lambda$6(snapshotState, LayoutCoordinates2.positionInWindow(lc));
        return Unit.INSTANCE;
    }
}
