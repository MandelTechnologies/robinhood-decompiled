package com.robinhood.android.sduiinfosheet;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.ApiSduiInfoSheetResponse;
import com.robinhood.models.serverdriven.experimental.api.InfoSheetAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.contracts.SduiInfoSheetKey;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SduiInfoSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0014\u0010!\u001a\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0014\u0010#\u001a\u00020\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0 J\r\u0010%\u001a\u00020\u001bH\u0017¢\u0006\u0002\u0010&R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006(²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/sduiinfosheet/SduiInfoSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/sduiinfosheet/SduiInfoSheetDuxo;", "getDuxo", "()Lcom/robinhood/android/sduiinfosheet/SduiInfoSheetDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getScreenEventComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "dialogId", "", "getDialogId", "()I", "defaultHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/InfoSheetAction;", "onDismiss", "", "activity", "Landroid/app/Activity;", "actionHandler", "onDismissAction", "Lkotlin/Function0;", "setActionHandler", "handler", "setOnDismissAction", "onDismissListener", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "lib-sdui-info-sheet_externalDebug", "viewState", "Lcom/robinhood/android/sduiinfosheet/SduiInfoSheetViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SduiInfoSheetFragment extends GenericComposeBottomSheetDialogFragment implements AutoLoggableFragment {
    private SduiActionHandler<? super InfoSheetAction> actionHandler;
    private Function0<Unit> onDismissAction;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, SduiInfoSheetDuxo.class);
    private final SduiActionHandler<InfoSheetAction> defaultHandler = new SduiActionHandler() { // from class: com.robinhood.android.sduiinfosheet.SduiInfoSheetFragment$defaultHandler$1
        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
        public final boolean mo15941handle(InfoSheetAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            SduiActionHandler sduiActionHandler = this.this$0.actionHandler;
            if (sduiActionHandler != null && sduiActionHandler.mo15941handle(action)) {
                return true;
            }
            if (action instanceof InfoSheetAction.Dismiss) {
                this.this$0.dismiss();
                return true;
            }
            if (!(action instanceof InfoSheetAction.Deeplink)) {
                return false;
            }
            Navigator navigator = this.this$0.getNavigator();
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            return Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((InfoSheetAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(SduiInfoSheetFragment sduiInfoSheetFragment, int i, Composer composer, int i2) {
        sduiInfoSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    private final SduiInfoSheetDuxo getDuxo() {
        return (SduiInfoSheetDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen sheetLoggingScreen = ((SduiInfoSheetKey) INSTANCE.getArgs((Fragment) this)).getSheetLoggingScreen();
        return sheetLoggingScreen == null ? new Screen(null, null, null, null, 15, null) : sheetLoggingScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return new Component(Component.ComponentType.BOTTOM_SHEET, ((SduiInfoSheetKey) INSTANCE.getArgs((Fragment) this)).getComponentLoggingIdentifier(), null, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    public int getDialogId() {
        return C27906R.id.dialog_id_sdui_info_sheet;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment
    protected void onDismiss(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Function0<Unit> function0 = this.onDismissAction;
        if (function0 != null) {
            function0.invoke();
        }
        super.onDismiss(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SduiInfoSheetViewState ComposeContent$lambda$0(SnapshotState4<SduiInfoSheetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    public final SduiInfoSheetFragment setActionHandler(SduiActionHandler<? super InfoSheetAction> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.actionHandler = handler;
        return this;
    }

    public final SduiInfoSheetFragment setOnDismissAction(Function0<Unit> onDismissListener) {
        Intrinsics.checkNotNullParameter(onDismissListener, "onDismissListener");
        this.onDismissAction = onDismissListener;
        return this;
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-469043593);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-469043593, i2, -1, "com.robinhood.android.sduiinfosheet.SduiInfoSheetFragment.ComposeContent (SduiInfoSheetFragment.kt:94)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1646036492, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.sduiinfosheet.SduiInfoSheetFragment.ComposeContent.1
                public final void invoke(Composer composer2, int i3) {
                    Arrangement arrangement;
                    Modifier.Companion companion;
                    SduiInfoSheetFragment sduiInfoSheetFragment;
                    Integer horizontal_inset_override;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1646036492, i3, -1, "com.robinhood.android.sduiinfosheet.SduiInfoSheetFragment.ComposeContent.<anonymous> (SduiInfoSheetFragment.kt:97)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    ApiSduiInfoSheetResponse response = SduiInfoSheetFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getResponse();
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl((response == null || (horizontal_inset_override = response.getHorizontal_inset_override()) == null) ? 0 : horizontal_inset_override.intValue());
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierNestedScroll$default = NestedScrollModifier7.nestedScroll$default(PaddingKt.m5143paddingVpY3zN4(companion2, fM7995constructorimpl, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM()), NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composer2, 0, 1), null, 2, null);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement2.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM());
                    SnapshotState4<SduiInfoSheetViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    SduiInfoSheetFragment sduiInfoSheetFragment2 = this;
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion3.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierNestedScroll$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    ApiSduiInfoSheetResponse response2 = SduiInfoSheetFragment.ComposeContent$lambda$0(snapshotState4).getResponse();
                    composer2.startReplaceGroup(1082534565);
                    if (response2 != null) {
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(column6.weight(companion2, 1.0f, false), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion3.getStart(), composer2, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                        List<UIComponent<InfoSheetAction>> header = response2.getHeader();
                        composer2.startReplaceGroup(1306170092);
                        if (header == null) {
                            arrangement = arrangement2;
                            sduiInfoSheetFragment = sduiInfoSheetFragment2;
                            companion = companion2;
                        } else {
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM()), composer2, 0);
                            ImmutableList3 persistentList = extensions2.toPersistentList(header);
                            SduiActionHandler sduiActionHandler = sduiInfoSheetFragment2.defaultHandler;
                            composer2.startReplaceGroup(-1772220517);
                            arrangement = arrangement2;
                            companion = companion2;
                            sduiInfoSheetFragment = sduiInfoSheetFragment2;
                            SduiColumns.SduiColumn(persistentList, InfoSheetAction.class, companion, null, sduiActionHandler, HorizontalPadding.Default, arrangement2.getTop(), companion3.getStart(), false, composer2, 100663296, 0);
                            composer2.endReplaceGroup();
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM()), composer2, 0);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                        List<UIComponent<InfoSheetAction>> body = response2.getBody();
                        composer2.startReplaceGroup(1306186832);
                        if (body != null) {
                            ImmutableList3 persistentList2 = extensions2.toPersistentList(body);
                            SduiActionHandler sduiActionHandler2 = sduiInfoSheetFragment.defaultHandler;
                            composer2.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(persistentList2, InfoSheetAction.class, companion, null, sduiActionHandler2, HorizontalPadding.Default, arrangement.getTop(), companion3.getStart(), false, composer2, 100663296, 0);
                            composer2.endReplaceGroup();
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM()), composer2, 0);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        List<UIComponent<InfoSheetAction>> footer = response2.getFooter();
                        composer2.startReplaceGroup(1082573359);
                        if (footer != null) {
                            ImmutableList3 persistentList3 = extensions2.toPersistentList(footer);
                            SduiActionHandler sduiActionHandler3 = sduiInfoSheetFragment.defaultHandler;
                            composer2.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(persistentList3, InfoSheetAction.class, companion, null, sduiActionHandler3, HorizontalPadding.Default, arrangement.getTop(), companion3.getStart(), true, composer2, 100663296, 0);
                            composer2.endReplaceGroup();
                            Unit unit3 = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                        Unit unit4 = Unit.INSTANCE;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sduiinfosheet.SduiInfoSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiInfoSheetFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SduiInfoSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/sduiinfosheet/SduiInfoSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/sduiinfosheet/SduiInfoSheetFragment;", "Lcom/robinhood/shared/common/contracts/SduiInfoSheetKey;", "<init>", "()V", "lib-sdui-info-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<SduiInfoSheetFragment, SduiInfoSheetKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public SduiInfoSheetFragment createDialogFragment(SduiInfoSheetKey sduiInfoSheetKey) {
            return (SduiInfoSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, sduiInfoSheetKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SduiInfoSheetKey getArgs(SduiInfoSheetFragment sduiInfoSheetFragment) {
            return (SduiInfoSheetKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, sduiInfoSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SduiInfoSheetFragment newInstance(SduiInfoSheetKey sduiInfoSheetKey) {
            return (SduiInfoSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, sduiInfoSheetKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SduiInfoSheetFragment sduiInfoSheetFragment, SduiInfoSheetKey sduiInfoSheetKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, sduiInfoSheetFragment, sduiInfoSheetKey);
        }
    }
}
