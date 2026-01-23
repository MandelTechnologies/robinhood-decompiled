package com.robinhood.android.common.detail.component.about;

import androidx.compose.animation.AnimationModifier;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.detail.component.C11117R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DetailPageAboutComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\u0006X\u008a\u0084\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002"}, m3636d2 = {"DetailPageAboutComposable", "", "T", "", "duxo", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/common/detail/component/about/DetailPageAboutViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/udf/BaseDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-lib-detail-component_externalDebug", "viewState", "expandState", "Lcom/robinhood/android/common/detail/component/about/DetailPageAboutExpandState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.detail.component.about.DetailPageAboutComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DetailPageAboutComposable {

    /* compiled from: DetailPageAboutComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.detail.component.about.DetailPageAboutComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DetailPageAboutViewState2.values().length];
            try {
                iArr[DetailPageAboutViewState2.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DetailPageAboutViewState2.EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DetailPageAboutViewState2.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailPageAboutComposable$lambda$9(BaseDuxo baseDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DetailPageAboutComposable(baseDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void DetailPageAboutComposable(final BaseDuxo<T, DetailPageAboutViewState> duxo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Object objRememberedValue;
        Composer.Companion companion;
        Modifier modifier3;
        final SnapshotState snapshotState;
        String strStringResource;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(1708294876);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(duxo) : composerStartRestartGroup.changedInstance(duxo) ? 4 : 2);
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
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1708294876, i3, -1, "com.robinhood.android.common.detail.component.about.DetailPageAboutComposable (DetailPageAboutComposable.kt:29)");
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(DetailPageAboutViewState2.NONE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                if (DetailPageAboutComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowThisSection()) {
                    modifier3 = modifier4;
                } else {
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 1, null), 0.0f, 1, null), null, null, 3, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAnimateContentSize$default);
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
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    modifier3 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11117R.string.detail_page_about_section_title, new Object[]{DetailPageAboutComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getInstrumentTitle()}, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1);
                    String description = DetailPageAboutComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDescription();
                    TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM();
                    int i6 = DetailPageAboutComposable$lambda$2(snapshotState2) == DetailPageAboutViewState2.COLLAPSED ? 5 : Integer.MAX_VALUE;
                    int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        snapshotState = snapshotState2;
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.common.detail.component.about.DetailPageAboutComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return DetailPageAboutComposable.DetailPageAboutComposable$lambda$8$lambda$5$lambda$4(snapshotState, (TextLayoutResult) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        snapshotState = snapshotState2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    final SnapshotState snapshotState3 = snapshotState;
                    BentoText2.m20747BentoText38GnDrw(description, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, null, null, null, iM7959getEllipsisgIe3tQ8, false, i6, 0, (Function1) objRememberedValue2, 0, textM, composerStartRestartGroup, 12582912, 48, 5500);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(-1038146001);
                    if (DetailPageAboutComposable$lambda$2(snapshotState3) != DetailPageAboutViewState2.NONE) {
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "about_show_more", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                        int i7 = WhenMappings.$EnumSwitchMapping$0[DetailPageAboutComposable$lambda$2(snapshotState3).ordinal()];
                        if (i7 == 1) {
                            composerStartRestartGroup.startReplaceGroup(-1038106809);
                            strStringResource = StringResources_androidKt.stringResource(C11117R.string.detail_page_about_section_show_more, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (i7 == 2) {
                            composerStartRestartGroup.startReplaceGroup(-1038101913);
                            strStringResource = StringResources_androidKt.stringResource(C11117R.string.detail_page_about_section_show_less, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            if (i7 != 3) {
                                composerStartRestartGroup.startReplaceGroup(-1038110074);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(-2116269997);
                            composerStartRestartGroup.endReplaceGroup();
                            strStringResource = "";
                        }
                        String str = strStringResource;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.common.detail.component.about.DetailPageAboutComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return DetailPageAboutComposable.DetailPageAboutComposable$lambda$8$lambda$7$lambda$6(snapshotState3);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue3, str, modifierAutoLogEvents$default, null, null, false, null, composerStartRestartGroup, 6, 120);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.detail.component.about.DetailPageAboutComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DetailPageAboutComposable.DetailPageAboutComposable$lambda$9(duxo, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            SnapshotState snapshotState22 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (DetailPageAboutComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowThisSection()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailPageAboutComposable$lambda$8$lambda$5$lambda$4(SnapshotState snapshotState, TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        if (DetailPageAboutComposable$lambda$2(snapshotState) == DetailPageAboutViewState2.NONE && textLayoutResult.getLineCount() > 5) {
            snapshotState.setValue(DetailPageAboutViewState2.COLLAPSED);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailPageAboutComposable$lambda$8$lambda$7$lambda$6(SnapshotState snapshotState) {
        DetailPageAboutViewState2 detailPageAboutViewState2;
        int i = WhenMappings.$EnumSwitchMapping$0[DetailPageAboutComposable$lambda$2(snapshotState).ordinal()];
        if (i == 1) {
            detailPageAboutViewState2 = DetailPageAboutViewState2.EXPANDED;
        } else if (i == 2) {
            detailPageAboutViewState2 = DetailPageAboutViewState2.COLLAPSED;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            detailPageAboutViewState2 = DetailPageAboutViewState2.NONE;
        }
        snapshotState.setValue(detailPageAboutViewState2);
        return Unit.INSTANCE;
    }

    private static final DetailPageAboutViewState DetailPageAboutComposable$lambda$0(SnapshotState4<DetailPageAboutViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final DetailPageAboutViewState2 DetailPageAboutComposable$lambda$2(SnapshotState<DetailPageAboutViewState2> snapshotState) {
        return snapshotState.getValue();
    }
}
