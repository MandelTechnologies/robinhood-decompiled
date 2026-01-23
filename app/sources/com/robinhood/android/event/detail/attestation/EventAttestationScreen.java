package com.robinhood.android.event.detail.attestation;

import androidx.compose.animation.AnimationModifier;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.event.detail.C16095R;
import com.robinhood.android.event.detail.attestation.EventAttestationDuxo5;
import com.robinhood.android.event.detail.attestation.EventAttestationScreen;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.ButtonStyle;
import com.robinhood.shared.common.agreementview.AgreementScaffold;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EventAttestationScreen.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00012\b\b\u0001\u0010\u000e\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000f\u001a\b\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, m3636d2 = {"EventAttestationScreen", "", "state", "Lcom/robinhood/android/event/detail/attestation/EventAttestationViewState;", "onTryAgainClick", "Lkotlin/Function0;", "onAgreementClicked", "Lkotlin/Function1;", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "onBackClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/detail/attestation/EventAttestationViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewEventAttestationScreen", "viewState", "(Lcom/robinhood/android/event/detail/attestation/EventAttestationViewState;Landroidx/compose/runtime/Composer;I)V", "loremIpsum", "", "feature-event-detail_externalDebug", "hasScrolledToBottom", "", "textColor", "Landroidx/compose/ui/graphics/Color;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.attestation.EventAttestationScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventAttestationScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventAttestationScreen$lambda$4(EventAttestationDuxo5 eventAttestationDuxo5, Function0 function0, Function1 function1, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventAttestationScreen(eventAttestationDuxo5, function0, function1, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewEventAttestationScreen$lambda$5(EventAttestationDuxo5 eventAttestationDuxo5, int i, Composer composer, int i2) {
        PreviewEventAttestationScreen(eventAttestationDuxo5, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventAttestationScreen(final EventAttestationDuxo5 state, final Function0<Unit> onTryAgainClick, final Function1<? super UiAgreementWithContent, Unit> onAgreementClicked, final Function0<Unit> onBackClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        final ScrollState scrollStateRememberScrollState;
        Object objRememberedValue2;
        SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onTryAgainClick, "onTryAgainClick");
        Intrinsics.checkNotNullParameter(onAgreementClicked, "onAgreementClicked");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1687771605);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTryAgainClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAgreementClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1687771605, i4, -1, "com.robinhood.android.event.detail.attestation.EventAttestationScreen (EventAttestationScreen.kt:57)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf = Boolean.valueOf(scrollStateRememberScrollState.getCanScrollForward());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new EventAttestationScreen2(scrollStateRememberScrollState, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                Modifier modifier5 = modifier4;
                int i6 = i4 >> 6;
                AgreementScaffold.AgreementScaffold(StringResources_androidKt.stringResource(C16095R.string.event_detail_attestation_title, composerStartRestartGroup, 0), onBackClicked, modifier5, state instanceof EventAttestationDuxo5.Loading, true, ComposableLambda3.rememberComposableLambda(-631611003, true, new C161112(state, onAgreementClicked, coroutineScope, scrollStateRememberScrollState, onBackClicked, snapshotState), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1340776119, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.attestation.EventAttestationScreenKt.EventAttestationScreen.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer2, int i7) {
                        int i8;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i8 = i7 | (composer2.changed(paddingValues) ? 4 : 2);
                        } else {
                            i8 = i7;
                        }
                        if ((i8 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1340776119, i8, -1, "com.robinhood.android.event.detail.attestation.EventAttestationScreen.<anonymous> (EventAttestationScreen.kt:144)");
                        }
                        EventAttestationDuxo5 eventAttestationDuxo5 = state;
                        if (Intrinsics.areEqual(eventAttestationDuxo5, EventAttestationDuxo5.Loading.INSTANCE)) {
                            composer2.startReplaceGroup(134598313);
                            LoadingScreenComposablesKt.GenericTextLoadingScreenComposable(SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), false, true, composer2, 432, 0);
                            composer2.endReplaceGroup();
                        } else if (eventAttestationDuxo5 instanceof EventAttestationDuxo5.Error) {
                            composer2.startReplaceGroup(134924030);
                            ErrorScreenComposable.ErrorScreenComposable(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), onTryAgainClick, 0, null, null, null, null, false, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                            composer2.endReplaceGroup();
                        } else {
                            if (!(eventAttestationDuxo5 instanceof EventAttestationDuxo5.Loaded)) {
                                composer2.startReplaceGroup(4340664);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(135267448);
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(ScrollKt.verticalScroll$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), scrollStateRememberScrollState, false, null, false, 14, null), 0.0f, 1, null);
                            EventAttestationDuxo5 eventAttestationDuxo52 = state;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
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
                            BentoMarkdownText2.BentoMarkdownText(((EventAttestationDuxo5.Loaded) eventAttestationDuxo52).getAgreement().getContent(), (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, 0, 30);
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i6 & 112) | 1794048 | (i6 & 896), 0);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.attestation.EventAttestationScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventAttestationScreen.EventAttestationScreen$lambda$4(state, onTryAgainClick, onAgreementClicked, onBackClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolValueOf2 = Boolean.valueOf(scrollStateRememberScrollState.getCanScrollForward());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue3 = new EventAttestationScreen2(scrollStateRememberScrollState, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                Modifier modifier52 = modifier4;
                int i62 = i4 >> 6;
                AgreementScaffold.AgreementScaffold(StringResources_androidKt.stringResource(C16095R.string.event_detail_attestation_title, composerStartRestartGroup, 0), onBackClicked, modifier52, state instanceof EventAttestationDuxo5.Loading, true, ComposableLambda3.rememberComposableLambda(-631611003, true, new C161112(state, onAgreementClicked, coroutineScope2, scrollStateRememberScrollState, onBackClicked, snapshotState), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1340776119, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.attestation.EventAttestationScreenKt.EventAttestationScreen.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer2, int i7) {
                        int i8;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i8 = i7 | (composer2.changed(paddingValues) ? 4 : 2);
                        } else {
                            i8 = i7;
                        }
                        if ((i8 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1340776119, i8, -1, "com.robinhood.android.event.detail.attestation.EventAttestationScreen.<anonymous> (EventAttestationScreen.kt:144)");
                        }
                        EventAttestationDuxo5 eventAttestationDuxo5 = state;
                        if (Intrinsics.areEqual(eventAttestationDuxo5, EventAttestationDuxo5.Loading.INSTANCE)) {
                            composer2.startReplaceGroup(134598313);
                            LoadingScreenComposablesKt.GenericTextLoadingScreenComposable(SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), false, true, composer2, 432, 0);
                            composer2.endReplaceGroup();
                        } else if (eventAttestationDuxo5 instanceof EventAttestationDuxo5.Error) {
                            composer2.startReplaceGroup(134924030);
                            ErrorScreenComposable.ErrorScreenComposable(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), onTryAgainClick, 0, null, null, null, null, false, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                            composer2.endReplaceGroup();
                        } else {
                            if (!(eventAttestationDuxo5 instanceof EventAttestationDuxo5.Loaded)) {
                                composer2.startReplaceGroup(4340664);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(135267448);
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(ScrollKt.verticalScroll$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), scrollStateRememberScrollState, false, null, false, 14, null), 0.0f, 1, null);
                            EventAttestationDuxo5 eventAttestationDuxo52 = state;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
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
                            BentoMarkdownText2.BentoMarkdownText(((EventAttestationDuxo5.Loaded) eventAttestationDuxo52).getAgreement().getContent(), (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, 0, 30);
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i62 & 112) | 1794048 | (i62 & 896), 0);
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
    public static final void EventAttestationScreen$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: EventAttestationScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.detail.attestation.EventAttestationScreenKt$EventAttestationScreen$2 */
    static final class C161112 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ SnapshotState<Boolean> $hasScrolledToBottom$delegate;
        final /* synthetic */ Function1<UiAgreementWithContent, Unit> $onAgreementClicked;
        final /* synthetic */ Function0<Unit> $onBackClicked;
        final /* synthetic */ ScrollState $scrollState;
        final /* synthetic */ EventAttestationDuxo5 $state;

        /* JADX WARN: Multi-variable type inference failed */
        C161112(EventAttestationDuxo5 eventAttestationDuxo5, Function1<? super UiAgreementWithContent, Unit> function1, CoroutineScope coroutineScope, ScrollState scrollState, Function0<Unit> function0, SnapshotState<Boolean> snapshotState) {
            this.$state = eventAttestationDuxo5;
            this.$onAgreementClicked = function1;
            this.$coroutineScope = coroutineScope;
            this.$scrollState = scrollState;
            this.$onBackClicked = function0;
            this.$hasScrolledToBottom$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        private static final long invoke$lambda$3$lambda$2(SnapshotState4<Color> snapshotState4) {
            return snapshotState4.getValue().getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r0v7 */
        public final void invoke(Composer composer, int i) {
            Modifier.Companion companion;
            EventAttestationDuxo5 eventAttestationDuxo5;
            Function1<UiAgreementWithContent, Unit> function1;
            CoroutineScope coroutineScope;
            ScrollState scrollState;
            Function0<Unit> function0;
            SnapshotState<Boolean> snapshotState;
            ?? r0;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-631611003, i, -1, "com.robinhood.android.event.detail.attestation.EventAttestationScreen.<anonymous> (EventAttestationScreen.kt:74)");
            }
            if (this.$state instanceof EventAttestationDuxo5.Loaded) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(AnimationModifier.animateContentSize$default(companion2, null, null, 3, null), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()));
                EventAttestationDuxo5 eventAttestationDuxo52 = this.$state;
                Function1<UiAgreementWithContent, Unit> function12 = this.$onAgreementClicked;
                CoroutineScope coroutineScope2 = this.$coroutineScope;
                ScrollState scrollState2 = this.$scrollState;
                Function0<Unit> function02 = this.$onBackClicked;
                SnapshotState<Boolean> snapshotState2 = this.$hasScrolledToBottom$delegate;
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierWindowInsetsPadding);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composer.startReplaceGroup(673094734);
                if (EventAttestationScreen.EventAttestationScreen$lambda$1(snapshotState2)) {
                    String strStringResource = StringResources_androidKt.stringResource(C16095R.string.event_detail_attestation_tap_agree_content, composer, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    companion = companion2;
                    eventAttestationDuxo5 = eventAttestationDuxo52;
                    function0 = function02;
                    snapshotState = snapshotState2;
                    function1 = function12;
                    coroutineScope = coroutineScope2;
                    scrollState = scrollState2;
                    r0 = 0;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8120);
                } else {
                    companion = companion2;
                    eventAttestationDuxo5 = eventAttestationDuxo52;
                    function1 = function12;
                    coroutineScope = coroutineScope2;
                    scrollState = scrollState2;
                    function0 = function02;
                    snapshotState = snapshotState2;
                    r0 = 0;
                }
                composer.endReplaceGroup();
                boolean submitting = ((EventAttestationDuxo5.Loaded) eventAttestationDuxo5).getSubmitting();
                String strStringResource2 = StringResources_androidKt.stringResource(EventAttestationScreen.EventAttestationScreen$lambda$1(snapshotState) ? C16095R.string.event_attestation_agree_cta : C11048R.string.general_action_review, composer, r0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Modifier.Companion companion5 = companion;
                Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion5, bentoTheme2.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composer, i3).m21593getSmallD9Ej5fM());
                composer.startReplaceGroup(-1224400529);
                final Function1<UiAgreementWithContent, Unit> function13 = function1;
                final EventAttestationDuxo5 eventAttestationDuxo53 = eventAttestationDuxo5;
                final CoroutineScope coroutineScope3 = coroutineScope;
                final ScrollState scrollState3 = scrollState;
                boolean zChanged = composer.changed(function13) | composer.changedInstance(eventAttestationDuxo53) | composer.changedInstance(coroutineScope3) | composer.changed(scrollState3);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final SnapshotState<Boolean> snapshotState3 = snapshotState;
                    Object obj = new Function0() { // from class: com.robinhood.android.event.detail.attestation.EventAttestationScreenKt$EventAttestationScreen$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EventAttestationScreen.C161112.invoke$lambda$3$lambda$1$lambda$0(function13, eventAttestationDuxo53, coroutineScope3, snapshotState3, scrollState3);
                        }
                    };
                    composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                composer.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierM21620defaultFillMaxWidthPaddingVpY3zN4, null, null, false, submitting, null, null, null, null, false, null, composer, 0, 0, 8120);
                composer.startReplaceGroup(673155456);
                if (EventAttestationScreen.EventAttestationScreen$lambda$1(snapshotState)) {
                    ButtonStyle.Style secondary = ((Styles) composer.consume(Styles2.getLocalStyles())).getButton(composer, r0).getSecondary();
                    SnapshotState4<Color> snapshotState4 = secondary.getColors().getForegroundColor().get(!r18.getSubmitting(), composer, ButtonStyle.StateColor.$stable << 3);
                    String strStringResource3 = StringResources_androidKt.stringResource(C16095R.string.event_attestation_disagree_cta, composer, r0);
                    TextStyle textM = bentoTheme2.getTypography(composer, i3).getTextM();
                    BentoText2.m20747BentoText38GnDrw(strStringResource3, ClickableKt.m4893clickableXHw0xAI$default(com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(SizeKt.wrapContentHeight$default(SizeKt.m5158heightInVpY3zN4$default(companion5, secondary.m21717getMinHeightD9Ej5fM(), 0.0f, 2, null), companion3.getCenterVertically(), r0, 2, null), bentoTheme2.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), !r18.getSubmitting(), null, null, function0, 6, null), Color.m6701boximpl(invoke$lambda$3$lambda$2(snapshotState4)), null, FontWeight.INSTANCE.getBold(), TextDecoration.INSTANCE.getUnderline(), TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textM, composer, 221184, 0, 8072);
                }
                composer.endReplaceGroup();
                composer.endNode();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$1$lambda$0(Function1 function1, EventAttestationDuxo5 eventAttestationDuxo5, CoroutineScope coroutineScope, SnapshotState snapshotState, ScrollState scrollState) {
            if (!EventAttestationScreen.EventAttestationScreen$lambda$1(snapshotState)) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new EventAttestationScreen3(scrollState, null), 3, null);
            } else {
                function1.invoke(((EventAttestationDuxo5.Loaded) eventAttestationDuxo5).getAgreement());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EventAttestationScreen$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: EventAttestationScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.detail.attestation.EventAttestationScreenKt$PreviewEventAttestationScreen$1 */
    static final class C161131 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ EventAttestationDuxo5 $viewState;

        C161131(EventAttestationDuxo5 eventAttestationDuxo5) {
            this.$viewState = eventAttestationDuxo5;
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
                ComposerKt.traceEventStart(-1302054477, i, -1, "com.robinhood.android.event.detail.attestation.PreviewEventAttestationScreen.<anonymous> (EventAttestationScreen.kt:186)");
            }
            EventAttestationDuxo5 eventAttestationDuxo5 = this.$viewState;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.event.detail.attestation.EventAttestationScreenKt$PreviewEventAttestationScreen$1$$ExternalSyntheticLambda0
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
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.detail.attestation.EventAttestationScreenKt$PreviewEventAttestationScreen$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EventAttestationScreen.C161131.invoke$lambda$3$lambda$2((UiAgreementWithContent) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.event.detail.attestation.EventAttestationScreenKt$PreviewEventAttestationScreen$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            EventAttestationScreen.EventAttestationScreen(eventAttestationDuxo5, function0, function1, (Function0) objRememberedValue3, null, composer, 3504, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(UiAgreementWithContent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    private static final void PreviewEventAttestationScreen(final EventAttestationDuxo5 eventAttestationDuxo5, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1946150507);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(eventAttestationDuxo5) : composerStartRestartGroup.changedInstance(eventAttestationDuxo5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1946150507, i2, -1, "com.robinhood.android.event.detail.attestation.PreviewEventAttestationScreen (EventAttestationScreen.kt:184)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1302054477, true, new C161131(eventAttestationDuxo5), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.attestation.EventAttestationScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventAttestationScreen.PreviewEventAttestationScreen$lambda$5(eventAttestationDuxo5, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String loremIpsum() {
        return CollectionsKt.joinToString$default(RangesKt.until(0, 100), PlaceholderUtils.XXShortPlaceholderText, null, null, 0, null, new Function1() { // from class: com.robinhood.android.event.detail.attestation.EventAttestationScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventAttestationScreen.loremIpsum$lambda$6(((Integer) obj).intValue());
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence loremIpsum$lambda$6(int i) {
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
    }
}
