package com.robinhood.android.transfers.p271ui.max.accounts;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.accounts.ConfirmDeleteDialogComposable;
import com.robinhood.android.transfers.p271ui.max.accounts.ConfirmDeleteDialogFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.common.strings.C32428R;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConfirmDeleteDialogComposable.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\u0012\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u008a\u0084\u0002"}, m3636d2 = {"ConfirmDeleteDialogComposable", "", "args", "Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogFragment$Args;", "callbacks", "Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogFragment$Callbacks;", "dismiss", "Lkotlin/Function0;", "onDismissibleChange", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogDuxo;", "(Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogFragment$Args;Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogFragment$Callbacks;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-transfers_externalRelease", "viewState", "Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ConfirmDeleteDialogComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmDeleteDialogComposable$lambda$4(ConfirmDeleteDialogFragment.Args args, ConfirmDeleteDialogFragment.Callbacks callbacks, Function0 function0, Function1 function1, Modifier modifier, ConfirmDeleteDialogDuxo confirmDeleteDialogDuxo, int i, int i2, Composer composer, int i3) {
        ConfirmDeleteDialogComposable(args, callbacks, function0, function1, modifier, confirmDeleteDialogDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfirmDeleteDialogComposable(final ConfirmDeleteDialogFragment.Args args, final ConfirmDeleteDialogFragment.Callbacks callbacks, final Function0<Unit> dismiss, final Function1<? super Boolean, Unit> onDismissibleChange, Modifier modifier, ConfirmDeleteDialogDuxo confirmDeleteDialogDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ConfirmDeleteDialogDuxo confirmDeleteDialogDuxo2;
        Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        int i4;
        int i5;
        ConfirmDeleteDialogDuxo confirmDeleteDialogDuxo3;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        boolean zChanged;
        Object objRememberedValue;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2;
        boolean zChanged2;
        Object objRememberedValue2;
        final ConfirmDeleteDialogDuxo confirmDeleteDialogDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        Intrinsics.checkNotNullParameter(onDismissibleChange, "onDismissibleChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(182987330);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(dismiss) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissibleChange) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    confirmDeleteDialogDuxo2 = confirmDeleteDialogDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(confirmDeleteDialogDuxo2) ? 131072 : 65536;
                    i3 |= i7;
                } else {
                    confirmDeleteDialogDuxo2 = confirmDeleteDialogDuxo;
                }
                i3 |= i7;
            } else {
                confirmDeleteDialogDuxo2 = confirmDeleteDialogDuxo;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(defaultViewModelCreationExtras);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = -1633490746;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ConfirmDeleteDialogDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogComposableKt$ConfirmDeleteDialogComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogComposableKt$ConfirmDeleteDialogComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i5 = i3 & (-458753);
                        confirmDeleteDialogDuxo3 = (ConfirmDeleteDialogDuxo) baseDuxo;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(182987330, i5, -1, "com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogComposable (ConfirmDeleteDialogComposable.kt:31)");
                    }
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(confirmDeleteDialogDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Boolean boolValueOf = Boolean.valueOf(ConfirmDeleteDialogComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isDismissible());
                    composerStartRestartGroup.startReplaceGroup(i4);
                    zChanged = ((i5 & 7168) == 2048) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ConfirmDeleteDialogComposable2(onDismissibleChange, snapshotState4CollectAsStateWithLifecycle, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                    snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(confirmDeleteDialogDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Event<ConfirmDeleteDialogEvent> eventConfirmDeleteDialogComposable$lambda$2 = ConfirmDeleteDialogComposable$lambda$2(snapshotState4CollectAsStateWithLifecycle2);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged2 = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle2) | ((i5 & 112) != 32 || ((i5 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | ((i5 & 896) != 256);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new ConfirmDeleteDialogComposable3(snapshotState4CollectAsStateWithLifecycle2, callbacks, dismiss, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(eventConfirmDeleteDialogComposable$lambda$2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1039784855, true, new C307043(modifier3, confirmDeleteDialogDuxo3, dismiss, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Modifier modifier5 = modifier3;
                    confirmDeleteDialogDuxo4 = confirmDeleteDialogDuxo3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    modifier3 = modifier2;
                }
                i4 = -1633490746;
                i5 = i3;
                confirmDeleteDialogDuxo3 = confirmDeleteDialogDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(confirmDeleteDialogDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Boolean boolValueOf2 = Boolean.valueOf(ConfirmDeleteDialogComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isDismissible());
                composerStartRestartGroup.startReplaceGroup(i4);
                zChanged = ((i5 & 7168) == 2048) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new ConfirmDeleteDialogComposable2(onDismissibleChange, snapshotState4CollectAsStateWithLifecycle, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                    snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(confirmDeleteDialogDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Event<ConfirmDeleteDialogEvent> eventConfirmDeleteDialogComposable$lambda$22 = ConfirmDeleteDialogComposable$lambda$2(snapshotState4CollectAsStateWithLifecycle2);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    if ((i5 & 112) != 32) {
                        zChanged2 = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle2) | ((i5 & 112) != 32 || ((i5 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | ((i5 & 896) != 256);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue2 = new ConfirmDeleteDialogComposable3(snapshotState4CollectAsStateWithLifecycle2, callbacks, dismiss, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(eventConfirmDeleteDialogComposable$lambda$22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1039784855, true, new C307043(modifier3, confirmDeleteDialogDuxo3, dismiss, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier modifier52 = modifier3;
                            confirmDeleteDialogDuxo4 = confirmDeleteDialogDuxo3;
                            modifier4 = modifier52;
                        }
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                confirmDeleteDialogDuxo4 = confirmDeleteDialogDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ConfirmDeleteDialogComposable.ConfirmDeleteDialogComposable$lambda$4(args, callbacks, dismiss, onDismissibleChange, modifier4, confirmDeleteDialogDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 32) == 0) {
                    i4 = -1633490746;
                    i5 = i3;
                    confirmDeleteDialogDuxo3 = confirmDeleteDialogDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(confirmDeleteDialogDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Boolean boolValueOf22 = Boolean.valueOf(ConfirmDeleteDialogComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isDismissible());
                composerStartRestartGroup.startReplaceGroup(i4);
                zChanged = ((i5 & 7168) == 2048) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: ConfirmDeleteDialogComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogComposableKt$ConfirmDeleteDialogComposable$3 */
    static final class C307043 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $dismiss;
        final /* synthetic */ ConfirmDeleteDialogDuxo $duxo;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ SnapshotState4<ConfirmDeleteDialogViewState> $viewState$delegate;

        C307043(Modifier modifier, ConfirmDeleteDialogDuxo confirmDeleteDialogDuxo, Function0<Unit> function0, SnapshotState4<ConfirmDeleteDialogViewState> snapshotState4) {
            this.$modifier = modifier;
            this.$duxo = confirmDeleteDialogDuxo;
            this.$dismiss = function0;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(ConfirmDeleteDialogDuxo confirmDeleteDialogDuxo) {
            confirmDeleteDialogDuxo.deleteAccount();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1039784855, i, -1, "com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogComposable.<anonymous> (ConfirmDeleteDialogComposable.kt:50)");
            }
            Modifier modifier = this.$modifier;
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            final ConfirmDeleteDialogDuxo confirmDeleteDialogDuxo = this.$duxo;
            final Function0<Unit> function0 = this.$dismiss;
            SnapshotState4<ConfirmDeleteDialogViewState> snapshotState4 = this.$viewState$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C30065R.string.confirm_deletion, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleSmall, composer, 0, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C30065R.string.confirm_deletion_dialog_message, composer, 0), PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8124);
            String strStringResource2 = StringResources_androidKt.stringResource(C32428R.string.general_label_delete, composer, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composer, 0);
            boolean zIsPrimaryButtonLoading = ConfirmDeleteDialogComposable.ConfirmDeleteDialogComposable$lambda$0(snapshotState4).isPrimaryButtonLoading();
            boolean zIsSecondaryButtonEnabled = ConfirmDeleteDialogComposable.ConfirmDeleteDialogComposable$lambda$0(snapshotState4).isSecondaryButtonEnabled();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(confirmDeleteDialogDuxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogComposableKt$ConfirmDeleteDialogComposable$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConfirmDeleteDialogComposable.C307043.invoke$lambda$4$lambda$1$lambda$0(confirmDeleteDialogDuxo);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function02 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(function0);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogComposableKt$ConfirmDeleteDialogComposable$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConfirmDeleteDialogComposable.C307043.invoke$lambda$4$lambda$3$lambda$2(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function02, strStringResource2, zIsPrimaryButtonLoading, null, false, (Function0) objRememberedValue2, strStringResource3, false, null, zIsSecondaryButtonEnabled, composer, 0, 0, 26175);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConfirmDeleteDialogViewState ConfirmDeleteDialogComposable$lambda$0(SnapshotState4<ConfirmDeleteDialogViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<ConfirmDeleteDialogEvent> ConfirmDeleteDialogComposable$lambda$2(SnapshotState4<Event<ConfirmDeleteDialogEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
