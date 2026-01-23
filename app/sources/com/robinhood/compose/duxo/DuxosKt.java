package com.robinhood.compose.duxo;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactoryCreator2;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Tuples4;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: Duxos.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u0002H\u0001\"\u0012\b\u0000\u0010\u0001\u0018\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0087\b¢\u0006\u0002\u0010\u0007\u001aV\u0010\u0000\u001a\u0002H\u0001\"\u001c\b\u0000\u0010\u0001\u0018\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002*\b\u0012\u0004\u0012\u0002H\t0\b\"\n\b\u0001\u0010\t\u0018\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u0002H\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\f\u001a\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u000f\"\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"duxo", "D", "Lcom/robinhood/android/udf/BaseDuxo;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "key", "", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/udf/HasArgs;", "E", "Landroid/os/Parcelable;", "arg", "(Landroid/os/Parcelable;Ljava/lang/String;Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/android/udf/BaseDuxo;", "createViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;", "COMPOSE_DUXO_TERMINAL_EVENT", "Lcom/robinhood/disposer/LifecycleEvent;", "getCOMPOSE_DUXO_TERMINAL_EVENT", "()Lcom/robinhood/disposer/LifecycleEvent;", "lib-compose-duxo_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class DuxosKt {
    private static final LifecycleEvent COMPOSE_DUXO_TERMINAL_EVENT = LifecycleEvent.ON_DESTROY;

    public static final /* synthetic */ <D extends BaseDuxo<?, ?>> D duxo(ViewModelStoreOwner viewModelStoreOwner, String str, Composer composer, int i, int i2) {
        CreationExtras defaultViewModelCreationExtras;
        composer.startReplaceGroup(-747520797);
        if ((i2 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if ((i2 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        ViewModelProvider.Factory factoryCreateViewModelFactory = createViewModelFactory(viewModelStoreOwner2, composer, i & 14);
        int i3 = i & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
        composer.startReplaceableGroup(1729797275);
        if (viewModelStoreOwner2 instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
        }
        CreationExtras creationExtras = defaultViewModelCreationExtras;
        Intrinsics.reifiedOperationMarker(4, "D");
        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStoreOwner2, str2, factoryCreateViewModelFactory, creationExtras, composer, (i3 << 3) & 1008, 0);
        composer.endReplaceableGroup();
        final D d = (D) viewModel;
        final Lifecycle lifecycle = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(d) | composer.changedInstance(lifecycle);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.compose.duxo.DuxosKt$duxo$2$1
                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(d);
                    lifecycle.addObserver(duxoLifecycleObserver);
                    final Lifecycle lifecycle2 = lifecycle;
                    return new DisposableEffectResult() { // from class: com.robinhood.compose.duxo.DuxosKt$duxo$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            lifecycle2.removeObserver(duxoLifecycleObserver);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
        composer.endReplaceGroup();
        return d;
    }

    /* JADX WARN: Incorrect return type in method signature: <D:Lcom/robinhood/android/udf/BaseDuxo<**>;:Lcom/robinhood/android/udf/HasArgs<TE;>;E::Landroid/os/Parcelable;>(TE;Ljava/lang/String;Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;II)TD; */
    public static final /* synthetic */ BaseDuxo duxo(Parcelable arg, String str, ViewModelStoreOwner viewModelStoreOwner, Composer composer, int i, int i2) {
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(arg, "arg");
        composer.startReplaceGroup(2050738472);
        if ((i2 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i2 & 4) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if (viewModelStoreOwner2 instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
        }
        CreationExtras2 creationExtras2 = new CreationExtras2(defaultViewModelCreationExtras);
        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, arg)));
        int i3 = (i >> 6) & 14;
        ViewModelProvider.Factory factoryCreateViewModelFactory = createViewModelFactory(viewModelStoreOwner2, composer, i3);
        composer.startReplaceableGroup(1729797275);
        Intrinsics.reifiedOperationMarker(4, "D");
        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStoreOwner2, str2, factoryCreateViewModelFactory, creationExtras2, composer, ((i3 | (i & 112)) << 3) & 1008, 0);
        composer.endReplaceableGroup();
        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
        final Lifecycle lifecycle = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(baseDuxo) | composer.changedInstance(lifecycle);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.compose.duxo.DuxosKt$duxo$4$1
                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                    lifecycle.addObserver(duxoLifecycleObserver);
                    final Lifecycle lifecycle2 = lifecycle;
                    return new DisposableEffectResult() { // from class: com.robinhood.compose.duxo.DuxosKt$duxo$4$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            lifecycle2.removeObserver(duxoLifecycleObserver);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
        composer.endReplaceGroup();
        return baseDuxo;
    }

    @PublishedApi
    public static final ViewModelProvider.Factory createViewModelFactory(ViewModelStoreOwner viewModelStoreOwner, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        composer.startReplaceGroup(-567456584);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-567456584, i, -1, "com.robinhood.compose.duxo.createViewModelFactory (Duxos.kt:90)");
        }
        ViewModelProvider.Factory factoryCreateHammerViewModelFactory = viewModelStoreOwner instanceof NavBackStackEntry ? HammerViewModelFactoryCreator2.createHammerViewModelFactory((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), (NavBackStackEntry) viewModelStoreOwner) : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return factoryCreateHammerViewModelFactory;
    }

    public static final LifecycleEvent getCOMPOSE_DUXO_TERMINAL_EVENT() {
        return COMPOSE_DUXO_TERMINAL_EVENT;
    }
}
