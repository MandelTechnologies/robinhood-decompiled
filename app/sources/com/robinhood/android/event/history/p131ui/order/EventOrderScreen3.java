package com.robinhood.android.event.history.p131ui.order;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TopAppBarColors;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.history.C16405R;
import com.robinhood.android.eventcontracts.contracts.EventContractConstants;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowDefaults;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.models.util.Money;
import com.robinhood.shared.common.contracts.OtherMarkdownFragmentKey;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: EventOrderScreen.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001aE\u0010\b\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0013\u001a-\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00182\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u000fX\u008a\u0084\u0002"}, m3636d2 = {"EventOrderScreen", "", "viewState", "Lcom/robinhood/android/event/history/ui/order/EventOrderDetailViewState;", "onBackClick", "Lkotlin/Function0;", "onCancelClick", "(Lcom/robinhood/android/event/history/ui/order/EventOrderDetailViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "EventOrderTopBar", "title", "Lcom/robinhood/utils/resource/StringResource;", "description", "modifier", "Landroidx/compose/ui/Modifier;", "elevation", "Landroidx/compose/ui/unit/Dp;", "EventOrderTopBar-FJfuzF0", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V", "EventOrderDetailContent", "(Lcom/robinhood/android/event/history/ui/order/EventOrderDetailViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MultipleLinesValuesDataRow", AnnotatedPrivateKey.LABEL, "", "values", "Lkotlinx/collections/immutable/PersistentList;", "(Ljava/lang/String;Lkotlinx/collections/immutable/PersistentList;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-event-history_externalDebug", "targetTopBarElevation", "topBarElevation"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.history.ui.order.EventOrderScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventOrderScreen3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventOrderDetailContent$lambda$12(EventOrderDetailViewState eventOrderDetailViewState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventOrderDetailContent(eventOrderDetailViewState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventOrderScreen$lambda$4(EventOrderDetailViewState eventOrderDetailViewState, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        EventOrderScreen(eventOrderDetailViewState, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventOrderTopBar_FJfuzF0$lambda$5(StringResource stringResource, StringResource stringResource2, Function0 function0, Modifier modifier, float f, int i, int i2, Composer composer, int i3) {
        m14268EventOrderTopBarFJfuzF0(stringResource, stringResource2, function0, modifier, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultipleLinesValuesDataRow$lambda$14(String str, ImmutableList3 immutableList3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MultipleLinesValuesDataRow(str, immutableList3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void EventOrderScreen(final EventOrderDetailViewState viewState, final Function0<Unit> onBackClick, final Function0<Unit> onCancelClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-502865449);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBackClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCancelClick) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-502865449, i2, -1, "com.robinhood.android.event.history.ui.order.EventOrderScreen (EventOrderScreen.kt:58)");
            }
            final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            int value = scrollStateRememberScrollState.getValue();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(value);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.event.history.ui.order.EventOrderScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EventOrderScreen3.EventOrderScreen$lambda$1$lambda$0(scrollStateRememberScrollState);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI = AnimateAsState.m4812animateDpAsStateAjpBEmI(EventOrderScreen$lambda$2((SnapshotState4) objRememberedValue), null, "TopBarElevation", null, composerStartRestartGroup, 384, 10);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-870895973, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.history.ui.order.EventOrderScreenKt.EventOrderScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-870895973, i3, -1, "com.robinhood.android.event.history.ui.order.EventOrderScreen.<anonymous> (EventOrderScreen.kt:66)");
                    }
                    StringResource title = viewState.getTitle();
                    StringResource description = viewState.getDescription();
                    Function0<Unit> function0 = onBackClick;
                    float fEventOrderScreen$lambda$3 = EventOrderScreen3.EventOrderScreen$lambda$3(snapshotState4M4812animateDpAsStateAjpBEmI);
                    int i4 = StringResource.$stable;
                    EventOrderScreen3.m14268EventOrderTopBarFJfuzF0(title, description, function0, null, fEventOrderScreen$lambda$3, composer3, i4 | (i4 << 3), 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-1042737306, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.history.ui.order.EventOrderScreenKt.EventOrderScreen.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i4) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i4 & 6) == 0) {
                        i4 |= composer3.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i4 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1042737306, i4, -1, "com.robinhood.android.event.history.ui.order.EventOrderScreen.<anonymous> (EventOrderScreen.kt:76)");
                    }
                    EventOrderScreen3.EventOrderDetailContent(viewState, onCancelClick, ScrollKt.verticalScroll$default(SizeKt.fillMaxHeight$default(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), scrollStateRememberScrollState, false, null, false, 14, null), composer3, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.history.ui.order.EventOrderScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventOrderScreen3.EventOrderScreen$lambda$4(viewState, onBackClick, onCancelClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2002Dp EventOrderScreen$lambda$1$lambda$0(ScrollState scrollState) {
        return C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(scrollState.getValue() > 0 ? 2 : 0));
    }

    private static final float EventOrderScreen$lambda$2(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EventOrderScreen$lambda$3(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* renamed from: EventOrderTopBar-FJfuzF0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14268EventOrderTopBarFJfuzF0(final StringResource stringResource, final StringResource stringResource2, final Function0<Unit> function0, Modifier modifier, float f, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f2;
        Composer composer2;
        final Modifier modifier3;
        final float f3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2016826569);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(stringResource2) : composerStartRestartGroup.changedInstance(stringResource2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    f2 = f;
                    i3 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    float fM7995constructorimpl = i4 == 0 ? C2002Dp.m7995constructorimpl(0) : f2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2016826569, i3, -1, "com.robinhood.android.event.history.ui.order.EventOrderTopBar (EventOrderScreen.kt:96)");
                    }
                    final String strStringResource = StringResources_androidKt.stringResource(C16405R.string.loading, composerStartRestartGroup, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m5967SurfaceT9BRK9s(modifier4, null, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), 0.0f, fM7995constructorimpl, null, ComposableLambda3.rememberComposableLambda(1134208786, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.history.ui.order.EventOrderScreenKt$EventOrderTopBar$1
                        public final void invoke(Composer composer3, int i7) {
                            String string2;
                            String string3;
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1134208786, i7, -1, "com.robinhood.android.event.history.ui.order.EventOrderTopBar.<anonymous> (EventOrderScreen.kt:104)");
                            }
                            StringResource stringResource3 = stringResource;
                            String str = strStringResource;
                            StringResource stringResource4 = stringResource2;
                            final Function0<Unit> function02 = function0;
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
                            Function2<Composer, Integer, Unit> lambda$38967968$feature_event_history_externalDebug = EventOrderScreen.INSTANCE.getLambda$38967968$feature_event_history_externalDebug();
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1871350178, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.history.ui.order.EventOrderScreenKt$EventOrderTopBar$1$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i8) {
                                    if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1871350178, i8, -1, "com.robinhood.android.event.history.ui.order.EventOrderTopBar.<anonymous>.<anonymous>.<anonymous> (EventOrderScreen.kt:108)");
                                    }
                                    BentoAppBarScope.INSTANCE.m20575BentoBackButtondrOMvmE(null, false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21368getAccent0d7_KjU()), function02, composer4, BentoAppBarScope.$stable << 12, 3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54);
                            TopAppBarColors topAppBarColors = TopAppBarDefaults.INSTANCE.topAppBarColors(composer3, TopAppBarDefaults.$stable);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            AppBarKt.m5704TopAppBarGHTll3U(lambda$38967968$feature_event_history_externalDebug, null, composableLambdaRememberComposableLambda, null, 0.0f, null, TopAppBarColors.m6077copyt635Npw$default(topAppBarColors, bentoTheme2.getColors(composer3, i8).m21371getBg0d7_KjU(), 0L, 0L, 0L, 0L, 30, null), null, composer3, 390, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE);
                            composer3.startReplaceGroup(-124442619);
                            CharSequence text = stringResource3 == null ? null : StringResources6.getText(stringResource3, composer3, StringResource.$stable);
                            composer3.endReplaceGroup();
                            if (text == null || (string2 = text.toString()) == null) {
                                string2 = str;
                            }
                            BentoText2.m20747BentoText38GnDrw(string2, ModifiersKt.bentoPlaceholder$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer3, 6, 1), stringResource4 == null, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i8).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                            composer3.startReplaceGroup(-124432091);
                            CharSequence text2 = stringResource4 == null ? null : StringResources6.getText(stringResource4, composer3, StringResource.$stable);
                            composer3.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw((text2 == null || (string3 = text2.toString()) == null) ? str : string3, ModifiersKt.bentoPlaceholder$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer3, 6, 1), stringResource4 == null, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i8).getTextM(), composer3, 0, 0, 8188);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerStartRestartGroup, 54), composer2, ((i3 >> 9) & 14) | 12582912 | ((i3 << 3) & 458752), 82);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    f3 = fM7995constructorimpl;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.history.ui.order.EventOrderScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EventOrderScreen3.EventOrderTopBar_FJfuzF0$lambda$5(stringResource, stringResource2, function0, modifier3, f3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            f2 = f;
            if ((i3 & 9363) != 9362) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final String strStringResource2 = StringResources_androidKt.stringResource(C16405R.string.loading, composerStartRestartGroup, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m5967SurfaceT9BRK9s(modifier4, null, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), 0.0f, fM7995constructorimpl, null, ComposableLambda3.rememberComposableLambda(1134208786, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.history.ui.order.EventOrderScreenKt$EventOrderTopBar$1
                    public final void invoke(Composer composer3, int i7) {
                        String string2;
                        String string3;
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1134208786, i7, -1, "com.robinhood.android.event.history.ui.order.EventOrderTopBar.<anonymous> (EventOrderScreen.kt:104)");
                        }
                        StringResource stringResource3 = stringResource;
                        String str = strStringResource2;
                        StringResource stringResource4 = stringResource2;
                        final Function0<Unit> function02 = function0;
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
                        Function2<Composer, Integer, Unit> lambda$38967968$feature_event_history_externalDebug = EventOrderScreen.INSTANCE.getLambda$38967968$feature_event_history_externalDebug();
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1871350178, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.history.ui.order.EventOrderScreenKt$EventOrderTopBar$1$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i8) {
                                if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1871350178, i8, -1, "com.robinhood.android.event.history.ui.order.EventOrderTopBar.<anonymous>.<anonymous>.<anonymous> (EventOrderScreen.kt:108)");
                                }
                                BentoAppBarScope.INSTANCE.m20575BentoBackButtondrOMvmE(null, false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21368getAccent0d7_KjU()), function02, composer4, BentoAppBarScope.$stable << 12, 3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        TopAppBarColors topAppBarColors = TopAppBarDefaults.INSTANCE.topAppBarColors(composer3, TopAppBarDefaults.$stable);
                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        AppBarKt.m5704TopAppBarGHTll3U(lambda$38967968$feature_event_history_externalDebug, null, composableLambdaRememberComposableLambda, null, 0.0f, null, TopAppBarColors.m6077copyt635Npw$default(topAppBarColors, bentoTheme22.getColors(composer3, i8).m21371getBg0d7_KjU(), 0L, 0L, 0L, 0L, 30, null), null, composer3, 390, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE);
                        composer3.startReplaceGroup(-124442619);
                        CharSequence text = stringResource3 == null ? null : StringResources6.getText(stringResource3, composer3, StringResource.$stable);
                        composer3.endReplaceGroup();
                        if (text == null || (string2 = text.toString()) == null) {
                            string2 = str;
                        }
                        BentoText2.m20747BentoText38GnDrw(string2, ModifiersKt.bentoPlaceholder$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer3, 6, 1), stringResource4 == null, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer3, i8).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                        composer3.startReplaceGroup(-124432091);
                        CharSequence text2 = stringResource4 == null ? null : StringResources6.getText(stringResource4, composer3, StringResource.$stable);
                        composer3.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw((text2 == null || (string3 = text2.toString()) == null) ? str : string3, ModifiersKt.bentoPlaceholder$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer3, 6, 1), stringResource4 == null, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer3, i8).getTextM(), composer3, 0, 0, 8188);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composer2, ((i3 >> 9) & 14) | 12582912 | ((i3 << 3) & 458752), 82);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                f3 = fM7995constructorimpl;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        f2 = f;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024d  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventOrderDetailContent(final EventOrderDetailViewState eventOrderDetailViewState, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final String strStringResource;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Column6 column6;
        int i4;
        CharSequence text;
        int i5;
        AnnotatedString annotatedString;
        CharSequence text2;
        String string2;
        CharSequence text3;
        CharSequence text4;
        boolean z;
        boolean z2;
        Composer composer2;
        ?? r1;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier3;
        String string3;
        Modifier modifierM4893clickableXHw0xAI$default;
        BentoDataRowState bentoDataRowState;
        Composer composer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-345820758);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(eventOrderDetailViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer3 = composerStartRestartGroup;
            } else {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-345820758, i3, -1, "com.robinhood.android.event.history.ui.order.EventOrderDetailContent (EventOrderScreen.kt:139)");
                }
                strStringResource = StringResources_androidKt.stringResource(C16405R.string.loading, composerStartRestartGroup, 0);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
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
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
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
                Column6 column62 = Column6.INSTANCE;
                if (eventOrderDetailViewState.getDisplayLegs().isEmpty()) {
                    composerStartRestartGroup.startReplaceGroup(751150209);
                    column6 = column62;
                    i4 = 1;
                    MultipleLinesValuesDataRow(StringResources_androidKt.stringResource(C16405R.string.event_order_detail_legs_label, composerStartRestartGroup, 0), eventOrderDetailViewState.getDisplayLegs(), null, composerStartRestartGroup, 0, 4);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    column6 = column62;
                    i4 = 1;
                    composerStartRestartGroup.startReplaceGroup(751353352);
                    AnnotatedString annotatedString2 = new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.event_contract_order_detail_event_name_label, composerStartRestartGroup, 0), null, 2, null);
                    String eventName = eventOrderDetailViewState.getEventName();
                    if (eventName == null) {
                        eventName = strStringResource;
                    }
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString2, null, null, null, new AnnotatedString(eventName, null, 2, null), null, null, null, null, false, eventOrderDetailViewState.getEventName() == null, 2013, null), null, null, composerStartRestartGroup, BentoDataRowState.$stable, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                AnnotatedString annotatedString3 = new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.order_status, composerStartRestartGroup, 0), null, 2, null);
                StringResource status = eventOrderDetailViewState.getStatus();
                composerStartRestartGroup.startReplaceGroup(1271181353);
                text = status != null ? null : StringResources6.getText(status, composerStartRestartGroup, StringResource.$stable);
                composerStartRestartGroup.endReplaceGroup();
                if (text != null || (string = text.toString()) == null) {
                    String string4 = strStringResource;
                }
                BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, annotatedString3, null, null, null, new AnnotatedString(string4, null, 2, null), null, null, null, null, false, eventOrderDetailViewState.getStatus() != null ? i4 : 0, 2013, null);
                i5 = BentoDataRowState.$stable;
                BentoDataRowKt.BentoDataRow(bentoDataRowState2, null, null, composerStartRestartGroup, i5, 6);
                annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.time_in_force, composerStartRestartGroup, 0), null, 2, null);
                StringResource timeInForce = eventOrderDetailViewState.getTimeInForce();
                composerStartRestartGroup.startReplaceGroup(1271192617);
                text2 = timeInForce != null ? null : StringResources6.getText(timeInForce, composerStartRestartGroup, StringResource.$stable);
                composerStartRestartGroup.endReplaceGroup();
                if (text2 != null || (string2 = text2.toString()) == null) {
                    string2 = strStringResource;
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(string2, null, 2, null), null, null, null, null, false, eventOrderDetailViewState.getTimeInForce() == null ? i4 : 0, 2013, null), null, null, composerStartRestartGroup, i5, 6);
                    AnnotatedString annotatedString4 = new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.submitted, composerStartRestartGroup, 0), null, 2, null);
                    StringResource submitDate = eventOrderDetailViewState.getSubmitDate();
                    composerStartRestartGroup.startReplaceGroup(1271205065);
                    text3 = submitDate == null ? null : StringResources6.getText(submitDate, composerStartRestartGroup, StringResource.$stable);
                    composerStartRestartGroup.endReplaceGroup();
                    if (text3 == null || (string = text3.toString()) == null) {
                        String string5 = strStringResource;
                    }
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString4, null, null, null, new AnnotatedString(string5, null, 2, null), null, null, null, null, false, eventOrderDetailViewState.getSubmitDate() != null, 2013, null), null, null, composerStartRestartGroup, i5, 6);
                    composerStartRestartGroup.startReplaceGroup(1271210510);
                    if (eventOrderDetailViewState.getEnteredNotionalAmount() != null) {
                        if (Intrinsics.areEqual(eventOrderDetailViewState.getEnteredNotionalAmount().getCurrency().getCurrencyCode(), "USD")) {
                            composerStartRestartGroup.startReplaceGroup(1271215785);
                            bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.entered_in, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.usd_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, null, false, false, 3037, null);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(1271225197);
                            bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.entered_in, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(strStringResource, null, 2, null), null, null, null, null, true, false, 3037, null);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        BentoDataRowKt.BentoDataRow(bentoDataRowState, null, null, composerStartRestartGroup, i5, 6);
                        BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.entered_amount, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(Money.format$default(eventOrderDetailViewState.getEnteredNotionalAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i5, 6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1271244017);
                    if (eventOrderDetailViewState.getPrice() != null) {
                        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        boolean showClosePriceInfoLink = eventOrderDetailViewState.getShowClosePriceInfoLink();
                        BentoDataRowState bentoDataRowState3 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.price, composerStartRestartGroup, 0), null, 2, null), null, showClosePriceInfoLink ? new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16) : null, null, new AnnotatedString(StringResources6.getText(eventOrderDetailViewState.getPrice(), composerStartRestartGroup, StringResource.$stable).toString(), null, 2, null), null, null, null, null, false, false, 4053, null);
                        composerStartRestartGroup.startReplaceGroup(1271262158);
                        if (showClosePriceInfoLink) {
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                Object obj = objRememberedValue;
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    Function0 function02 = new Function0() { // from class: com.robinhood.android.event.history.ui.order.EventOrderScreenKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return EventOrderScreen3.EventOrderDetailContent$lambda$11$lambda$9$lambda$8(navigator, context);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(function02);
                                    obj = function02;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion3, false, null, null, (Function0) obj, 7, null);
                            }
                        } else {
                            modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
                        }
                        Modifier modifier5 = modifierM4893clickableXHw0xAI$default;
                        composerStartRestartGroup.endReplaceGroup();
                        BentoDataRowKt.BentoDataRow(bentoDataRowState3, modifier5, null, composerStartRestartGroup, i5, 4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    AnnotatedString annotatedString5 = new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.filled_quantity, composerStartRestartGroup, 0), null, 2, null);
                    StringResource filledQuantity = eventOrderDetailViewState.getFilledQuantity();
                    composerStartRestartGroup.startReplaceGroup(1271282089);
                    text4 = filledQuantity != null ? null : StringResources6.getText(filledQuantity, composerStartRestartGroup, StringResource.$stable);
                    composerStartRestartGroup.endReplaceGroup();
                    if (text4 != null || (string = text4.toString()) == null) {
                        String string6 = strStringResource;
                    }
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString5, null, null, null, new AnnotatedString(string6, null, 2, null), null, null, null, null, false, eventOrderDetailViewState.getFilledQuantity() != null, 2013, null), null, null, composerStartRestartGroup, i5, 6);
                    composerStartRestartGroup.startReplaceGroup(1271286937);
                    if (eventOrderDetailViewState.getFilledDate() == null) {
                        z = false;
                        BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.filled, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources6.getText(eventOrderDetailViewState.getFilledDate(), composerStartRestartGroup, StringResource.$stable).toString(), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i5, 6);
                    } else {
                        z = false;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1271297345);
                    if (eventOrderDetailViewState.getTotalCommissionLabel() != null && eventOrderDetailViewState.getTotalCommission() != null) {
                        StringResource totalCommissionLabel = eventOrderDetailViewState.getTotalCommissionLabel();
                        int i7 = StringResource.$stable;
                        BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources6.getText(totalCommissionLabel, composerStartRestartGroup, i7).toString(), null, 2, null), null, null, null, new AnnotatedString(StringResources6.getText(eventOrderDetailViewState.getTotalCommission(), composerStartRestartGroup, i7).toString(), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i5, 6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1271309957);
                    if (eventOrderDetailViewState.getFilledNotionalLabel() != null && eventOrderDetailViewState.getFilledNotional() != null) {
                        BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources6.getTextAsString(eventOrderDetailViewState.getFilledNotionalLabel(), composerStartRestartGroup, StringResource.$stable), null, 2, null), null, null, null, new AnnotatedString(eventOrderDetailViewState.getFilledNotional(), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i5, 6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1271321763);
                    if (eventOrderDetailViewState.getAdjustment() != null) {
                        StringResource adjustmentTitle = eventOrderDetailViewState.getAdjustmentTitle();
                        composerStartRestartGroup.startReplaceGroup(1271326985);
                        CharSequence text5 = adjustmentTitle == null ? null : StringResources6.getText(adjustmentTitle, composerStartRestartGroup, StringResource.$stable);
                        composerStartRestartGroup.endReplaceGroup();
                        if (text5 == null || (string3 = text5.toString()) == null) {
                            string3 = strStringResource;
                        }
                        BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(string3, null, 2, null), null, null, null, new AnnotatedString(StringResources6.getText(eventOrderDetailViewState.getAdjustment(), composerStartRestartGroup, StringResource.$stable).toString(), null, 2, null), null, null, null, null, eventOrderDetailViewState.getAdjustmentTitle() == null ? true : z, false, 3037, null), null, null, composerStartRestartGroup, i5, 6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z3 = eventOrderDetailViewState.getBreakdownNotional() == null ? true : z;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Column6 column63 = column6;
                    Modifier modifier6 = modifier4;
                    z2 = z;
                    AnimatedVisibilityKt.AnimatedVisibility(column63, z3, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composerStartRestartGroup, 6, 1), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-122542216, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.history.ui.order.EventOrderScreenKt$EventOrderDetailContent$1$4
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                            invoke(animatedVisibilityScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i8) {
                            String string7;
                            String string8;
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-122542216, i8, -1, "com.robinhood.android.event.history.ui.order.EventOrderDetailContent.<anonymous>.<anonymous> (EventOrderScreen.kt:283)");
                            }
                            EventOrderDetailViewState eventOrderDetailViewState2 = eventOrderDetailViewState;
                            String str = strStringResource;
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, companion5);
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier2, companion6.getSetModifier());
                            Column6 column64 = Column6.INSTANCE;
                            StringResource breakdownNotional = eventOrderDetailViewState2.getBreakdownNotional();
                            composer4.startReplaceGroup(-1264603753);
                            CharSequence text6 = breakdownNotional == null ? null : StringResources6.getText(breakdownNotional, composer4, StringResource.$stable);
                            composer4.endReplaceGroup();
                            if (text6 == null || (string7 = text6.toString()) == null) {
                                string7 = str;
                            }
                            Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(companion5, eventOrderDetailViewState2.getBreakdownNotional() == null, null, 2, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(string7, modifierBentoPlaceholder$default, Color.m6701boximpl(bentoTheme.getColors(composer4, i9).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i9).getTextS(), composer4, 0, 0, 8184);
                            StringResource breakdownCommission = eventOrderDetailViewState2.getBreakdownCommission();
                            composer4.startReplaceGroup(-1264592873);
                            CharSequence text7 = breakdownCommission == null ? null : StringResources6.getText(breakdownCommission, composer4, StringResource.$stable);
                            composer4.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw((text7 == null || (string8 = text7.toString()) == null) ? str : string8, ModifiersKt.bentoPlaceholder$default(companion5, eventOrderDetailViewState2.getBreakdownCommission() == null, null, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer4, i9).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i9).getTextS(), composer4, 0, 0, 8184);
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 28);
                    composer2 = composerStartRestartGroup;
                    StringResource cancelButtonText = eventOrderDetailViewState.getCancelButtonText();
                    composer2.startReplaceGroup(1271367313);
                    String textAsString = cancelButtonText != null ? null : StringResources6.getTextAsString(cancelButtonText, composer2, StringResource.$stable);
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1271368732);
                    if (eventOrderDetailViewState.getShowCancel() || textAsString == null) {
                        r1 = z2 ? 1 : 0;
                    } else {
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM()), composer2, z2 ? 1 : 0);
                        BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                        boolean z4 = !eventOrderDetailViewState.getCancelInProgress();
                        boolean cancelInProgress = eventOrderDetailViewState.getCancelInProgress();
                        r1 = z2 ? 1 : 0;
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, textAsString, PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM()), null, type2, z4, cancelInProgress, null, null, null, null, false, null, composer2, ((i3 >> 3) & 14) | 24576, 0, 8072);
                        composer2 = composer2;
                    }
                    composer2.endReplaceGroup();
                    Spacer2.Spacer(Column5.weight$default(column63, companion4, 1.0f, false, 2, null), composer2, r1);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme2.getSpacing(composer2, i9).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i9).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i9).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), r1);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, r1);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Composer composer4 = composer2;
                    BentoMarkdownText2.BentoMarkdownText(StringResources_androidKt.stringResource(C16405R.string.gated_options_events_history_disclaimer_markdown, composer2, r1), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer2, i9).getTextS(), 0, bentoTheme2.getColors(composer2, i9).m21426getFg20d7_KjU(), 0L, false, composer4, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer4, MarkdownStyle.$stable << 6, 26);
                    Composer composer5 = composer4;
                    composer5.endNode();
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier6;
                    composer3 = composer5;
                } else {
                    if (string2.length() > 0) {
                        char titleCase = Character.toTitleCase(string2.charAt(0));
                        String strSubstring = string2.substring(i4);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        string2 = titleCase + strSubstring;
                    }
                    if (string2 == null) {
                    }
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(string2, null, 2, null), null, null, null, null, false, eventOrderDetailViewState.getTimeInForce() == null ? i4 : 0, 2013, null), null, null, composerStartRestartGroup, i5, 6);
                    AnnotatedString annotatedString42 = new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.submitted, composerStartRestartGroup, 0), null, 2, null);
                    StringResource submitDate2 = eventOrderDetailViewState.getSubmitDate();
                    composerStartRestartGroup.startReplaceGroup(1271205065);
                    if (submitDate2 == null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (text3 == null) {
                        String string52 = strStringResource;
                        BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString42, null, null, null, new AnnotatedString(string52, null, 2, null), null, null, null, null, false, eventOrderDetailViewState.getSubmitDate() != null, 2013, null), null, null, composerStartRestartGroup, i5, 6);
                        composerStartRestartGroup.startReplaceGroup(1271210510);
                        if (eventOrderDetailViewState.getEnteredNotionalAmount() != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1271244017);
                        if (eventOrderDetailViewState.getPrice() != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        AnnotatedString annotatedString52 = new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.filled_quantity, composerStartRestartGroup, 0), null, 2, null);
                        StringResource filledQuantity2 = eventOrderDetailViewState.getFilledQuantity();
                        composerStartRestartGroup.startReplaceGroup(1271282089);
                        if (filledQuantity2 != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (text4 != null) {
                            String string62 = strStringResource;
                            BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString52, null, null, null, new AnnotatedString(string62, null, 2, null), null, null, null, null, false, eventOrderDetailViewState.getFilledQuantity() != null, 2013, null), null, null, composerStartRestartGroup, i5, 6);
                            composerStartRestartGroup.startReplaceGroup(1271286937);
                            if (eventOrderDetailViewState.getFilledDate() == null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1271297345);
                            if (eventOrderDetailViewState.getTotalCommissionLabel() != null) {
                                StringResource totalCommissionLabel2 = eventOrderDetailViewState.getTotalCommissionLabel();
                                int i72 = StringResource.$stable;
                                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources6.getText(totalCommissionLabel2, composerStartRestartGroup, i72).toString(), null, 2, null), null, null, null, new AnnotatedString(StringResources6.getText(eventOrderDetailViewState.getTotalCommission(), composerStartRestartGroup, i72).toString(), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i5, 6);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1271309957);
                            if (eventOrderDetailViewState.getFilledNotionalLabel() != null) {
                                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources6.getTextAsString(eventOrderDetailViewState.getFilledNotionalLabel(), composerStartRestartGroup, StringResource.$stable), null, 2, null), null, null, null, new AnnotatedString(eventOrderDetailViewState.getFilledNotional(), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i5, 6);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1271321763);
                            if (eventOrderDetailViewState.getAdjustment() != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (eventOrderDetailViewState.getBreakdownNotional() == null) {
                            }
                            Modifier.Companion companion42 = Modifier.INSTANCE;
                            Column6 column632 = column6;
                            Modifier modifier62 = modifier4;
                            z2 = z;
                            AnimatedVisibilityKt.AnimatedVisibility(column632, z3, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion42, 0.0f, composerStartRestartGroup, 6, 1), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-122542216, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.history.ui.order.EventOrderScreenKt$EventOrderDetailContent$1$4
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer42, Integer num) {
                                    invoke(animatedVisibilityScope, composer42, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer42, int i82) {
                                    String string7;
                                    String string8;
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-122542216, i82, -1, "com.robinhood.android.event.history.ui.order.EventOrderDetailContent.<anonymous>.<anonymous> (EventOrderScreen.kt:283)");
                                    }
                                    EventOrderDetailViewState eventOrderDetailViewState2 = eventOrderDetailViewState;
                                    String str = strStringResource;
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer42, 0);
                                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer42, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composer42.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer42, companion5);
                                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor22 = companion6.getConstructor();
                                    if (composer42.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer42.startReusableNode();
                                    if (composer42.getInserting()) {
                                        composer42.createNode(constructor22);
                                    } else {
                                        composer42.useNode();
                                    }
                                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer42);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap22, companion6.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier22, companion6.getSetModifier());
                                    Column6 column64 = Column6.INSTANCE;
                                    StringResource breakdownNotional = eventOrderDetailViewState2.getBreakdownNotional();
                                    composer42.startReplaceGroup(-1264603753);
                                    CharSequence text6 = breakdownNotional == null ? null : StringResources6.getText(breakdownNotional, composer42, StringResource.$stable);
                                    composer42.endReplaceGroup();
                                    if (text6 == null || (string7 = text6.toString()) == null) {
                                        string7 = str;
                                    }
                                    Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(companion5, eventOrderDetailViewState2.getBreakdownNotional() == null, null, 2, null);
                                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                    int i92 = BentoTheme.$stable;
                                    BentoText2.m20747BentoText38GnDrw(string7, modifierBentoPlaceholder$default, Color.m6701boximpl(bentoTheme3.getColors(composer42, i92).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer42, i92).getTextS(), composer42, 0, 0, 8184);
                                    StringResource breakdownCommission = eventOrderDetailViewState2.getBreakdownCommission();
                                    composer42.startReplaceGroup(-1264592873);
                                    CharSequence text7 = breakdownCommission == null ? null : StringResources6.getText(breakdownCommission, composer42, StringResource.$stable);
                                    composer42.endReplaceGroup();
                                    BentoText2.m20747BentoText38GnDrw((text7 == null || (string8 = text7.toString()) == null) ? str : string8, ModifiersKt.bentoPlaceholder$default(companion5, eventOrderDetailViewState2.getBreakdownCommission() == null, null, 2, null), Color.m6701boximpl(bentoTheme3.getColors(composer42, i92).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer42, i92).getTextS(), composer42, 0, 0, 8184);
                                    composer42.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 28);
                            composer2 = composerStartRestartGroup;
                            StringResource cancelButtonText2 = eventOrderDetailViewState.getCancelButtonText();
                            composer2.startReplaceGroup(1271367313);
                            if (cancelButtonText2 != null) {
                            }
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(1271368732);
                            if (eventOrderDetailViewState.getShowCancel()) {
                                r1 = z2 ? 1 : 0;
                                composer2.endReplaceGroup();
                                Spacer2.Spacer(Column5.weight$default(column632, companion42, 1.0f, false, 2, null), composer2, r1);
                                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                int i92 = BentoTheme.$stable;
                                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion42, bentoTheme22.getSpacing(composer2, i92).m21592getMediumD9Ej5fM(), bentoTheme22.getSpacing(composer2, i92).m21592getMediumD9Ej5fM(), bentoTheme22.getSpacing(composer2, i92).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), r1);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, r1);
                                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default2);
                                Function0<ComposeUiNode> constructor22 = companion2.getConstructor();
                                if (composer2.getApplier() == null) {
                                }
                                composer2.startReusableNode();
                                if (!composer2.getInserting()) {
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting()) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion2.getSetModifier());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    Composer composer42 = composer2;
                                    BentoMarkdownText2.BentoMarkdownText(StringResources_androidKt.stringResource(C16405R.string.gated_options_events_history_disclaimer_markdown, composer2, r1), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme22.getTypography(composer2, i92).getTextS(), 0, bentoTheme22.getColors(composer2, i92).m21426getFg20d7_KjU(), 0L, false, composer42, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer42, MarkdownStyle.$stable << 6, 26);
                                    Composer composer52 = composer42;
                                    composer52.endNode();
                                    composer52.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier62;
                                    composer3 = composer52;
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.history.ui.order.EventOrderScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return EventOrderScreen3.EventOrderDetailContent$lambda$12(eventOrderDetailViewState, function0, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            strStringResource = StringResources_androidKt.stringResource(C16405R.string.loading, composerStartRestartGroup, 0);
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion5.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column622 = Column6.INSTANCE;
                if (eventOrderDetailViewState.getDisplayLegs().isEmpty()) {
                }
                AnnotatedString annotatedString32 = new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.order_status, composerStartRestartGroup, 0), null, 2, null);
                StringResource status2 = eventOrderDetailViewState.getStatus();
                composerStartRestartGroup.startReplaceGroup(1271181353);
                if (status2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (text != null) {
                    String string42 = strStringResource;
                    BentoDataRowState bentoDataRowState22 = new BentoDataRowState(null, annotatedString32, null, null, null, new AnnotatedString(string42, null, 2, null), null, null, null, null, false, eventOrderDetailViewState.getStatus() != null ? i4 : 0, 2013, null);
                    i5 = BentoDataRowState.$stable;
                    BentoDataRowKt.BentoDataRow(bentoDataRowState22, null, null, composerStartRestartGroup, i5, 6);
                    annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.time_in_force, composerStartRestartGroup, 0), null, 2, null);
                    StringResource timeInForce2 = eventOrderDetailViewState.getTimeInForce();
                    composerStartRestartGroup.startReplaceGroup(1271192617);
                    if (timeInForce2 != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (text2 != null) {
                        string2 = strStringResource;
                        BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(string2, null, 2, null), null, null, null, null, false, eventOrderDetailViewState.getTimeInForce() == null ? i4 : 0, 2013, null), null, null, composerStartRestartGroup, i5, 6);
                        AnnotatedString annotatedString422 = new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.submitted, composerStartRestartGroup, 0), null, 2, null);
                        StringResource submitDate22 = eventOrderDetailViewState.getSubmitDate();
                        composerStartRestartGroup.startReplaceGroup(1271205065);
                        if (submitDate22 == null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (text3 == null) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventOrderDetailContent$lambda$11$lambda$9$lambda$8(Navigator navigator, Context context) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new OtherMarkdownFragmentKey(EventContractConstants.PRICE_TO_CLOSE_CONTENTFUL_ID, null, null, 6, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158 A[LOOP:0: B:60:0x0152->B:62:0x0158, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void MultipleLinesValuesDataRow(final String str, final ImmutableList3<String> immutableList3, Modifier modifier, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        ImmutableList3<String> immutableList32;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1137772238);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            i3 = (i & 6) == 0 ? (composerStartRestartGroup.changed(str2) ? 4 : 2) | i : i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                immutableList32 = immutableList3;
                i3 |= composerStartRestartGroup.changed(immutableList32) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1137772238, i3, -1, "com.robinhood.android.event.history.ui.order.MultipleLinesValuesDataRow (EventOrderScreen.kt:340)");
                    }
                    BentoDataRowDefaults bentoDataRowDefaults = BentoDataRowDefaults.INSTANCE;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.m5155defaultMinSizeVpY3zN4$default(modifier4, 0.0f, bentoDataRowDefaults.m20964getStandardMinHeightD9Ej5fM(), 1, null), bentoDataRowDefaults.m20963getCondensedVerticalPaddingD9Ej5fM(), composerStartRestartGroup, 0, 0);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
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
                    Column6 column6 = Column6.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    modifier3 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, i3 & 14, 0, 8186);
                    composerStartRestartGroup.startReplaceGroup(105714719);
                    for (String str3 : immutableList32) {
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                    }
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.history.ui.order.EventOrderScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EventOrderScreen3.MultipleLinesValuesDataRow$lambda$14(str, immutableList3, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                BentoDataRowDefaults bentoDataRowDefaults2 = BentoDataRowDefaults.INSTANCE;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.m5155defaultMinSizeVpY3zN4$default(modifier4, 0.0f, bentoDataRowDefaults2.m20964getStandardMinHeightD9Ej5fM(), 1, null), bentoDataRowDefaults2.m20963getCondensedVerticalPaddingD9Ej5fM(), composerStartRestartGroup, 0, 0);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
                    Column6 column62 = Column6.INSTANCE;
                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    modifier3 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(bentoTheme3.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, i3 & 14, 0, 8186);
                    composerStartRestartGroup.startReplaceGroup(105714719);
                    while (r2.hasNext()) {
                    }
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        immutableList32 = immutableList3;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
