package com.robinhood.android.support.call;

import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.support.call.ReviewCallDetailsComposable;
import com.robinhood.android.support.call.ReviewCallDetailsViewState;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.shared.support.C39996R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ReviewCallDetailsComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\n\u001a7\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000f\u001a#\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"ReviewCallDetailsComposable", "", "viewState", "Lcom/robinhood/android/support/call/ReviewCallDetailsViewState;", "onRetryFetchDetails", "Lkotlin/Function0;", "onClickEditChannel", "Lkotlin/Function1;", "", "onClickRequestCall", "(Lcom/robinhood/android/support/call/ReviewCallDetailsViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ReviewCallDetailsContentComposable", "Lcom/robinhood/android/support/call/ReviewCallDetailsViewState$Loaded;", "(Lcom/robinhood/android/support/call/ReviewCallDetailsViewState$Loaded;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ReviewCallDetailsLoadingComposable", "(Landroidx/compose/runtime/Composer;I)V", "ReviewCallDetailsErrorComposable", "errorMessage", "", "onRetry", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PreviewReviewCallDetailsComposable", "(Lcom/robinhood/android/support/call/ReviewCallDetailsViewState;Landroidx/compose/runtime/Composer;I)V", "feature-support_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.support.call.ReviewCallDetailsComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ReviewCallDetailsComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewReviewCallDetailsComposable$lambda$13(ReviewCallDetailsViewState reviewCallDetailsViewState, int i, Composer composer, int i2) {
        PreviewReviewCallDetailsComposable(reviewCallDetailsViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewCallDetailsComposable$lambda$0(ReviewCallDetailsViewState reviewCallDetailsViewState, Function0 function0, Function1 function1, Function0 function02, int i, Composer composer, int i2) {
        ReviewCallDetailsComposable(reviewCallDetailsViewState, function0, function1, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewCallDetailsContentComposable$lambda$9(ReviewCallDetailsViewState.Loaded loaded, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        ReviewCallDetailsContentComposable(loaded, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewCallDetailsErrorComposable$lambda$12(String str, Function0 function0, int i, Composer composer, int i2) {
        ReviewCallDetailsErrorComposable(str, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewCallDetailsLoadingComposable$lambda$11(int i, Composer composer, int i2) {
        ReviewCallDetailsLoadingComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ReviewCallDetailsComposable(final ReviewCallDetailsViewState viewState, final Function0<Unit> onRetryFetchDetails, final Function1<? super Boolean, Unit> onClickEditChannel, final Function0<Unit> onClickRequestCall, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onRetryFetchDetails, "onRetryFetchDetails");
        Intrinsics.checkNotNullParameter(onClickEditChannel, "onClickEditChannel");
        Intrinsics.checkNotNullParameter(onClickRequestCall, "onClickRequestCall");
        Composer composerStartRestartGroup = composer.startRestartGroup(1154992214);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRetryFetchDetails) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickEditChannel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickRequestCall) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1154992214, i2, -1, "com.robinhood.android.support.call.ReviewCallDetailsComposable (ReviewCallDetailsComposable.kt:40)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1755274027, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.call.ReviewCallDetailsComposableKt.ReviewCallDetailsComposable.1
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
                        ComposerKt.traceEventStart(1755274027, i3, -1, "com.robinhood.android.support.call.ReviewCallDetailsComposable.<anonymous> (ReviewCallDetailsComposable.kt:42)");
                    }
                    ReviewCallDetailsViewState reviewCallDetailsViewState = viewState;
                    if (reviewCallDetailsViewState instanceof ReviewCallDetailsViewState.Loading) {
                        composer2.startReplaceGroup(-1103802182);
                        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "LOADING_STATE");
                        final Function1<Boolean, Unit> function1 = onClickEditChannel;
                        final Function0<Unit> function0 = onClickRequestCall;
                        LocalShowPlaceholder.Loadable(true, modifierTestTag, null, ComposableLambda3.rememberComposableLambda(-25822941, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.call.ReviewCallDetailsComposableKt.ReviewCallDetailsComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i4) {
                                if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-25822941, i4, -1, "com.robinhood.android.support.call.ReviewCallDetailsComposable.<anonymous>.<anonymous> (ReviewCallDetailsComposable.kt:47)");
                                }
                                ReviewCallDetailsComposable.ReviewCallDetailsContentComposable(new ReviewCallDetailsViewState.Loaded("-------- ---- ------", new RichText("------ ---------- ---- --------", CollectionsKt.emptyList()), new RichText("------ ---------- ---- --------", CollectionsKt.emptyList()), "555-555-5555", true, true, true, true), function1, function0, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3078, 4);
                        composer2.endReplaceGroup();
                    } else if (reviewCallDetailsViewState instanceof ReviewCallDetailsViewState.Failed) {
                        composer2.startReplaceGroup(-1103773107);
                        String errorMessage = ((ReviewCallDetailsViewState.Failed) viewState).getErrorMessage();
                        composer2.startReplaceGroup(-1103771270);
                        if (errorMessage == null) {
                            errorMessage = StringResources_androidKt.stringResource(C39996R.string.review_call_details_issue_review_detail_fail, composer2, 0);
                        }
                        composer2.endReplaceGroup();
                        ReviewCallDetailsComposable.ReviewCallDetailsErrorComposable(errorMessage, onRetryFetchDetails, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(reviewCallDetailsViewState instanceof ReviewCallDetailsViewState.Loaded)) {
                            composer2.startReplaceGroup(-1103803772);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-1103764315);
                        ReviewCallDetailsComposable.ReviewCallDetailsContentComposable((ReviewCallDetailsViewState.Loaded) viewState, onClickEditChannel, onClickRequestCall, composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.call.ReviewCallDetailsComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReviewCallDetailsComposable.ReviewCallDetailsComposable$lambda$0(viewState, onRetryFetchDetails, onClickEditChannel, onClickRequestCall, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ReviewCallDetailsContentComposable(final ReviewCallDetailsViewState.Loaded loaded, final Function1<? super Boolean, Unit> function1, Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(536564754);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(536564754, i2, -1, "com.robinhood.android.support.call.ReviewCallDetailsContentComposable (ReviewCallDetailsComposable.kt:82)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(TestTag3.testTag(companion, "SUCCESS_STATE"), 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            String title = loaded.getTitle();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            int i4 = i2;
            BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5144paddingVpY3zN4$default(TestTag3.testTag(companion, "TITLE_TEXT"), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            BentoRichText.m15948BentoRichText0sCZWFg(loaded.getDescription(), PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(companion, "DESCRIPTION_TEXT"), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 8, null), bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composerStartRestartGroup, 0, 1016);
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Modifier modifierTestTag = TestTag3.testTag(companion, "PHONE_DETAILS_ROW");
            String strStringResource = StringResources_androidKt.stringResource(C39996R.string.review_call_details_phone_number_title, composerStartRestartGroup, 0);
            String displayPhoneNumber = loaded.getDisplayPhoneNumber();
            boolean z = !loaded.isRequestingSupport();
            composerStartRestartGroup.startReplaceGroup(-64737435);
            BentoBaseRowState.Meta.CallToAction callToAction = loaded.getCanEditPhoneNumber() ? new BentoBaseRowState.Meta.CallToAction(StringResources_androidKt.stringResource(C39996R.string.review_call_details_edit_phone, composerStartRestartGroup, 0), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21368getAccent0d7_KjU()), null) : null;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(loaded) | ((i4 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.support.call.ReviewCallDetailsComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReviewCallDetailsComposable.m2480x92bbf994(function1, loaded);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierTestTag, null, strStringResource, displayPhoneNumber, null, callToAction, null, false, z, false, 0L, (Function0) objRememberedValue, composerStartRestartGroup, BentoBaseRowState.Meta.CallToAction.$stable << 15, 0, 1746);
            composerStartRestartGroup.endNode();
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            final UriHandler uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
            RichText disclosure = loaded.getDisclosure();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(TestTag3.testTag(companion, "DISCLOSURE_TEXT"), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
            TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744447, (DefaultConstructorMarker) null);
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(uriHandler);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.support.call.ReviewCallDetailsComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ReviewCallDetailsComposable.ReviewCallDetailsContentComposable$lambda$8$lambda$5$lambda$4(uriHandler, (Uri) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoRichText.m15948BentoRichText0sCZWFg(disclosure, modifierFillMaxWidth$default, textStyle, jM21426getFg20d7_KjU, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) objRememberedValue2, composerStartRestartGroup, 0, 496);
            String strStringResource2 = StringResources_androidKt.stringResource(C39996R.string.review_call_details_request_call, composerStartRestartGroup, 0);
            boolean zIsRequestingSupport = loaded.isRequestingSupport();
            boolean canRequestPhoneCall = loaded.getCanRequestPhoneCall();
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxWidth$default(PaddingKt.m5142padding3ABfNKs(TestTag3.testTag(companion, "CTA_BUTTON"), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), 0.0f, 1, null));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(loaded) | ((i4 & 896) == 256);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                function02 = function0;
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.support.call.ReviewCallDetailsComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReviewCallDetailsComposable.ReviewCallDetailsContentComposable$lambda$8$lambda$7$lambda$6(loaded, function02);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                function02 = function0;
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, strStringResource2, modifierNavigationBarsPadding, null, null, canRequestPhoneCall, zIsRequestingSupport, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8088);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.call.ReviewCallDetailsComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReviewCallDetailsComposable.ReviewCallDetailsContentComposable$lambda$9(loaded, function1, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ReviewCallDetailsContentComposable$lambda$8$lambda$3$lambda$2$lambda$1 */
    public static final Unit m2480x92bbf994(Function1 function1, ReviewCallDetailsViewState.Loaded loaded) {
        function1.invoke(Boolean.valueOf(loaded.isLoggedIn()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewCallDetailsContentComposable$lambda$8$lambda$5$lambda$4(UriHandler uriHandler, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String string2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        uriHandler.openUri(string2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewCallDetailsContentComposable$lambda$8$lambda$7$lambda$6(ReviewCallDetailsViewState.Loaded loaded, Function0 function0) {
        if (loaded.isRequestingSupport()) {
            return Unit.INSTANCE;
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void ReviewCallDetailsLoadingComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(857701617);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(857701617, i, -1, "com.robinhood.android.support.call.ReviewCallDetailsLoadingComposable (ReviewCallDetailsComposable.kt:172)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(TestTag3.testTag(companion, "LOADING_STATE"), 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(BoxScopeInstance.INSTANCE.align(companion, companion2.getCenter()), null, 0L, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.call.ReviewCallDetailsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReviewCallDetailsComposable.ReviewCallDetailsLoadingComposable$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ReviewCallDetailsErrorComposable(String errorMessage, Function0<Unit> onRetry, Composer composer, final int i) {
        int i2;
        final String str;
        final Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(onRetry, "onRetry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-794698846);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(errorMessage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRetry) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-794698846, i2, -1, "com.robinhood.android.support.call.ReviewCallDetailsErrorComposable (ReviewCallDetailsComposable.kt:188)");
            }
            str = errorMessage;
            function0 = onRetry;
            ErrorScreenComposable.ErrorScreenComposable(TestTag3.testTag(Modifier.INSTANCE, "ERROR_STATE"), function0, 0, null, str, null, null, false, composerStartRestartGroup, (i2 & 112) | ((i2 << 12) & 57344), EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str = errorMessage;
            function0 = onRetry;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.call.ReviewCallDetailsComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReviewCallDetailsComposable.ReviewCallDetailsErrorComposable$lambda$12(str, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ReviewCallDetailsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.support.call.ReviewCallDetailsComposableKt$PreviewReviewCallDetailsComposable$1 */
    static final class C288891 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ReviewCallDetailsViewState $viewState;

        C288891(ReviewCallDetailsViewState reviewCallDetailsViewState) {
            this.$viewState = reviewCallDetailsViewState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2144915147, i, -1, "com.robinhood.android.support.call.PreviewReviewCallDetailsComposable.<anonymous> (ReviewCallDetailsComposable.kt:203)");
            }
            ReviewCallDetailsViewState reviewCallDetailsViewState = this.$viewState;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.support.call.ReviewCallDetailsComposableKt$PreviewReviewCallDetailsComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.support.call.ReviewCallDetailsComposableKt$PreviewReviewCallDetailsComposable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ReviewCallDetailsComposable.C288891.invoke$lambda$3$lambda$2(((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.support.call.ReviewCallDetailsComposableKt$PreviewReviewCallDetailsComposable$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            ReviewCallDetailsComposable.ReviewCallDetailsComposable(reviewCallDetailsViewState, function0, function1, (Function0) objRememberedValue3, composer, 3504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(boolean z) {
            return Unit.INSTANCE;
        }
    }

    public static final void PreviewReviewCallDetailsComposable(final ReviewCallDetailsViewState viewState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(176622973);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(176622973, i2, -1, "com.robinhood.android.support.call.PreviewReviewCallDetailsComposable (ReviewCallDetailsComposable.kt:201)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-2144915147, true, new C288891(viewState), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.call.ReviewCallDetailsComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReviewCallDetailsComposable.PreviewReviewCallDetailsComposable$lambda$13(viewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
