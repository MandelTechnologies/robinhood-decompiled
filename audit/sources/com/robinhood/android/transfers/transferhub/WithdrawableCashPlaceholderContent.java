package com.robinhood.android.transfers.transferhub;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WithdrawableCashPlaceholderContent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"WithdrawableCashPlaceholderContent", "", "themeStream", "Lio/reactivex/Observable;", "Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lio/reactivex/Observable;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-transfer-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.transferhub.WithdrawableCashPlaceholderContentKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class WithdrawableCashPlaceholderContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WithdrawableCashPlaceholderContent$lambda$0(Observable observable, Modifier modifier, int i, int i2, Composer composer, int i3) {
        WithdrawableCashPlaceholderContent(observable, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* compiled from: WithdrawableCashPlaceholderContent.kt */
    @Metadata(m3635d1 = {"\u0000!\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, m3636d2 = {"com/robinhood/android/transfers/transferhub/WithdrawableCashPlaceholderContentKt$WithdrawableCashPlaceholderContent$SizeParameters", "", "top", "", "end", "width", "<init>", "(IILjava/lang/Integer;)V", "getTop", "()I", "getEnd", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(IILjava/lang/Integer;)Lcom/robinhood/android/transfers/transferhub/WithdrawableCashPlaceholderContentKt$WithdrawableCashPlaceholderContent$SizeParameters;", "equals", "", "other", "hashCode", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.transferhub.WithdrawableCashPlaceholderContentKt$WithdrawableCashPlaceholderContent$SizeParameters, reason: from toString */
    public static final /* data */ class SizeParameters {
        private final int end;
        private final int top;
        private final Integer width;

        public static /* synthetic */ SizeParameters copy$default(SizeParameters sizeParameters, int i, int i2, Integer num, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = sizeParameters.top;
            }
            if ((i3 & 2) != 0) {
                i2 = sizeParameters.end;
            }
            if ((i3 & 4) != 0) {
                num = sizeParameters.width;
            }
            return sizeParameters.copy(i, i2, num);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTop() {
            return this.top;
        }

        /* renamed from: component2, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getWidth() {
            return this.width;
        }

        public final SizeParameters copy(int top, int end, Integer width) {
            return new SizeParameters(top, end, width);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SizeParameters)) {
                return false;
            }
            SizeParameters sizeParameters = (SizeParameters) other;
            return this.top == sizeParameters.top && this.end == sizeParameters.end && Intrinsics.areEqual(this.width, sizeParameters.width);
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.top) * 31) + Integer.hashCode(this.end)) * 31;
            Integer num = this.width;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "SizeParameters(top=" + this.top + ", end=" + this.end + ", width=" + this.width + ")";
        }

        public SizeParameters(int i, int i2, Integer num) {
            this.top = i;
            this.end = i2;
            this.width = num;
        }

        public /* synthetic */ SizeParameters(int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 5 : i, (i3 & 2) != 0 ? 50 : i2, (i3 & 4) != 0 ? null : num);
        }

        public final int getTop() {
            return this.top;
        }

        public final int getEnd() {
            return this.end;
        }

        public final Integer getWidth() {
            return this.width;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WithdrawableCashPlaceholderContent(final Observable<ThemesFromScarlet> themeStream, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(themeStream, "themeStream");
        Composer composerStartRestartGroup = composer.startRestartGroup(-746542802);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(themeStream) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-746542802, i3, -1, "com.robinhood.android.transfers.transferhub.WithdrawableCashPlaceholderContent (WithdrawableCashPlaceholderContent.kt:23)");
                }
                final List listListOf = CollectionsKt.listOf((Object[]) new SizeParameters[]{new SizeParameters(0, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, null, 5, null), new SizeParameters(0, 50, null, 5, null), new SizeParameters(0, 20, null, 5, null), new SizeParameters(0, 0, Integer.valueOf(EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE), 3, null), new SizeParameters(10, 0, 250, 2, null), new SizeParameters(2, 0, Integer.valueOf(EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE), 2, null)});
                BentoTheme2.BentoTheme(themeStream, null, ComposableLambda3.rememberComposableLambda(1171545148, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.transferhub.WithdrawableCashPlaceholderContentKt.WithdrawableCashPlaceholderContent.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1171545148, i5, -1, "com.robinhood.android.transfers.transferhub.WithdrawableCashPlaceholderContent.<anonymous> (WithdrawableCashPlaceholderContent.kt:53)");
                        }
                        final List<SizeParameters> list = listListOf;
                        final Modifier modifier4 = modifier3;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-79754159, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.transferhub.WithdrawableCashPlaceholderContentKt.WithdrawableCashPlaceholderContent.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-79754159, i6, -1, "com.robinhood.android.transfers.transferhub.WithdrawableCashPlaceholderContent.<anonymous>.<anonymous> (WithdrawableCashPlaceholderContent.kt:54)");
                                }
                                List<SizeParameters> list2 = list;
                                Modifier modifier5 = modifier4;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
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
                                composer3.startReplaceGroup(-273809544);
                                for (SizeParameters sizeParameters : list2) {
                                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier5, 0.0f, composer3, 0, 1);
                                    BoxKt.Box(SizeKt.m5156height3ABfNKs(ModifiersKt.bentoPlaceholder(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(sizeParameters.getWidth() != null ? SizeKt.m5174width3ABfNKs(modifierM21623defaultHorizontalPaddingrAjV9yQ, C2002Dp.m7995constructorimpl(sizeParameters.getWidth().intValue())) : SizeKt.fillMaxWidth$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(sizeParameters.getTop()), C2002Dp.m7995constructorimpl(sizeParameters.getEnd()), 0.0f, 9, null), true, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(16))), C2002Dp.m7995constructorimpl(24)), composer3, 0);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.transferhub.WithdrawableCashPlaceholderContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return WithdrawableCashPlaceholderContent.WithdrawableCashPlaceholderContent$lambda$0(themeStream, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final List<SizeParameters> listListOf2 = CollectionsKt.listOf((Object[]) new SizeParameters[]{new SizeParameters(0, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, null, 5, null), new SizeParameters(0, 50, null, 5, null), new SizeParameters(0, 20, null, 5, null), new SizeParameters(0, 0, Integer.valueOf(EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE), 3, null), new SizeParameters(10, 0, 250, 2, null), new SizeParameters(2, 0, Integer.valueOf(EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE), 2, null)});
            BentoTheme2.BentoTheme(themeStream, null, ComposableLambda3.rememberComposableLambda(1171545148, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.transferhub.WithdrawableCashPlaceholderContentKt.WithdrawableCashPlaceholderContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1171545148, i5, -1, "com.robinhood.android.transfers.transferhub.WithdrawableCashPlaceholderContent.<anonymous> (WithdrawableCashPlaceholderContent.kt:53)");
                    }
                    final List<SizeParameters> list = listListOf2;
                    final Modifier modifier4 = modifier3;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-79754159, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.transferhub.WithdrawableCashPlaceholderContentKt.WithdrawableCashPlaceholderContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-79754159, i6, -1, "com.robinhood.android.transfers.transferhub.WithdrawableCashPlaceholderContent.<anonymous>.<anonymous> (WithdrawableCashPlaceholderContent.kt:54)");
                            }
                            List<SizeParameters> list2 = list;
                            Modifier modifier5 = modifier4;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
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
                            composer3.startReplaceGroup(-273809544);
                            for (SizeParameters sizeParameters : list2) {
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier5, 0.0f, composer3, 0, 1);
                                BoxKt.Box(SizeKt.m5156height3ABfNKs(ModifiersKt.bentoPlaceholder(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(sizeParameters.getWidth() != null ? SizeKt.m5174width3ABfNKs(modifierM21623defaultHorizontalPaddingrAjV9yQ, C2002Dp.m7995constructorimpl(sizeParameters.getWidth().intValue())) : SizeKt.fillMaxWidth$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(sizeParameters.getTop()), C2002Dp.m7995constructorimpl(sizeParameters.getEnd()), 0.0f, 9, null), true, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(16))), C2002Dp.m7995constructorimpl(24)), composer3, 0);
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
