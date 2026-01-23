package com.robinhood.android.equities.taxlots.footer;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
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
import com.robinhood.android.common.C11048R;
import com.robinhood.android.equities.taxlots.C14807R;
import com.robinhood.android.equities.taxlots.footer.FooterDuxo;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.theme.style.ButtonStyle;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: FooterComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0013²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, m3636d2 = {"FooterComposable", "", "args", "Lcom/robinhood/android/equities/taxlots/footer/FooterDuxo$Args;", "onFooterClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/equities/taxlots/footer/FooterDuxo;", "(Lcom/robinhood/android/equities/taxlots/footer/FooterDuxo$Args;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/equities/taxlots/footer/FooterDuxo;Landroidx/compose/runtime/Composer;II)V", "viewState", "Lcom/robinhood/android/equities/taxlots/footer/FooterViewState;", "(Lcom/robinhood/android/equities/taxlots/footer/FooterViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "PreviewZero", "PreviewError", "PreviewBigNumber", "lib-tax-lots_externalDebug", "textColor", "Landroidx/compose/ui/graphics/Color;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.footer.FooterComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FooterComposable6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FooterComposable$lambda$10(FooterViewState footerViewState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FooterComposable(footerViewState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FooterComposable$lambda$4(FooterDuxo.Args args, Function0 function0, Modifier modifier, FooterDuxo footerDuxo, int i, int i2, Composer composer, int i3) {
        FooterComposable(args, function0, modifier, footerDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FooterComposable$lambda$9$lambda$8$lambda$7$lambda$5(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FooterComposable$lambda$9$lambda$8$lambda$7$lambda$6(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$11(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBigNumber$lambda$14(int i, Composer composer, int i2) {
        PreviewBigNumber(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewError$lambda$13(int i, Composer composer, int i2) {
        PreviewError(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewZero$lambda$12(int i, Composer composer, int i2) {
        PreviewZero(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FooterComposable(final FooterDuxo.Args args, final Function0<Unit> onFooterClicked, Modifier modifier, FooterDuxo footerDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final FooterDuxo footerDuxo2;
        Composer composer2;
        int i4;
        int i5;
        Modifier modifier3;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier4;
        final FooterDuxo footerDuxo3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(onFooterClicked, "onFooterClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1036457596);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFooterClicked) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    footerDuxo2 = footerDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(footerDuxo2) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    footerDuxo2 = footerDuxo;
                }
                i3 |= i7;
            } else {
                footerDuxo2 = footerDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = -1633490746;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(FooterDuxo.class), current, "selectLotsFooter", factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 384, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$FooterComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$FooterComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer2, 0);
                        composer2.endReplaceGroup();
                        i5 = i3 & (-7169);
                        modifier3 = modifier5;
                        footerDuxo2 = (FooterDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        i4 = -1633490746;
                        i5 = i3;
                        modifier3 = modifier5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i5 = i3;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    i4 = -1633490746;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1036457596, i5, -1, "com.robinhood.android.equities.taxlots.footer.FooterComposable (FooterComposable.kt:39)");
                }
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composer2.startReplaceGroup(i4);
                zChangedInstance = composer2.changedInstance(footerDuxo2) | composer2.changedInstance(args);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FooterComposable6.FooterComposable$lambda$2$lambda$1(footerDuxo2, args, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                Composer composer3 = composer2;
                LifecycleEffectKt.LifecycleResumeEffect(args, lifecycleOwner, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer3, i5 & 14, 0);
                FooterDuxo footerDuxo4 = footerDuxo2;
                Modifier modifier6 = modifier3;
                FooterComposable(FooterComposable$lambda$3(FlowExtKt.collectAsStateWithLifecycle(footerDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7)), onFooterClicked, modifier6, composer3, i5 & 1008, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
                footerDuxo3 = footerDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
                footerDuxo3 = footerDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FooterComposable6.FooterComposable$lambda$4(args, onFooterClicked, modifier4, footerDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i6 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composer2.startReplaceGroup(i4);
                zChangedInstance = composer2.changedInstance(footerDuxo2) | composer2.changedInstance(args);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FooterComposable6.FooterComposable$lambda$2$lambda$1(footerDuxo2, args, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                    composer2.endReplaceGroup();
                    Composer composer32 = composer2;
                    LifecycleEffectKt.LifecycleResumeEffect(args, lifecycleOwner2, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer32, i5 & 14, 0);
                    FooterDuxo footerDuxo42 = footerDuxo2;
                    Modifier modifier62 = modifier3;
                    FooterComposable(FooterComposable$lambda$3(FlowExtKt.collectAsStateWithLifecycle(footerDuxo42.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7)), onFooterClicked, modifier62, composer32, i5 & 1008, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier62;
                    footerDuxo3 = footerDuxo42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult FooterComposable$lambda$2$lambda$1(final FooterDuxo footerDuxo, FooterDuxo.Args args, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        footerDuxo.bind(args);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$FooterComposable$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                footerDuxo.bind(null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FooterComposable(final FooterViewState footerViewState, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1496126987);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(footerViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1496126987, i3, -1, "com.robinhood.android.equities.taxlots.footer.FooterComposable (FooterComposable.kt:60)");
                    }
                    final Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                    BigDecimal invalidNumberOfShares = footerViewState.getInvalidNumberOfShares();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FooterComposable6.FooterComposable$lambda$9$lambda$8$lambda$7((AnimatedContentTransitionScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    AnimatedContentKt.AnimatedContent(invalidNumberOfShares, null, (Function1) objRememberedValue, null, "error animation", null, ComposableLambda3.rememberComposableLambda(-1066990027, true, new Function4<AnimatedContentScope, BigDecimal, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$FooterComposable$3$2
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, BigDecimal bigDecimal, Composer composer2, Integer num) {
                            invoke(animatedContentScope, bigDecimal, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedContentScope AnimatedContent, BigDecimal bigDecimal, Composer composer2, int i5) {
                            int i6;
                            long jM21425getFg0d7_KjU;
                            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1066990027, i5, -1, "com.robinhood.android.equities.taxlots.footer.FooterComposable.<anonymous>.<anonymous> (FooterComposable.kt:71)");
                            }
                            if (bigDecimal != null) {
                                composer2.startReplaceGroup(353127077);
                                FooterErrorComposable3.FooterErrorComposable(bigDecimal, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), composer2, (i5 >> 3) & 14, 0);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(353410014);
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                Alignment.Vertical centerVertically = companion3.getCenterVertically();
                                FooterViewState footerViewState2 = footerViewState;
                                Resources resources2 = resources;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
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
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                Alignment.Horizontal start = companion3.getStart();
                                Modifier modifierWeight$default = Row5.weight$default(row6, companion2, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), start, composer2, 48);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
                                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor3);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14807R.string.footer_estimated_credit, composer2, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, null, composer2, 805306368, 0, 15866);
                                StringResource estimatedCredit = footerViewState2.getEstimatedCredit();
                                Intrinsics.checkNotNull(resources2);
                                String string2 = estimatedCredit.getText(resources2).toString();
                                TextStyle textM = bentoTheme.getTypography(composer2, i7).getTextM();
                                TextAlign.Companion companion5 = TextAlign.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 1, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(textM, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion5.m7924getStarte0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer2, 805306368, 0, 7678);
                                composer2.endNode();
                                Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                                Modifier modifierWeight$default2 = Row5.weight$default(row6, companion2, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default2);
                                Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor4);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14807R.string.footer_estimated_order_gain_loss, composer2, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, null, composer2, 805306368, 0, 15866);
                                String string3 = footerViewState2.getEstimatedGainLoss().getText(resources2).toString();
                                Boolean positiveGainLoss = footerViewState2.getPositiveGainLoss();
                                if (Intrinsics.areEqual(positiveGainLoss, Boolean.TRUE)) {
                                    composer2.startReplaceGroup(-714160878);
                                    i6 = i7;
                                    jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21456getPositive0d7_KjU();
                                    composer2.endReplaceGroup();
                                } else {
                                    i6 = i7;
                                    if (Intrinsics.areEqual(positiveGainLoss, Boolean.FALSE)) {
                                        composer2.startReplaceGroup(-714158702);
                                        jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21452getNegative0d7_KjU();
                                        composer2.endReplaceGroup();
                                    } else {
                                        if (positiveGainLoss != null) {
                                            composer2.startReplaceGroup(-714163633);
                                            composer2.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer2.startReplaceGroup(-714156564);
                                        jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU();
                                        composer2.endReplaceGroup();
                                    }
                                }
                                int i8 = i6;
                                BentoText2.m20747BentoText38GnDrw(string3, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 1, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer2, i6).getTextM(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion5.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer2, 805306368, 0, 7674);
                                composer2.endNode();
                                Alignment.Horizontal end = companion3.getEnd();
                                Modifier modifierWeight$default3 = Row5.weight$default(row6, companion2, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement.getTop(), end, composer2, 48);
                                int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default3);
                                Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor5);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy4, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion4.getSetModifier());
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14807R.string.footer_estimated_total_shares, composer2, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, null, composer2, 805306368, 0, 15866);
                                String str = Formats.getShareQuantityFormat().format(footerViewState2.getNumShares());
                                long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer2, i8).m21425getFg0d7_KjU();
                                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, 0, false, 1, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer2, i8).getTextM(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion5.m7920getEnde0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer2, 805306368, 0, 7674);
                                composer2.endNode();
                                composer2.endNode();
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 1597824, 42);
                    Modifier modifier5 = modifier4;
                    BentoButtonKt.m20585BentoButton6BkTXZw(function02, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, (footerViewState.getInvalidNumberOfShares() == null || (footerViewState.getM1Enabled() && Intrinsics.areEqual(footerViewState.getNumShares(), BigDecimal.ZERO))) ? false : true, false, null, null, false, null, ComposableLambda3.rememberComposableLambda(-1148060206, true, new Function4<Row5, ButtonStyle.Style, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$FooterComposable$3$3
                        private static final long invoke$lambda$0(SnapshotState4<Color> snapshotState4) {
                            return snapshotState4.getValue().getValue();
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, ButtonStyle.Style style, Composer composer2, Integer num) {
                            invoke(row5, style, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 BentoButton, ButtonStyle.Style style, Composer composer2, int i5) {
                            int i6;
                            Intrinsics.checkNotNullParameter(BentoButton, "$this$BentoButton");
                            Intrinsics.checkNotNullParameter(style, "style");
                            if ((i5 & 48) == 0) {
                                i6 = i5 | ((i5 & 64) == 0 ? composer2.changed(style) : composer2.changedInstance(style) ? 32 : 16);
                            } else {
                                i6 = i5;
                            }
                            if ((i6 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1148060206, i6, -1, "com.robinhood.android.equities.taxlots.footer.FooterComposable.<anonymous>.<anonymous> (FooterComposable.kt:143)");
                            }
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(footerViewState.getM1Enabled() ? C11048R.string.general_action_review : C14807R.string.footer_continue_table, composer2, 0), null, Color.m6701boximpl(invoke$lambda$0(style.getColors().getForegroundColor().get(true, composer2, (ButtonStyle.StateColor.$stable << 3) | 6))), null, null, null, null, 0, false, 0, 0, null, 0, style.getTextStyle(), composer2, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 805306368, 500);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return FooterComposable6.FooterComposable$lambda$10(footerViewState, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            modifier2 = modifier;
            if ((i3 & 147) != 146) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                    BigDecimal invalidNumberOfShares2 = footerViewState.getInvalidNumberOfShares();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    AnimatedContentKt.AnimatedContent(invalidNumberOfShares2, null, (Function1) objRememberedValue, null, "error animation", null, ComposableLambda3.rememberComposableLambda(-1066990027, true, new Function4<AnimatedContentScope, BigDecimal, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$FooterComposable$3$2
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, BigDecimal bigDecimal, Composer composer2, Integer num) {
                            invoke(animatedContentScope, bigDecimal, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedContentScope AnimatedContent, BigDecimal bigDecimal, Composer composer2, int i5) {
                            int i6;
                            long jM21425getFg0d7_KjU;
                            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1066990027, i5, -1, "com.robinhood.android.equities.taxlots.footer.FooterComposable.<anonymous>.<anonymous> (FooterComposable.kt:71)");
                            }
                            if (bigDecimal != null) {
                                composer2.startReplaceGroup(353127077);
                                FooterErrorComposable3.FooterErrorComposable(bigDecimal, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), composer2, (i5 >> 3) & 14, 0);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(353410014);
                                Modifier.Companion companion22 = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                Alignment.Vertical centerVertically = companion3.getCenterVertically();
                                FooterViewState footerViewState2 = footerViewState;
                                Resources resources22 = resources2;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor22 = companion4.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor22);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion4.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                Alignment.Horizontal start = companion3.getStart();
                                Modifier modifierWeight$default = Row5.weight$default(row6, companion22, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement.getTop(), start, composer2, 48);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
                                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor3);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                                Column6 column622 = Column6.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14807R.string.footer_estimated_credit, composer2, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, null, composer2, 805306368, 0, 15866);
                                StringResource estimatedCredit = footerViewState2.getEstimatedCredit();
                                Intrinsics.checkNotNull(resources22);
                                String string2 = estimatedCredit.getText(resources22).toString();
                                TextStyle textM = bentoTheme.getTypography(composer2, i7).getTextM();
                                TextAlign.Companion companion5 = TextAlign.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 1, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(textM, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion5.m7924getStarte0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer2, 805306368, 0, 7678);
                                composer2.endNode();
                                Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                                Modifier modifierWeight$default2 = Row5.weight$default(row6, companion22, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default2);
                                Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor4);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14807R.string.footer_estimated_order_gain_loss, composer2, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, null, composer2, 805306368, 0, 15866);
                                String string3 = footerViewState2.getEstimatedGainLoss().getText(resources22).toString();
                                Boolean positiveGainLoss = footerViewState2.getPositiveGainLoss();
                                if (Intrinsics.areEqual(positiveGainLoss, Boolean.TRUE)) {
                                    composer2.startReplaceGroup(-714160878);
                                    i6 = i7;
                                    jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21456getPositive0d7_KjU();
                                    composer2.endReplaceGroup();
                                } else {
                                    i6 = i7;
                                    if (Intrinsics.areEqual(positiveGainLoss, Boolean.FALSE)) {
                                        composer2.startReplaceGroup(-714158702);
                                        jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21452getNegative0d7_KjU();
                                        composer2.endReplaceGroup();
                                    } else {
                                        if (positiveGainLoss != null) {
                                            composer2.startReplaceGroup(-714163633);
                                            composer2.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer2.startReplaceGroup(-714156564);
                                        jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU();
                                        composer2.endReplaceGroup();
                                    }
                                }
                                int i8 = i6;
                                BentoText2.m20747BentoText38GnDrw(string3, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 1, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer2, i6).getTextM(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion5.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer2, 805306368, 0, 7674);
                                composer2.endNode();
                                Alignment.Horizontal end = companion3.getEnd();
                                Modifier modifierWeight$default3 = Row5.weight$default(row6, companion22, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement.getTop(), end, composer2, 48);
                                int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default3);
                                Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor5);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy4, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion4.getSetModifier());
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14807R.string.footer_estimated_total_shares, composer2, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, null, composer2, 805306368, 0, 15866);
                                String str = Formats.getShareQuantityFormat().format(footerViewState2.getNumShares());
                                long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer2, i8).m21425getFg0d7_KjU();
                                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, 0, false, 1, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer2, i8).getTextM(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion5.m7920getEnde0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer2, 805306368, 0, 7674);
                                composer2.endNode();
                                composer2.endNode();
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 1597824, 42);
                    if (footerViewState.getInvalidNumberOfShares() == null) {
                        Modifier modifier52 = modifier4;
                        BentoButtonKt.m20585BentoButton6BkTXZw(function02, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, (footerViewState.getInvalidNumberOfShares() == null || (footerViewState.getM1Enabled() && Intrinsics.areEqual(footerViewState.getNumShares(), BigDecimal.ZERO))) ? false : true, false, null, null, false, null, ComposableLambda3.rememberComposableLambda(-1148060206, true, new Function4<Row5, ButtonStyle.Style, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$FooterComposable$3$3
                            private static final long invoke$lambda$0(SnapshotState4<Color> snapshotState4) {
                                return snapshotState4.getValue().getValue();
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, ButtonStyle.Style style, Composer composer2, Integer num) {
                                invoke(row5, style, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 BentoButton, ButtonStyle.Style style, Composer composer2, int i5) {
                                int i6;
                                Intrinsics.checkNotNullParameter(BentoButton, "$this$BentoButton");
                                Intrinsics.checkNotNullParameter(style, "style");
                                if ((i5 & 48) == 0) {
                                    i6 = i5 | ((i5 & 64) == 0 ? composer2.changed(style) : composer2.changedInstance(style) ? 32 : 16);
                                } else {
                                    i6 = i5;
                                }
                                if ((i6 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1148060206, i6, -1, "com.robinhood.android.equities.taxlots.footer.FooterComposable.<anonymous>.<anonymous> (FooterComposable.kt:143)");
                                }
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(footerViewState.getM1Enabled() ? C11048R.string.general_action_review : C14807R.string.footer_continue_table, composer2, 0), null, Color.m6701boximpl(invoke$lambda$0(style.getColors().getForegroundColor().get(true, composer2, (ButtonStyle.StateColor.$stable << 3) | 6))), null, null, null, null, 0, false, 0, 0, null, 0, style.getTextStyle(), composer2, 0, 0, 8186);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 805306368, 500);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform FooterComposable$lambda$9$lambda$8$lambda$7(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically$default(null, new Function1() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(FooterComposable6.FooterComposable$lambda$9$lambda$8$lambda$7$lambda$5(((Integer) obj).intValue()));
            }
        }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutVertically$default(null, new Function1() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(FooterComposable6.FooterComposable$lambda$9$lambda$8$lambda$7$lambda$6(((Integer) obj).intValue()));
            }
        }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)));
    }

    private static final FooterViewState FooterComposable$lambda$3(SnapshotState4<FooterViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(652204619);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(652204619, i, -1, "com.robinhood.android.equities.taxlots.footer.Preview (FooterComposable.kt:161)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, FooterComposable.INSTANCE.getLambda$1979249555$lib_tax_lots_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FooterComposable6.Preview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewZero(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1818546813);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1818546813, i, -1, "com.robinhood.android.equities.taxlots.footer.PreviewZero (FooterComposable.kt:179)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, FooterComposable.INSTANCE.getLambda$309748427$lib_tax_lots_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FooterComposable6.PreviewZero$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewError(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(500146519);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(500146519, i, -1, "com.robinhood.android.equities.taxlots.footer.PreviewError (FooterComposable.kt:197)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, FooterComposable.INSTANCE.getLambda$2052789519$lib_tax_lots_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FooterComposable6.PreviewError$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewBigNumber(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-943138794);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-943138794, i, -1, "com.robinhood.android.equities.taxlots.footer.PreviewBigNumber (FooterComposable.kt:216)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, FooterComposable.INSTANCE.getLambda$1166258126$lib_tax_lots_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.footer.FooterComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FooterComposable6.PreviewBigNumber$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
