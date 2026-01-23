package com.robinhood.android.crypto.tab.view;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.tab.util.CryptoNewsArticle;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.time.android.format.DurationFormatter;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.resource.StringResource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoNewsArticleComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aP\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001aB\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010\u0019\u001aJ\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020\u001d2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\u0010H\u0003¢\u0006\u0002\u0010\u001e\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u00018\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005¨\u0006\u001f"}, m3636d2 = {"CryptoNewsArticleLayoutTestTag", "", "getCryptoNewsArticleLayoutTestTag$annotations", "()V", "getCryptoNewsArticleLayoutTestTag", "()Ljava/lang/String;", "CryptoNewsArticleRelatedInstrumentTestTag", "getCryptoNewsArticleRelatedInstrumentTestTag$annotations", "getCryptoNewsArticleRelatedInstrumentTestTag", "CryptoNewsArticleComposable", "", "cryptoArticle", "Lcom/robinhood/android/crypto/tab/util/CryptoNewsArticle;", "onArticleClick", "Lkotlin/Function0;", "onRelatedInstrumentClick", "Lkotlin/Function1;", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "Lkotlin/ParameterName;", "name", "instrument", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/crypto/tab/util/CryptoNewsArticle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RelatedInstrumentSectionComposable", "(Lcom/robinhood/android/crypto/tab/util/CryptoNewsArticle;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RelatedInstrumentTextComposable", "formattedQuote", "isPositive", "", "(Ljava/lang/String;Lcom/robinhood/android/newsfeed/model/RelatedInstrument;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-crypto-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoNewsArticleComposable {
    private static final String CryptoNewsArticleLayoutTestTag = "cryptoNewsArticleLayout";
    private static final String CryptoNewsArticleRelatedInstrumentTestTag = "cryptoNewsArticleRelatedInstrument";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoNewsArticleComposable$lambda$9(CryptoNewsArticle cryptoNewsArticle, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoNewsArticleComposable(cryptoNewsArticle, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RelatedInstrumentSectionComposable$lambda$13(CryptoNewsArticle cryptoNewsArticle, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RelatedInstrumentSectionComposable(cryptoNewsArticle, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RelatedInstrumentTextComposable$lambda$16(String str, RelatedInstrument relatedInstrument, boolean z, Function1 function1, int i, Composer composer, int i2) {
        RelatedInstrumentTextComposable(str, relatedInstrument, z, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCryptoNewsArticleLayoutTestTag$annotations() {
    }

    public static /* synthetic */ void getCryptoNewsArticleRelatedInstrumentTestTag$annotations() {
    }

    public static final String getCryptoNewsArticleLayoutTestTag() {
        return CryptoNewsArticleLayoutTestTag;
    }

    public static final String getCryptoNewsArticleRelatedInstrumentTestTag() {
        return CryptoNewsArticleRelatedInstrumentTestTag;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoNewsArticleComposable(final CryptoNewsArticle cryptoArticle, final Function0<Unit> onArticleClick, final Function1<? super RelatedInstrument, Unit> onRelatedInstrumentClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final Measurer2 measurer2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final SnapshotState snapshotState;
        Object objRememberedValue4;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue5;
        final SnapshotState snapshotState2;
        final int i4;
        boolean zChanged;
        Object objRememberedValue6;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl2;
        final SnapshotState snapshotState3;
        Object objRememberedValue7;
        boolean zChangedInstance;
        Object objRememberedValue8;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(cryptoArticle, "cryptoArticle");
        Intrinsics.checkNotNullParameter(onArticleClick, "onArticleClick");
        Intrinsics.checkNotNullParameter(onRelatedInstrumentClick, "onRelatedInstrumentClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1506029553);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(cryptoArticle) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onArticleClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRelatedInstrumentClick) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1506029553, i3, -1, "com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposable (CryptoNewsArticleComposable.kt:42)");
                }
                final Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                Modifier modifierTestTag = TestTag3.testTag(ClickableKt.m4893clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), false, null, null, onArticleClick, 7, null), CryptoNewsArticleLayoutTestTag);
                composerStartRestartGroup.startReplaceGroup(-1003410150);
                composerStartRestartGroup.startReplaceGroup(212064437);
                composerStartRestartGroup.endReplaceGroup();
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Measurer2(density);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                measurer2 = (Measurer2) objRememberedValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new ConstraintLayoutScope();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                snapshotState2 = (SnapshotState) objRememberedValue5;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                i4 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                zChanged = zChangedInstance2 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposableKt$CryptoNewsArticleComposable$$inlined$ConstraintLayout$2
                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                            snapshotState2.getValue();
                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i4);
                            snapshotState.getValue();
                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                            final Measurer2 measurer22 = measurer2;
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposableKt$CryptoNewsArticleComposable$$inlined$ConstraintLayout$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                    measurer22.performLayout(placementScope, list, linkedHashMap);
                                }
                            }, 4, null);
                        }
                    };
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState3 = snapshotState;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState3 = snapshotState;
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposableKt$CryptoNewsArticleComposable$$inlined$ConstraintLayout$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            snapshotState3.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                            constraintSetForInlineDsl2.setKnownDirty(true);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                final Function0 function0 = (Function0) objRememberedValue7;
                zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposableKt$CryptoNewsArticleComposable$$inlined$ConstraintLayout$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                Modifier modifier5 = modifier4;
                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposableKt$CryptoNewsArticleComposable$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        snapshotState2.setValue(Unit.INSTANCE);
                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                        constraintLayoutScope.reset();
                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                        composer2.startReplaceGroup(283377681);
                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 12, null);
                        composer2.startReplaceGroup(1849434622);
                        Object objRememberedValue9 = composer2.rememberedValue();
                        Composer.Companion companion3 = Composer.INSTANCE;
                        if (objRememberedValue9 == companion3.getEmpty()) {
                            objRememberedValue9 = CryptoNewsArticleComposable2.INSTANCE;
                            composer2.updateRememberedValue(objRememberedValue9);
                        }
                        composer2.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(cryptoArticle.getArticle().getSource(), constraintLayoutScope2.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 24576, 0, 8172);
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i7).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged2 = composer2.changed(constraintLayoutBaseScope4Component1);
                        Object objRememberedValue10 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue10 == companion3.getEmpty()) {
                            objRememberedValue10 = new CryptoNewsArticleComposable3(constraintLayoutBaseScope4Component1);
                            composer2.updateRememberedValue(objRememberedValue10);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(modifierM5146paddingqDBjuR0$default2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10);
                        Intrinsics.checkNotNull(resources);
                        BentoText2.m20747BentoText38GnDrw(DurationFormatter.formatNarrow$default(resources, Durations.since(cryptoArticle.getArticle().getPublishedAt()), false, 4, null), modifierConstrainAs, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 0, 0, 8188);
                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM());
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged3 = composer2.changed(constraintLayoutBaseScope4Component1);
                        Object objRememberedValue11 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue11 == companion3.getEmpty()) {
                            objRememberedValue11 = new CryptoNewsArticleComposable4(constraintLayoutBaseScope4Component1);
                            composer2.updateRememberedValue(objRememberedValue11);
                        }
                        composer2.endReplaceGroup();
                        Spacer2.Spacer(constraintLayoutScope2.constrainAs(modifierM5156height3ABfNKs, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue11), composer2, 0);
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChanged4 = composer2.changed(constraintLayoutBaseScope4Component3) | composer2.changed(constraintLayoutBaseScope4Component5);
                        Object objRememberedValue12 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue12 == companion3.getEmpty()) {
                            objRememberedValue12 = new CryptoNewsArticleComposable5(constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component5);
                            composer2.updateRememberedValue(objRememberedValue12);
                        }
                        composer2.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(cryptoArticle.getArticle().getTitle(), constraintLayoutScope2.constrainAs(modifierM5144paddingVpY3zN4$default, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue12), null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextM(), composer2, 817889280, 0, 7548);
                        Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM());
                        composer2.startReplaceGroup(1849434622);
                        Object objRememberedValue13 = composer2.rememberedValue();
                        if (objRememberedValue13 == companion3.getEmpty()) {
                            objRememberedValue13 = CryptoNewsArticleComposable6.INSTANCE;
                            composer2.updateRememberedValue(objRememberedValue13);
                        }
                        composer2.endReplaceGroup();
                        Spacer2.Spacer(constraintLayoutScope2.constrainAs(modifierM5174width3ABfNKs, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue13), composer2, 0);
                        float f = 56;
                        Modifier modifierClip = Clip.clip(SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f)), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4)));
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChanged5 = composer2.changed(constraintLayoutBaseScope4Component4) | composer2.changed(constraintLayoutBaseScope4Component6);
                        Object objRememberedValue14 = composer2.rememberedValue();
                        if (zChanged5 || objRememberedValue14 == companion3.getEmpty()) {
                            objRememberedValue14 = new CryptoNewsArticleComposable7(constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component6);
                            composer2.updateRememberedValue(objRememberedValue14);
                        }
                        composer2.endReplaceGroup();
                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(cryptoArticle.getArticle().getPreviewImageUrl(), null, null, null, 0, null, composer2, 0, 62), (String) null, constraintLayoutScope2.constrainAs(modifierClip, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue14), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                        Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged6 = composer2.changed(constraintLayoutBaseScope4Component4);
                        Object objRememberedValue15 = composer2.rememberedValue();
                        if (zChanged6 || objRememberedValue15 == companion3.getEmpty()) {
                            objRememberedValue15 = new CryptoNewsArticleComposable8(constraintLayoutBaseScope4Component4);
                            composer2.updateRememberedValue(objRememberedValue15);
                        }
                        composer2.endReplaceGroup();
                        CryptoNewsArticleComposable.RelatedInstrumentSectionComposable(cryptoArticle, onRelatedInstrumentClick, constraintLayoutScope2.constrainAs(modifierM5146paddingqDBjuR0$default3, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue15), composer2, 0, 0);
                        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope2, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component7, constraintLayoutBaseScope4Component5}, 0.0f, 2, null);
                        Modifier modifierM5146paddingqDBjuR0$default4 = PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged7 = composer2.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                        Object objRememberedValue16 = composer2.rememberedValue();
                        if (zChanged7 || objRememberedValue16 == companion3.getEmpty()) {
                            objRememberedValue16 = new CryptoNewsArticleComposable9(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                            composer2.updateRememberedValue(objRememberedValue16);
                        }
                        composer2.endReplaceGroup();
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(constraintLayoutScope2.constrainAs(modifierM5146paddingqDBjuR0$default4, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue16), bentoTheme.getColors(composer2, i7).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                        composer2.endReplaceGroup();
                        if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                            EffectsKt.SideEffect(function0, composer2, 6);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), measurePolicy, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoNewsArticleComposable.CryptoNewsArticleComposable$lambda$9(cryptoArticle, onArticleClick, onRelatedInstrumentClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Modifier modifierTestTag2 = TestTag3.testTag(ClickableKt.m4893clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), false, null, null, onArticleClick, 7, null), CryptoNewsArticleLayoutTestTag);
            composerStartRestartGroup.startReplaceGroup(-1003410150);
            composerStartRestartGroup.startReplaceGroup(212064437);
            composerStartRestartGroup.endReplaceGroup();
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            measurer2 = (Measurer2) objRememberedValue;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue2;
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue3;
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
            }
            snapshotState2 = (SnapshotState) objRememberedValue5;
            boolean zChangedInstance22 = composerStartRestartGroup.changedInstance(measurer2);
            i4 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
            zChanged = zChangedInstance22 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposableKt$CryptoNewsArticleComposable$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                        final Map linkedHashMap = new LinkedHashMap();
                        snapshotState2.getValue();
                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i4);
                        snapshotState.getValue();
                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposableKt$CryptoNewsArticleComposable$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                measurer22.performLayout(placementScope, list, linkedHashMap);
                            }
                        }, 4, null);
                    }
                };
                constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                snapshotState3 = snapshotState;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                }
                final Function0 function02 = (Function0) objRememberedValue7;
                zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposableKt$CryptoNewsArticleComposable$$inlined$ConstraintLayout$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    Modifier modifier52 = modifier4;
                    LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierTestTag2, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposableKt$CryptoNewsArticleComposable$$inlined$ConstraintLayout$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            snapshotState2.setValue(Unit.INSTANCE);
                            int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                            constraintLayoutScope2.reset();
                            ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                            composer2.startReplaceGroup(283377681);
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 12, null);
                            composer2.startReplaceGroup(1849434622);
                            Object objRememberedValue9 = composer2.rememberedValue();
                            Composer.Companion companion3 = Composer.INSTANCE;
                            if (objRememberedValue9 == companion3.getEmpty()) {
                                objRememberedValue9 = CryptoNewsArticleComposable2.INSTANCE;
                                composer2.updateRememberedValue(objRememberedValue9);
                            }
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(cryptoArticle.getArticle().getSource(), constraintLayoutScope22.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 24576, 0, 8172);
                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i7).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                            composer2.startReplaceGroup(5004770);
                            boolean zChanged2 = composer2.changed(constraintLayoutBaseScope4Component1);
                            Object objRememberedValue10 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue10 == companion3.getEmpty()) {
                                objRememberedValue10 = new CryptoNewsArticleComposable3(constraintLayoutBaseScope4Component1);
                                composer2.updateRememberedValue(objRememberedValue10);
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierConstrainAs = constraintLayoutScope22.constrainAs(modifierM5146paddingqDBjuR0$default2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10);
                            Intrinsics.checkNotNull(resources2);
                            BentoText2.m20747BentoText38GnDrw(DurationFormatter.formatNarrow$default(resources2, Durations.since(cryptoArticle.getArticle().getPublishedAt()), false, 4, null), modifierConstrainAs, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 0, 0, 8188);
                            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM());
                            composer2.startReplaceGroup(5004770);
                            boolean zChanged3 = composer2.changed(constraintLayoutBaseScope4Component1);
                            Object objRememberedValue11 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue11 == companion3.getEmpty()) {
                                objRememberedValue11 = new CryptoNewsArticleComposable4(constraintLayoutBaseScope4Component1);
                                composer2.updateRememberedValue(objRememberedValue11);
                            }
                            composer2.endReplaceGroup();
                            Spacer2.Spacer(constraintLayoutScope22.constrainAs(modifierM5156height3ABfNKs, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue11), composer2, 0);
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChanged4 = composer2.changed(constraintLayoutBaseScope4Component3) | composer2.changed(constraintLayoutBaseScope4Component5);
                            Object objRememberedValue12 = composer2.rememberedValue();
                            if (zChanged4 || objRememberedValue12 == companion3.getEmpty()) {
                                objRememberedValue12 = new CryptoNewsArticleComposable5(constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component5);
                                composer2.updateRememberedValue(objRememberedValue12);
                            }
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(cryptoArticle.getArticle().getTitle(), constraintLayoutScope22.constrainAs(modifierM5144paddingVpY3zN4$default, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue12), null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextM(), composer2, 817889280, 0, 7548);
                            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM());
                            composer2.startReplaceGroup(1849434622);
                            Object objRememberedValue13 = composer2.rememberedValue();
                            if (objRememberedValue13 == companion3.getEmpty()) {
                                objRememberedValue13 = CryptoNewsArticleComposable6.INSTANCE;
                                composer2.updateRememberedValue(objRememberedValue13);
                            }
                            composer2.endReplaceGroup();
                            Spacer2.Spacer(constraintLayoutScope22.constrainAs(modifierM5174width3ABfNKs, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue13), composer2, 0);
                            float f = 56;
                            Modifier modifierClip = Clip.clip(SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f)), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4)));
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChanged5 = composer2.changed(constraintLayoutBaseScope4Component4) | composer2.changed(constraintLayoutBaseScope4Component6);
                            Object objRememberedValue14 = composer2.rememberedValue();
                            if (zChanged5 || objRememberedValue14 == companion3.getEmpty()) {
                                objRememberedValue14 = new CryptoNewsArticleComposable7(constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component6);
                                composer2.updateRememberedValue(objRememberedValue14);
                            }
                            composer2.endReplaceGroup();
                            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(cryptoArticle.getArticle().getPreviewImageUrl(), null, null, null, 0, null, composer2, 0, 62), (String) null, constraintLayoutScope22.constrainAs(modifierClip, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue14), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                            Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                            composer2.startReplaceGroup(5004770);
                            boolean zChanged6 = composer2.changed(constraintLayoutBaseScope4Component4);
                            Object objRememberedValue15 = composer2.rememberedValue();
                            if (zChanged6 || objRememberedValue15 == companion3.getEmpty()) {
                                objRememberedValue15 = new CryptoNewsArticleComposable8(constraintLayoutBaseScope4Component4);
                                composer2.updateRememberedValue(objRememberedValue15);
                            }
                            composer2.endReplaceGroup();
                            CryptoNewsArticleComposable.RelatedInstrumentSectionComposable(cryptoArticle, onRelatedInstrumentClick, constraintLayoutScope22.constrainAs(modifierM5146paddingqDBjuR0$default3, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue15), composer2, 0, 0);
                            ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope22, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component7, constraintLayoutBaseScope4Component5}, 0.0f, 2, null);
                            Modifier modifierM5146paddingqDBjuR0$default4 = PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                            composer2.startReplaceGroup(5004770);
                            boolean zChanged7 = composer2.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                            Object objRememberedValue16 = composer2.rememberedValue();
                            if (zChanged7 || objRememberedValue16 == companion3.getEmpty()) {
                                objRememberedValue16 = new CryptoNewsArticleComposable9(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                                composer2.updateRememberedValue(objRememberedValue16);
                            }
                            composer2.endReplaceGroup();
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(constraintLayoutScope22.constrainAs(modifierM5146paddingqDBjuR0$default4, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue16), bentoTheme.getColors(composer2, i7).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                            composer2.endReplaceGroup();
                            if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                EffectsKt.SideEffect(function02, composer2, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), measurePolicy2, composerStartRestartGroup, 48, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RelatedInstrumentSectionComposable(final CryptoNewsArticle cryptoNewsArticle, final Function1<? super RelatedInstrument, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(563180944);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(cryptoNewsArticle) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(563180944, i3, -1, "com.robinhood.android.crypto.tab.view.RelatedInstrumentSectionComposable (CryptoNewsArticleComposable.kt:169)");
            }
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            StringResource firstFormattedQuote = cryptoNewsArticle.getFirstFormattedQuote();
            composerStartRestartGroup.startReplaceGroup(1967519663);
            if (firstFormattedQuote != null) {
                Intrinsics.checkNotNull(resources);
                RelatedInstrumentTextComposable(firstFormattedQuote.getText(resources).toString(), cryptoNewsArticle.getArticle().getFirstInstrument(), cryptoNewsArticle.getIsFirstQuotePositive(), function1, composerStartRestartGroup, (RelatedInstrument.$stable << 3) | ((i3 << 6) & 7168));
            }
            composerStartRestartGroup.endReplaceGroup();
            StringResource secondFormattedQuote = cryptoNewsArticle.getSecondFormattedQuote();
            composerStartRestartGroup.startReplaceGroup(1967532497);
            if (secondFormattedQuote != null) {
                Intrinsics.checkNotNull(resources);
                RelatedInstrumentTextComposable(secondFormattedQuote.getText(resources).toString(), cryptoNewsArticle.getArticle().getSecondInstrument(), cryptoNewsArticle.getIsSecondQuotePositive(), function1, composerStartRestartGroup, (RelatedInstrument.$stable << 3) | ((i3 << 6) & 7168));
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoNewsArticleComposable.RelatedInstrumentSectionComposable$lambda$13(cryptoNewsArticle, function1, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RelatedInstrumentTextComposable(final String str, final RelatedInstrument relatedInstrument, final boolean z, final Function1<? super RelatedInstrument, Unit> function1, Composer composer, final int i) {
        String str2;
        int i2;
        long jM21452getNegative0d7_KjU;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2047639852);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(relatedInstrument) : composerStartRestartGroup.changedInstance(relatedInstrument) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2047639852, i2, -1, "com.robinhood.android.crypto.tab.view.RelatedInstrumentTextComposable (CryptoNewsArticleComposable.kt:199)");
            }
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(12.0f), C2002Dp.m7995constructorimpl(12.0f), 0.0f, 9, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z2 = ((i2 & 112) == 32 || ((i2 & 64) != 0 && composerStartRestartGroup.changedInstance(relatedInstrument))) | ((i2 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoNewsArticleComposable.RelatedInstrumentTextComposable$lambda$15$lambda$14(relatedInstrument, function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierTestTag = TestTag3.testTag(ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null), CryptoNewsArticleRelatedInstrumentTestTag);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS();
            FontWeight bold = FontWeight.INSTANCE.getBold();
            if (z) {
                composerStartRestartGroup.startReplaceGroup(182398876);
                jM21452getNegative0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21456getPositive0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(182454428);
                jM21452getNegative0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21452getNegative0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(str2, modifierTestTag, Color.m6701boximpl(jM21452getNegative0d7_KjU), null, bold, null, null, 0, false, 0, 0, null, 0, textS, composer2, (i2 & 14) | 24576, 0, 8168);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoNewsArticleComposable.RelatedInstrumentTextComposable$lambda$16(str, relatedInstrument, z, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RelatedInstrumentTextComposable$lambda$15$lambda$14(RelatedInstrument relatedInstrument, Function1 function1) {
        if (relatedInstrument != null) {
            function1.invoke(relatedInstrument);
        }
        return Unit.INSTANCE;
    }
}
