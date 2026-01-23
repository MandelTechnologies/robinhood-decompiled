package com.robinhood.android.linking;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.store.linking.LinkingGroup;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import hippo.model.p469v1.LinkingGroupColorsDto;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.Job;

/* compiled from: MobileLinkingCollapsedComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u001a=\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a=\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, m3636d2 = {"borderRadius", "", "MobileLinkingCollapsedComposable", "", "onClick", "Lkotlin/Function0;", "onClose", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/linking/MobileLinkingCollapsedDuxo;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/linking/MobileLinkingCollapsedDuxo;Landroidx/compose/runtime/Composer;II)V", "Content", MobileLinkingDeeplinkConstants.group_id_param, "Lcom/robinhood/android/store/linking/LinkingGroup;", "(Lcom/robinhood/android/store/linking/LinkingGroup;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MobileLinkingCollapsedComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-mobile-linking_externalDebug", "isVisible", "", "state", "Lcom/robinhood/android/linking/MobileLinkingCollapsedState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.linking.MobileLinkingCollapsedComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MobileLinkingCollapsedComposable3 {
    public static final int borderRadius = 16;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$17(LinkingGroup linkingGroup, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Content(linkingGroup, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MobileLinkingCollapsedComposable$lambda$8$lambda$7(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MobileLinkingCollapsedComposable$lambda$9(Function0 function0, Function0 function02, Modifier modifier, MobileLinkingCollapsedDuxo mobileLinkingCollapsedDuxo, int i, int i2, Composer composer, int i3) {
        MobileLinkingCollapsedComposable(function0, function02, modifier, mobileLinkingCollapsedDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MobileLinkingCollapsedComposablePreview$lambda$18(int i, Composer composer, int i2) {
        MobileLinkingCollapsedComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$12$lambda$11(long j, float f, long j2, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        DrawScope.m6960drawRoundRectuAw5IA$default(drawBehind, j, 0L, 0L, CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), null, 0.0f, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null);
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(4.0f) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) - 4.0f;
        DrawScope.m6960drawRoundRectuAw5IA$default(drawBehind, j2, jM6535constructorimpl, Size.m6575constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), null, 0.0f, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) / 2.0f;
        long jM6535constructorimpl2 = Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) / 2.0f;
        DrawScope.m6958drawRectnJ9OG0$default(drawBehind, j2, jM6535constructorimpl2, Size.m6575constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat4) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat5) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MobileLinkingCollapsedComposable(final Function0<Unit> onClick, final Function0<Unit> onClose, Modifier modifier, MobileLinkingCollapsedDuxo mobileLinkingCollapsedDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        MobileLinkingCollapsedDuxo mobileLinkingCollapsedDuxo2;
        Composer composer2;
        int i4;
        final MobileLinkingCollapsedDuxo mobileLinkingCollapsedDuxo3;
        final Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Composer composer3;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final MobileLinkingCollapsedDuxo mobileLinkingCollapsedDuxo4;
        Composer composer4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Composer composerStartRestartGroup = composer.startRestartGroup(1443351088);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClose) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    mobileLinkingCollapsedDuxo2 = mobileLinkingCollapsedDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(mobileLinkingCollapsedDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    mobileLinkingCollapsedDuxo2 = mobileLinkingCollapsedDuxo;
                }
                i3 |= i6;
            } else {
                mobileLinkingCollapsedDuxo2 = mobileLinkingCollapsedDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(MobileLinkingCollapsedDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedComposableKt$MobileLinkingCollapsedComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedComposableKt$MobileLinkingCollapsedComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composer2, 0);
                        composer2.endReplaceGroup();
                        mobileLinkingCollapsedDuxo3 = (MobileLinkingCollapsedDuxo) baseDuxo;
                        i4 = i3 & (-7169);
                    } else {
                        composer2 = composerStartRestartGroup;
                        i4 = i3;
                        mobileLinkingCollapsedDuxo3 = mobileLinkingCollapsedDuxo2;
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    mobileLinkingCollapsedDuxo3 = mobileLinkingCollapsedDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1443351088, i4, -1, "com.robinhood.android.linking.MobileLinkingCollapsedComposable (MobileLinkingCollapsedComposable.kt:53)");
                }
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composer2.endReplaceGroup();
                composer3 = composer2;
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(mobileLinkingCollapsedDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                Unit unit = Unit.INSTANCE;
                composer3.startReplaceGroup(-1633490746);
                zChangedInstance = composer3.changedInstance(mobileLinkingCollapsedDuxo3);
                objRememberedValue2 = composer3.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MobileLinkingCollapsedComposable3.MobileLinkingCollapsedComposable$lambda$6$lambda$5(mobileLinkingCollapsedDuxo3, snapshotState, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue2);
                }
                composer3.endReplaceGroup();
                LifecycleEffectKt.LifecycleResumeEffect(unit, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue2, composer3, 6, 2);
                boolean zMobileLinkingCollapsedComposable$lambda$1 = MobileLinkingCollapsedComposable$lambda$1(snapshotState);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, null, 6, null);
                composer3.startReplaceGroup(1849434622);
                objRememberedValue3 = composer3.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(MobileLinkingCollapsedComposable3.MobileLinkingCollapsedComposable$lambda$8$lambda$7(((Integer) obj).intValue()));
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                composer3.endReplaceGroup();
                mobileLinkingCollapsedDuxo4 = mobileLinkingCollapsedDuxo3;
                AnimatedVisibilityKt.AnimatedVisibility(zMobileLinkingCollapsedComposable$lambda$1, (Modifier) null, EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue3), (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(867503704, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedComposableKt.MobileLinkingCollapsedComposable.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer5, Integer num) {
                        invoke(animatedVisibilityScope, composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer5, int i7) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(867503704, i7, -1, "com.robinhood.android.linking.MobileLinkingCollapsedComposable.<anonymous> (MobileLinkingCollapsedComposable.kt:72)");
                        }
                        MobileLinkingCollapsedComposable3.Content(MobileLinkingCollapsedComposable3.MobileLinkingCollapsedComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle).getLinkingGroup(), onClick, onClose, modifier3, composer5, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 196992, 26);
                composer4 = composer3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                mobileLinkingCollapsedDuxo4 = mobileLinkingCollapsedDuxo2;
                composer4 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MobileLinkingCollapsedComposable3.MobileLinkingCollapsedComposable$lambda$9(onClick, onClose, modifier3, mobileLinkingCollapsedDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                modifier3 = modifier4;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composer2.endReplaceGroup();
                composer3 = composer2;
                final SnapshotState4<MobileLinkingCollapsedState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(mobileLinkingCollapsedDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                Unit unit2 = Unit.INSTANCE;
                composer3.startReplaceGroup(-1633490746);
                zChangedInstance = composer3.changedInstance(mobileLinkingCollapsedDuxo3);
                objRememberedValue2 = composer3.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MobileLinkingCollapsedComposable3.MobileLinkingCollapsedComposable$lambda$6$lambda$5(mobileLinkingCollapsedDuxo3, snapshotState, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue2);
                    composer3.endReplaceGroup();
                    LifecycleEffectKt.LifecycleResumeEffect(unit2, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue2, composer3, 6, 2);
                    boolean zMobileLinkingCollapsedComposable$lambda$12 = MobileLinkingCollapsedComposable$lambda$1(snapshotState);
                    TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(500, 0, null, 6, null);
                    composer3.startReplaceGroup(1849434622);
                    objRememberedValue3 = composer3.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    composer3.endReplaceGroup();
                    mobileLinkingCollapsedDuxo4 = mobileLinkingCollapsedDuxo3;
                    AnimatedVisibilityKt.AnimatedVisibility(zMobileLinkingCollapsedComposable$lambda$12, (Modifier) null, EnterExitTransitionKt.slideInVertically(tweenSpecTween$default2, (Function1) objRememberedValue3), (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(867503704, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedComposableKt.MobileLinkingCollapsedComposable.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer5, Integer num) {
                            invoke(animatedVisibilityScope, composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer5, int i7) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(867503704, i7, -1, "com.robinhood.android.linking.MobileLinkingCollapsedComposable.<anonymous> (MobileLinkingCollapsedComposable.kt:72)");
                            }
                            MobileLinkingCollapsedComposable3.Content(MobileLinkingCollapsedComposable3.MobileLinkingCollapsedComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle2).getLinkingGroup(), onClick, onClose, modifier3, composer5, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 196992, 26);
                    composer4 = composer3;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MobileLinkingCollapsedComposable$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult MobileLinkingCollapsedComposable$lambda$6$lambda$5(MobileLinkingCollapsedDuxo mobileLinkingCollapsedDuxo, final SnapshotState snapshotState, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobFetchLinkingGroup = mobileLinkingCollapsedDuxo.fetchLinkingGroup();
        MobileLinkingCollapsedComposable$lambda$2(snapshotState, true);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedComposableKt$MobileLinkingCollapsedComposable$lambda$6$lambda$5$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                MobileLinkingCollapsedComposable3.MobileLinkingCollapsedComposable$lambda$2(snapshotState, false);
                Job.DefaultImpls.cancel$default(jobFetchLinkingGroup, null, 1, null);
            }
        };
    }

    private static final boolean MobileLinkingCollapsedComposable$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MobileLinkingCollapsedState MobileLinkingCollapsedComposable$lambda$3(SnapshotState4<MobileLinkingCollapsedState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Content(final LinkingGroup linkingGroup, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function03;
        int i4;
        Modifier modifier2;
        final long jM21373getBg30d7_KjU;
        final float fMo5016toPx0680j_4;
        final long jM21371getBg0d7_KjU;
        boolean zChanged;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1488865827);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(linkingGroup) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function03 = function0;
        } else {
            function03 = function0;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1488865827, i3, -1, "com.robinhood.android.linking.Content (MobileLinkingCollapsedComposable.kt:87)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU();
                    float f = 16;
                    fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f));
                    jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged = composerStartRestartGroup.changed(jM21373getBg30d7_KjU) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MobileLinkingCollapsedComposable3.Content$lambda$12$lambda$11(jM21373getBg30d7_KjU, fMo5016toPx0680j_4, jM21371getBg0d7_KjU, (DrawScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(ClickableKt.m4893clickableXHw0xAI$default(Clip.clip(DrawModifierKt.drawBehind(modifierFillMaxWidth$default, (Function1) objRememberedValue), RoundedCornerShape2.m5329RoundedCornerShapea9UjIt4$default(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), 0.0f, 0.0f, 12, null)), false, null, null, function03, 7, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM());
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically = companion.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor);
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenterStart(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor2);
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifier5 = modifier4;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CLOSE_24), StringResources_androidKt.stringResource(C20838R.string.mobile_linking_content_description_close, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), ClickableKt.m4893clickableXHw0xAI$default(companion3, false, null, null, function02, 7, null), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable, 48);
                    composerStartRestartGroup.endNode();
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getCenter(), companion.getCenterHorizontally(), composerStartRestartGroup, 54);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                    Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor3);
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                    Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor4);
                    }
                    composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                    LinkingGroupColorsDto color = linkingGroup == null ? linkingGroup.getColor() : null;
                    composerStartRestartGroup.startReplaceGroup(110355499);
                    Color colorM6701boximpl = color != null ? null : Color.m6701boximpl(LinkingGroupColors2.toComposeColor(color, composerStartRestartGroup, 0));
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(110355089);
                    long jM21425getFg0d7_KjU = colorM6701boximpl != null ? bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU() : colorM6701boximpl.getValue();
                    composerStartRestartGroup.endReplaceGroup();
                    MobileLinkingColorComposable3.m16071MobileLinkingColorComposableKTwxG1Y(jM21425getFg0d7_KjU, null, MobileLinkingColorComposable4.SMALL, composerStartRestartGroup, 384, 2);
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    LocalShowPlaceholder.Loadable((linkingGroup == null ? linkingGroup.getInstrumentSymbol() : null) != null, null, null, ComposableLambda3.rememberComposableLambda(1719630123, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedComposableKt$Content$2$2$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            String instrumentSymbol;
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1719630123, i6, -1, "com.robinhood.android.linking.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MobileLinkingCollapsedComposable.kt:142)");
                            }
                            LinkingGroup linkingGroup2 = linkingGroup;
                            if (linkingGroup2 == null || (instrumentSymbol = linkingGroup2.getInstrumentSymbol()) == null) {
                                instrumentSymbol = "-----";
                            }
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(instrumentSymbol, null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i7).getTextM(), composer2, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    composerStartRestartGroup.endNode();
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C20838R.string.mobile_linking_connected_message, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MobileLinkingCollapsedComposable3.Content$lambda$17(linkingGroup, function0, function02, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                jM21373getBg30d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU();
                float f2 = 16;
                fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f2));
                jM21371getBg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU();
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = composerStartRestartGroup.changed(jM21373getBg30d7_KjU) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MobileLinkingCollapsedComposable3.Content$lambda$12$lambda$11(jM21373getBg30d7_KjU, fMo5016toPx0680j_4, jM21371getBg0d7_KjU, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(ClickableKt.m4893clickableXHw0xAI$default(Clip.clip(DrawModifierKt.drawBehind(modifierFillMaxWidth$default2, (Function1) objRememberedValue), RoundedCornerShape2.m5329RoundedCornerShapea9UjIt4$default(C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f2), 0.0f, 0.0f, 12, null)), false, null, null, function03, 7, null), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM());
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Modifier modifierWeight$default2 = Row5.weight$default(row62, companion32, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenterStart(), false);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Modifier modifier52 = modifier4;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CLOSE_24), StringResources_androidKt.stringResource(C20838R.string.mobile_linking_content_description_close, composerStartRestartGroup, 0), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), ClickableKt.m4893clickableXHw0xAI$default(companion32, false, null, null, function02, 7, null), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable, 48);
                            composerStartRestartGroup.endNode();
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getCenter(), companion4.getCenterHorizontally(), composerStartRestartGroup, 54);
                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                            Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl3.getInserting()) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
                                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                                Function0<ComposeUiNode> constructor42 = companion22.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash4 = companion22.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl4.getInserting()) {
                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion22.getSetModifier());
                                    if (linkingGroup == null) {
                                    }
                                    composerStartRestartGroup.startReplaceGroup(110355499);
                                    if (color != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(110355089);
                                    if (colorM6701boximpl != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    MobileLinkingColorComposable3.m16071MobileLinkingColorComposableKTwxG1Y(jM21425getFg0d7_KjU, null, MobileLinkingColorComposable4.SMALL, composerStartRestartGroup, 384, 2);
                                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                                    LocalShowPlaceholder.Loadable((linkingGroup == null ? linkingGroup.getInstrumentSymbol() : null) != null, null, null, ComposableLambda3.rememberComposableLambda(1719630123, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedComposableKt$Content$2$2$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i6) {
                                            String instrumentSymbol;
                                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1719630123, i6, -1, "com.robinhood.android.linking.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MobileLinkingCollapsedComposable.kt:142)");
                                            }
                                            LinkingGroup linkingGroup2 = linkingGroup;
                                            if (linkingGroup2 == null || (instrumentSymbol = linkingGroup2.getInstrumentSymbol()) == null) {
                                                instrumentSymbol = "-----";
                                            }
                                            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                            int i7 = BentoTheme.$stable;
                                            BentoText2.m20747BentoText38GnDrw(instrumentSymbol, null, Color.m6701boximpl(bentoTheme22.getColors(composer2, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer2, i7).getTextM(), composer2, 0, 0, 8186);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                                    composerStartRestartGroup.endNode();
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C20838R.string.mobile_linking_connected_message, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21456getPositive0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    composerStartRestartGroup.endNode();
                                    Spacer2.Spacer(Row5.weight$default(row62, companion32, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier52;
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void MobileLinkingCollapsedComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(944998290);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(944998290, i, -1, "com.robinhood.android.linking.MobileLinkingCollapsedComposablePreview (MobileLinkingCollapsedComposable.kt:161)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, MobileLinkingCollapsedComposable.INSTANCE.getLambda$1500872922$lib_mobile_linking_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MobileLinkingCollapsedComposable3.MobileLinkingCollapsedComposablePreview$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
