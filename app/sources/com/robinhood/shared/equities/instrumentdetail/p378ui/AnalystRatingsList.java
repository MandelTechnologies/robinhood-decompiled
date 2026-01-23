package com.robinhood.shared.equities.instrumentdetail.p378ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.equities.instrumentdetail.p378ui.AnalystRatingsComposableState;
import com.robinhood.shared.equities.models.instrumentdetails.api.RatingType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AnalystRatingsList.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"AnalystRatingsList", "", "ratings", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$AnalystRating;", "showMoreButtonText", "Lcom/robinhood/utils/resource/StringResource;", "onShowMoreClick", "Lkotlin/Function1;", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "lib-instrument-detail-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsListKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class AnalystRatingsList {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnalystRatingsList$lambda$5(ImmutableList immutableList, StringResource stringResource, Function1 function1, int i, Composer composer, int i2) {
        AnalystRatingsList(immutableList, stringResource, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AnalystRatingsList(final ImmutableList<AnalystRatingsComposableState.AnalystRating> ratings, final StringResource showMoreButtonText, final Function1<? super AnalystRatingsComposableState.AnalystRating, Unit> onShowMoreClick, Composer composer, final int i) {
        int i2;
        Object obj;
        Composer composer2;
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        Intrinsics.checkNotNullParameter(showMoreButtonText, "showMoreButtonText");
        Intrinsics.checkNotNullParameter(onShowMoreClick, "onShowMoreClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1241256941);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(ratings) : composerStartRestartGroup.changedInstance(ratings) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(showMoreButtonText) : composerStartRestartGroup.changedInstance(showMoreButtonText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onShowMoreClick) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1241256941, i2, -1, "com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsList (AnalystRatingsList.kt:46)");
            }
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            composerStartRestartGroup.startReplaceGroup(1152998148);
            float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            final float fM7995constructorimpl = C2002Dp.m7995constructorimpl(fMo5013toDpu2uoSUM - bentoTheme.getSpacing(composerStartRestartGroup, i3).m21596getXxlargeD9Ej5fM());
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            boolean zIsScrollInProgress = lazyListStateRememberLazyListState.isScrollInProgress();
            Boolean boolValueOf = Boolean.valueOf(zIsScrollInProgress);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChanged = composerStartRestartGroup.changed(zIsScrollInProgress) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = null;
                objRememberedValue = new AnalystRatingsList2(zIsScrollInProgress, current, userInteractionEventDescriptor, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                obj = null;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, obj);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChanged2 = ((i2 & 896) == 256) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(ratings))) | composerStartRestartGroup.changed(fM7995constructorimpl) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && composerStartRestartGroup.changedInstance(showMoreButtonText)));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsListKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AnalystRatingsList.AnalystRatingsList$lambda$4$lambda$3(ratings, fM7995constructorimpl, userInteractionEventDescriptor, showMoreButtonText, onShowMoreClick, (LazyListScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue2 = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyRow(null, lazyListStateRememberLazyListState, paddingValuesM5137PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue2, composer2, 0, 489);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsListKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AnalystRatingsList.AnalystRatingsList$lambda$5(ratings, showMoreButtonText, onShowMoreClick, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnalystRatingsList$lambda$4$lambda$3(final ImmutableList immutableList, final float f, final UserInteractionEventDescriptor userInteractionEventDescriptor, final StringResource stringResource, final Function1 function1, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final C38928xb2aa1dd7 c38928xb2aa1dd7 = new Function1() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsListKt$AnalystRatingsList$lambda$4$lambda$3$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(AnalystRatingsComposableState.AnalystRating analystRating) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((AnalystRatingsComposableState.AnalystRating) obj);
            }
        };
        LazyRow.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsListKt$AnalystRatingsList$lambda$4$lambda$3$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c38928xb2aa1dd7.invoke(immutableList.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsListKt$AnalystRatingsList$lambda$4$lambda$3$$inlined$items$default$4
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
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                final AnalystRatingsComposableState.AnalystRating analystRating = (AnalystRatingsComposableState.AnalystRating) immutableList.get(i);
                composer.startReplaceGroup(1305584594);
                Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, f);
                CardDefaults cardDefaults = CardDefaults.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                CardColors cardColorsM5729cardColorsro_MJ88 = cardDefaults.m5729cardColorsro_MJ88(bentoTheme.getColors(composer, i4).m21372getBg20d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14);
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM());
                final UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                final StringResource stringResource2 = stringResource;
                final Function1 function12 = function1;
                CardKt.Card(modifierM5174width3ABfNKs, roundedCornerShapeM5327RoundedCornerShape0680j_4, cardColorsM5729cardColorsro_MJ88, null, null, ComposableLambda3.rememberComposableLambda(-1981420187, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsListKt$AnalystRatingsList$2$1$1$1

                    /* compiled from: AnalystRatingsList.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsListKt$AnalystRatingsList$2$1$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[RatingType.values().length];
                            try {
                                iArr[RatingType.BUY.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[RatingType.HOLD.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[RatingType.SELL.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                        invoke(column5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Column5 Card, Composer composer2, int i5) {
                        UserInteractionEventData.Action action;
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1981420187, i5, -1, "com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalystRatingsList.kt:77)");
                        }
                        final AnalystRatingsComposableState.AnalystRating analystRating2 = analystRating;
                        UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor2;
                        StringResource stringResource3 = stringResource2;
                        final Function1<AnalystRatingsComposableState.AnalystRating, Unit> function13 = function12;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM());
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getTop(), composer2, 6);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
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
                        long jM21425getFg0d7_KjU = bentoTheme2.getColors(composer2, i6).m21425getFg0d7_KjU();
                        FontWeight bold = FontWeight.INSTANCE.getBold();
                        StringResource title = analystRating2.getTitle();
                        int i7 = StringResource.$stable;
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(title, composer2, i7), null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, bold, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i6).getTextM(), composer2, 24576, 0, 8170);
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(analystRating2.getSource(), composer2, i7), null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16378);
                        composer2.endNode();
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                        long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer2, i6).m21425getFg0d7_KjU();
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(analystRating2.getText(), composer2, i7), modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 5, 5, null, 0, bentoTheme2.getTypography(composer2, i6).getTextM(), composer2, 817889280, 6, 6520);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer2, i6).m21592getMediumD9Ej5fM()), composer2, 0);
                        Modifier modifierAlign = column6.align(companion, companion2.getEnd());
                        Component component = new Component(Component.ComponentType.ANALYST_RATINGS_SECTION, null, null, 6, null);
                        int i8 = WhenMappings.$EnumSwitchMapping$0[analystRating2.getType().ordinal()];
                        if (i8 == 1) {
                            action = UserInteractionEventData.Action.VIEW_BULL_RATING;
                        } else if (i8 == 2) {
                            action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
                        } else {
                            if (i8 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            action = UserInteractionEventData.Action.VIEW_BEAR_RATING;
                        }
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierAlign, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor3, null, null, action, null, component, null, 43, null), false, false, false, true, false, null, 110, null);
                        long jM21456getPositive0d7_KjU = bentoTheme2.getColors(composer2, i6).m21456getPositive0d7_KjU();
                        long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                        String string2 = StringResource2.getString(stringResource3, composer2, i7);
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChanged = composer2.changed(function13) | composer2.changedInstance(analystRating2);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsListKt$AnalystRatingsList$2$1$1$1$1$2$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function13.invoke(analystRating2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, string2, modifierAutoLogEvents$default, null, null, false, false, Color.m6701boximpl(jM6725getTransparent0d7_KjU), Color.m6701boximpl(jM21456getPositive0d7_KjU), null, null, false, null, composer2, 12582912, 0, 7800);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 196608, 24);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
