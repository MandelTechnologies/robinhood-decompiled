package com.robinhood.android.crypto.authorize.wallet;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import androidx.view.compose.LocalActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposable;
import com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletDuxo;
import com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletDuxo2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import kotlin.Metadata;
import kotlin.Tuples4;
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

/* compiled from: AuthorizeWalletComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\u0012\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u008a\u0084\u0002"}, m3636d2 = {"AuthorizeWalletComposable", "", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletDuxo;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-authorize-wallet_externalRelease", "viewState", "Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AuthorizeWalletComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthorizeWalletComposable$lambda$5(String str, Modifier modifier, AuthorizeWalletDuxo authorizeWalletDuxo, int i, int i2, Composer composer, int i3) {
        AuthorizeWalletComposable(str, modifier, authorizeWalletDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AuthorizeWalletComposable(final String deviceId, Modifier modifier, AuthorizeWalletDuxo authorizeWalletDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        AuthorizeWalletDuxo authorizeWalletDuxo2;
        Modifier modifier3;
        Composer composer2;
        int i4;
        AuthorizeWalletDuxo authorizeWalletDuxo3;
        final Context context;
        final Activity activity;
        final Navigator navigator;
        final Event<AuthorizeWalletDuxo2> eventAuthorizeWalletComposable$lambda$1;
        final Event<AuthorizeWalletDuxo2> eventAuthorizeWalletComposable$lambda$12;
        final Event<AuthorizeWalletDuxo2> eventAuthorizeWalletComposable$lambda$13;
        Composer composer3;
        final AuthorizeWalletDuxo authorizeWalletDuxo4;
        final Modifier modifier4;
        EventConsumer<AuthorizeWalletDuxo2> eventConsumerInvoke;
        EventConsumer<AuthorizeWalletDuxo2> eventConsumerInvoke2;
        EventConsumer<AuthorizeWalletDuxo2> eventConsumerInvoke3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Composer composerStartRestartGroup = composer.startRestartGroup(348083445);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(deviceId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    authorizeWalletDuxo2 = authorizeWalletDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(authorizeWalletDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    authorizeWalletDuxo2 = authorizeWalletDuxo;
                }
                i3 |= i6;
            } else {
                authorizeWalletDuxo2 = authorizeWalletDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        AuthorizeWalletDuxo.Args args = new AuthorizeWalletDuxo.Args(deviceId);
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AuthorizeWalletDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                        composer2.endReplaceGroup();
                        AuthorizeWalletDuxo authorizeWalletDuxo5 = (AuthorizeWalletDuxo) baseDuxo;
                        i4 = i3 & (-897);
                        authorizeWalletDuxo3 = authorizeWalletDuxo5;
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(348083445, i4, -1, "com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposable (AuthorizeWalletComposable.kt:59)");
                    }
                    Composer composer4 = composer2;
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(authorizeWalletDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(authorizeWalletDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                    context = (Context) composer4.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Object objConsume = composer4.consume(LocalActivity.getLocalActivity());
                    Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                    activity = (Activity) objConsume;
                    navigator = (Navigator) composer4.consume(LocalNavigator.getLocalNavigator());
                    final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer4, AutoLoggingCompositionLocals4.$stable);
                    eventAuthorizeWalletComposable$lambda$1 = AuthorizeWalletComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventAuthorizeWalletComposable$lambda$1 != null && (eventAuthorizeWalletComposable$lambda$1.getData() instanceof AuthorizeWalletDuxo2.Finish) && (eventConsumerInvoke3 = eventAuthorizeWalletComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke3.consume(eventAuthorizeWalletComposable$lambda$1, new Function1() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m12911invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m12911invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                activity.finish();
                            }
                        });
                    }
                    eventAuthorizeWalletComposable$lambda$12 = AuthorizeWalletComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventAuthorizeWalletComposable$lambda$12 != null && (eventAuthorizeWalletComposable$lambda$12.getData() instanceof AuthorizeWalletDuxo2.Error) && (eventConsumerInvoke2 = eventAuthorizeWalletComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke2.consume(eventAuthorizeWalletComposable$lambda$12, new Function1() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                                m12912invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m12912invoke(Object it) throws Throwable {
                                Intrinsics.checkNotNullParameter(it, "it");
                                ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, activity, ((AuthorizeWalletDuxo2.Error) eventAuthorizeWalletComposable$lambda$12.getData()).getError(), true, false, 0, null, 56, null);
                            }
                        });
                    }
                    eventAuthorizeWalletComposable$lambda$13 = AuthorizeWalletComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventAuthorizeWalletComposable$lambda$13 != null && (eventAuthorizeWalletComposable$lambda$13.getData() instanceof AuthorizeWalletDuxo2.NavigateToGoldUpgrade) && (eventConsumerInvoke = eventAuthorizeWalletComposable$lambda$13.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventAuthorizeWalletComposable$lambda$13, new Function1() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$$inlined$consumeIfType$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m12913invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m12913invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                Navigator.DefaultImpls.startActivity$default(navigator, context, ((AuthorizeWalletDuxo2.NavigateToGoldUpgrade) eventAuthorizeWalletComposable$lambda$13.getData()).getGoldUpgradeIntentKey(), null, false, null, null, 60, null);
                            }
                        });
                    }
                    Modifier modifier5 = modifier3;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.autoLogEvents$default(modifier5, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.GOLD_STATUS_NCW_AUTH, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), ComposableLambda3.rememberComposableLambda(1384064177, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt.AuthorizeWalletComposable.4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i7) {
                            if ((i7 & 3) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1384064177, i7, -1, "com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposable.<anonymous> (AuthorizeWalletComposable.kt:96)");
                            }
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(AuthorizeWalletComposable2.INSTANCE.getLambda$192749540$feature_authorize_wallet_externalRelease(), null, ComposableLambda3.rememberComposableLambda(217731344, true, new AnonymousClass1(activity), composer5, 54), null, null, false, false, null, null, 0L, null, composer5, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: AuthorizeWalletComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$4$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ Activity $activity;

                            AnonymousClass1(Activity activity) {
                                this.$activity = activity;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(Activity activity) {
                                activity.finish();
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 6) == 0) {
                                    i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(217731344, i, -1, "com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposable.<anonymous>.<anonymous> (AuthorizeWalletComposable.kt:99)");
                                }
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.$activity);
                                final Activity activity = this.$activity;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$4$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AuthorizeWalletComposable.C127664.AnonymousClass1.invoke$lambda$1$lambda$0(activity);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }
                    }, composer4, 54), null, null, null, 0, 0L, 0L, WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, composer4, 6), ComposableLambda3.rememberComposableLambda(-1969295290, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt.AuthorizeWalletComposable.5
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer5, Integer num) {
                            invoke(paddingValues, composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer5, int i7) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i7 & 6) == 0) {
                                i7 |= composer5.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1969295290, i7, -1, "com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposable.<anonymous> (AuthorizeWalletComposable.kt:104)");
                            }
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), false, ComposableLambda3.rememberComposableLambda(1414181233, true, new AnonymousClass1(navigator, context, current2, snapshotState4CollectAsStateWithLifecycle, activity), composer5, 54), AuthorizeWalletComposable2.INSTANCE.getLambda$767616094$feature_authorize_wallet_externalRelease(), composer5, 3456, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: AuthorizeWalletComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$5$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                            final /* synthetic */ Activity $activity;
                            final /* synthetic */ Context $context;
                            final /* synthetic */ EventLogger $eventLogger;
                            final /* synthetic */ Navigator $navigator;
                            final /* synthetic */ SnapshotState4<AuthorizeWalletViewState> $viewState$delegate;

                            AnonymousClass1(Navigator navigator, Context context, EventLogger eventLogger, SnapshotState4<AuthorizeWalletViewState> snapshotState4, Activity activity) {
                                this.$navigator = navigator;
                                this.$context = context;
                                this.$eventLogger = eventLogger;
                                this.$viewState$delegate = snapshotState4;
                                this.$activity = activity;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                                invoke(bentoButtonBar3, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1414181233, i, -1, "com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposable.<anonymous>.<anonymous> (AuthorizeWalletComposable.kt:141)");
                                }
                                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Screen.Name name = Screen.Name.GOLD_STATUS_NCW_AUTH;
                                Screen screen = new Screen(name, null, null, null, 14, null);
                                Component.ComponentType componentType = Component.ComponentType.BUTTON;
                                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ModifiersKt.autoLogEvents$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, new UserInteractionEventDescriptor(null, screen, null, null, new Component(componentType, "CONTINUE", null, 4, null), null, 45, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), null, null, new Component(componentType, "DISMISS", null, 4, null), null, 45, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                                boolean z = !AuthorizeWalletComposable.AuthorizeWalletComposable$lambda$0(this.$viewState$delegate).getLoading();
                                String strStringResource = StringResources_androidKt.stringResource(C12774R.string.authorize_wallet_primary_cta, composer, 0);
                                ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.LINK_OUT_16;
                                BentoButtons.Icon.Position position = BentoButtons.Icon.Position.Trailing;
                                BentoButtons.Icon.Size16 size16 = new BentoButtons.Icon.Size16(serverToBentoAssetMapper2, position);
                                boolean z2 = !AuthorizeWalletComposable.AuthorizeWalletComposable$lambda$0(this.$viewState$delegate).getLoading();
                                String strStringResource2 = StringResources_androidKt.stringResource(C12774R.string.authorize_wallet_secondary_cta, composer, 0);
                                BentoButtons.Icon.Size16 size162 = new BentoButtons.Icon.Size16(serverToBentoAssetMapper2, position);
                                String strStringResource3 = StringResources_androidKt.stringResource(C12774R.string.gated_gold_authorize_wallet_disclaimer, composer, 0);
                                String strStringResource4 = StringResources_androidKt.stringResource(C12774R.string.gated_gold_authorize_wallet_disclaimer_learn_more, composer, 0);
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                                final Navigator navigator = this.$navigator;
                                final Context context = this.$context;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$5$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AuthorizeWalletComposable.C127675.AnonymousClass1.invoke$lambda$1$lambda$0(navigator, context);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(-1224400529);
                                boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$context) | composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$activity);
                                final EventLogger eventLogger = this.$eventLogger;
                                final Context context2 = this.$context;
                                final Activity activity = this.$activity;
                                final SnapshotState4<AuthorizeWalletViewState> snapshotState4 = this.$viewState$delegate;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$5$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AuthorizeWalletComposable.C127675.AnonymousClass1.invoke$lambda$5$lambda$4(eventLogger, context2, activity, snapshotState4);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                Function0 function02 = (Function0) objRememberedValue2;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(-1746271574);
                                boolean zChangedInstance3 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$context) | composer.changedInstance(this.$activity);
                                final EventLogger eventLogger2 = this.$eventLogger;
                                final Context context3 = this.$context;
                                final Activity activity2 = this.$activity;
                                Object objRememberedValue3 = composer.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$5$1$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AuthorizeWalletComposable.C127675.AnonymousClass1.invoke$lambda$8$lambda$7(eventLogger2, context3, activity2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                composer.endReplaceGroup();
                                int i2 = BentoButtons.Icon.Size16.$stable;
                                BentoButtonBar2.BentoButtonBar(modifierAutoLogEvents$default, strStringResource3, strStringResource4, false, function0, null, function02, strStringResource, false, size16, z, (Function0) objRememberedValue3, strStringResource2, false, size162, z2, composer, i2 << 27, i2 << 12, 8488);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$5$lambda$4(EventLogger eventLogger, Context context, Activity activity, SnapshotState4 snapshotState4) {
                                EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.GOLD_STATUS_NCW_AUTH, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "CONTINUE", null, 4, null), null, null, false, 57, null);
                                Intent intent = new Intent("com.robinhood.wallet.AUTHORIZE_WALLET");
                                intent.putExtra("token", AuthorizeWalletComposable.AuthorizeWalletComposable$lambda$0(snapshotState4).getToken());
                                context.sendBroadcast(intent, context.getString(C12774R.string.permission_wallet_authorization_sender));
                                Intent intent2 = new Intent("android.intent.action.VIEW");
                                intent2.setData(Uri.parse("robinhood-wallet://home"));
                                context.startActivity(intent2);
                                activity.finish();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$8$lambda$7(EventLogger eventLogger, Context context, Activity activity) {
                                EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.GOLD_STATUS_NCW_AUTH, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "DISMISS", null, 4, null), null, null, false, 57, null);
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse("robinhood-wallet://"));
                                context.startActivity(intent);
                                activity.finish();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context) {
                                Navigators3.showHelpCenterWebViewFragment(navigator, context, "https://robinhood.com/us/en/support/articles/crypto-gold-month-promotions/");
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer4, 54), composer4, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    composer3 = composer4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    authorizeWalletDuxo4 = authorizeWalletDuxo3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                composer2 = composerStartRestartGroup;
                i4 = i3;
                authorizeWalletDuxo3 = authorizeWalletDuxo2;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                final SnapshotState4<AuthorizeWalletViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(authorizeWalletDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(authorizeWalletDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                context = (Context) composer42.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Object objConsume2 = composer42.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type android.app.Activity");
                activity = (Activity) objConsume2;
                navigator = (Navigator) composer42.consume(LocalNavigator.getLocalNavigator());
                final EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer42, AutoLoggingCompositionLocals4.$stable);
                eventAuthorizeWalletComposable$lambda$1 = AuthorizeWalletComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventAuthorizeWalletComposable$lambda$1 != null) {
                    eventConsumerInvoke3.consume(eventAuthorizeWalletComposable$lambda$1, new Function1() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m12911invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m12911invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            activity.finish();
                        }
                    });
                }
                eventAuthorizeWalletComposable$lambda$12 = AuthorizeWalletComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventAuthorizeWalletComposable$lambda$12 != null) {
                    eventConsumerInvoke2.consume(eventAuthorizeWalletComposable$lambda$12, new Function1() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                            m12912invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m12912invoke(Object it) throws Throwable {
                            Intrinsics.checkNotNullParameter(it, "it");
                            ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, activity, ((AuthorizeWalletDuxo2.Error) eventAuthorizeWalletComposable$lambda$12.getData()).getError(), true, false, 0, null, 56, null);
                        }
                    });
                }
                eventAuthorizeWalletComposable$lambda$13 = AuthorizeWalletComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventAuthorizeWalletComposable$lambda$13 != null) {
                    eventConsumerInvoke.consume(eventAuthorizeWalletComposable$lambda$13, new Function1() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m12913invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m12913invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.startActivity$default(navigator, context, ((AuthorizeWalletDuxo2.NavigateToGoldUpgrade) eventAuthorizeWalletComposable$lambda$13.getData()).getGoldUpgradeIntentKey(), null, false, null, null, 60, null);
                        }
                    });
                }
                Modifier modifier52 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.autoLogEvents$default(modifier52, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.GOLD_STATUS_NCW_AUTH, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), ComposableLambda3.rememberComposableLambda(1384064177, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt.AuthorizeWalletComposable.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i7) {
                        if ((i7 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1384064177, i7, -1, "com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposable.<anonymous> (AuthorizeWalletComposable.kt:96)");
                        }
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(AuthorizeWalletComposable2.INSTANCE.getLambda$192749540$feature_authorize_wallet_externalRelease(), null, ComposableLambda3.rememberComposableLambda(217731344, true, new AnonymousClass1(activity), composer5, 54), null, null, false, false, null, null, 0L, null, composer5, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: AuthorizeWalletComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$4$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ Activity $activity;

                        AnonymousClass1(Activity activity) {
                            this.$activity = activity;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                            invoke(bentoAppBarScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Activity activity) {
                            activity.finish();
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i & 6) == 0) {
                                i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(217731344, i, -1, "com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposable.<anonymous>.<anonymous> (AuthorizeWalletComposable.kt:99)");
                            }
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.$activity);
                            final Activity activity = this.$activity;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$4$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AuthorizeWalletComposable.C127664.AnonymousClass1.invoke$lambda$1$lambda$0(activity);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }
                }, composer42, 54), null, null, null, 0, 0L, 0L, WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, composer42, 6), ComposableLambda3.rememberComposableLambda(-1969295290, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt.AuthorizeWalletComposable.5
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer5, Integer num) {
                        invoke(paddingValues, composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer5, int i7) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i7 |= composer5.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1969295290, i7, -1, "com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposable.<anonymous> (AuthorizeWalletComposable.kt:104)");
                        }
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), false, ComposableLambda3.rememberComposableLambda(1414181233, true, new AnonymousClass1(navigator, context, current22, snapshotState4CollectAsStateWithLifecycle3, activity), composer5, 54), AuthorizeWalletComposable2.INSTANCE.getLambda$767616094$feature_authorize_wallet_externalRelease(), composer5, 3456, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: AuthorizeWalletComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$5$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ Activity $activity;
                        final /* synthetic */ Context $context;
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ Navigator $navigator;
                        final /* synthetic */ SnapshotState4<AuthorizeWalletViewState> $viewState$delegate;

                        AnonymousClass1(Navigator navigator, Context context, EventLogger eventLogger, SnapshotState4<AuthorizeWalletViewState> snapshotState4, Activity activity) {
                            this.$navigator = navigator;
                            this.$context = context;
                            this.$eventLogger = eventLogger;
                            this.$viewState$delegate = snapshotState4;
                            this.$activity = activity;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1414181233, i, -1, "com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposable.<anonymous>.<anonymous> (AuthorizeWalletComposable.kt:141)");
                            }
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Screen.Name name = Screen.Name.GOLD_STATUS_NCW_AUTH;
                            Screen screen = new Screen(name, null, null, null, 14, null);
                            Component.ComponentType componentType = Component.ComponentType.BUTTON;
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ModifiersKt.autoLogEvents$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, new UserInteractionEventDescriptor(null, screen, null, null, new Component(componentType, "CONTINUE", null, 4, null), null, 45, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), null, null, new Component(componentType, "DISMISS", null, 4, null), null, 45, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                            boolean z = !AuthorizeWalletComposable.AuthorizeWalletComposable$lambda$0(this.$viewState$delegate).getLoading();
                            String strStringResource = StringResources_androidKt.stringResource(C12774R.string.authorize_wallet_primary_cta, composer, 0);
                            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.LINK_OUT_16;
                            BentoButtons.Icon.Position position = BentoButtons.Icon.Position.Trailing;
                            BentoButtons.Icon.Size16 size16 = new BentoButtons.Icon.Size16(serverToBentoAssetMapper2, position);
                            boolean z2 = !AuthorizeWalletComposable.AuthorizeWalletComposable$lambda$0(this.$viewState$delegate).getLoading();
                            String strStringResource2 = StringResources_androidKt.stringResource(C12774R.string.authorize_wallet_secondary_cta, composer, 0);
                            BentoButtons.Icon.Size16 size162 = new BentoButtons.Icon.Size16(serverToBentoAssetMapper2, position);
                            String strStringResource3 = StringResources_androidKt.stringResource(C12774R.string.gated_gold_authorize_wallet_disclaimer, composer, 0);
                            String strStringResource4 = StringResources_androidKt.stringResource(C12774R.string.gated_gold_authorize_wallet_disclaimer_learn_more, composer, 0);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$5$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AuthorizeWalletComposable.C127675.AnonymousClass1.invoke$lambda$1$lambda$0(navigator, context);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$context) | composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$activity);
                            final EventLogger eventLogger = this.$eventLogger;
                            final Context context2 = this.$context;
                            final Activity activity = this.$activity;
                            final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$5$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AuthorizeWalletComposable.C127675.AnonymousClass1.invoke$lambda$5$lambda$4(eventLogger, context2, activity, snapshotState4);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Function0 function02 = (Function0) objRememberedValue2;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1746271574);
                            boolean zChangedInstance3 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$context) | composer.changedInstance(this.$activity);
                            final EventLogger eventLogger2 = this.$eventLogger;
                            final Context context3 = this.$context;
                            final Activity activity2 = this.$activity;
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$5$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AuthorizeWalletComposable.C127675.AnonymousClass1.invoke$lambda$8$lambda$7(eventLogger2, context3, activity2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            int i2 = BentoButtons.Icon.Size16.$stable;
                            BentoButtonBar2.BentoButtonBar(modifierAutoLogEvents$default, strStringResource3, strStringResource4, false, function0, null, function02, strStringResource, false, size16, z, (Function0) objRememberedValue3, strStringResource2, false, size162, z2, composer, i2 << 27, i2 << 12, 8488);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4(EventLogger eventLogger, Context context, Activity activity, SnapshotState4 snapshotState4) {
                            EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.GOLD_STATUS_NCW_AUTH, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "CONTINUE", null, 4, null), null, null, false, 57, null);
                            Intent intent = new Intent("com.robinhood.wallet.AUTHORIZE_WALLET");
                            intent.putExtra("token", AuthorizeWalletComposable.AuthorizeWalletComposable$lambda$0(snapshotState4).getToken());
                            context.sendBroadcast(intent, context.getString(C12774R.string.permission_wallet_authorization_sender));
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            intent2.setData(Uri.parse("robinhood-wallet://home"));
                            context.startActivity(intent2);
                            activity.finish();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$8$lambda$7(EventLogger eventLogger, Context context, Activity activity) {
                            EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.GOLD_STATUS_NCW_AUTH, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "DISMISS", null, 4, null), null, null, false, 57, null);
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse("robinhood-wallet://"));
                            context.startActivity(intent);
                            activity.finish();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context) {
                            Navigators3.showHelpCenterWebViewFragment(navigator, context, "https://robinhood.com/us/en/support/articles/crypto-gold-month-promotions/");
                            return Unit.INSTANCE;
                        }
                    }
                }, composer42, 54), composer42, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                composer3 = composer42;
                if (ComposerKt.isTraceInProgress()) {
                }
                authorizeWalletDuxo4 = authorizeWalletDuxo3;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                authorizeWalletDuxo4 = authorizeWalletDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AuthorizeWalletComposable.AuthorizeWalletComposable$lambda$5(deviceId, modifier4, authorizeWalletDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                    composer2 = composerStartRestartGroup;
                    i4 = i3;
                    authorizeWalletDuxo3 = authorizeWalletDuxo2;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer422 = composer2;
                final SnapshotState4<AuthorizeWalletViewState> snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(authorizeWalletDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer422, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(authorizeWalletDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer422, 0, 7);
                context = (Context) composer422.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Object objConsume22 = composer422.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume22, "null cannot be cast to non-null type android.app.Activity");
                activity = (Activity) objConsume22;
                navigator = (Navigator) composer422.consume(LocalNavigator.getLocalNavigator());
                final EventLogger current222 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer422, AutoLoggingCompositionLocals4.$stable);
                eventAuthorizeWalletComposable$lambda$1 = AuthorizeWalletComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventAuthorizeWalletComposable$lambda$1 != null) {
                }
                eventAuthorizeWalletComposable$lambda$12 = AuthorizeWalletComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventAuthorizeWalletComposable$lambda$12 != null) {
                }
                eventAuthorizeWalletComposable$lambda$13 = AuthorizeWalletComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventAuthorizeWalletComposable$lambda$13 != null) {
                }
                Modifier modifier522 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.autoLogEvents$default(modifier522, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.GOLD_STATUS_NCW_AUTH, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), ComposableLambda3.rememberComposableLambda(1384064177, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt.AuthorizeWalletComposable.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i7) {
                        if ((i7 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1384064177, i7, -1, "com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposable.<anonymous> (AuthorizeWalletComposable.kt:96)");
                        }
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(AuthorizeWalletComposable2.INSTANCE.getLambda$192749540$feature_authorize_wallet_externalRelease(), null, ComposableLambda3.rememberComposableLambda(217731344, true, new AnonymousClass1(activity), composer5, 54), null, null, false, false, null, null, 0L, null, composer5, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: AuthorizeWalletComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$4$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ Activity $activity;

                        AnonymousClass1(Activity activity) {
                            this.$activity = activity;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                            invoke(bentoAppBarScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Activity activity) {
                            activity.finish();
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i & 6) == 0) {
                                i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(217731344, i, -1, "com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposable.<anonymous>.<anonymous> (AuthorizeWalletComposable.kt:99)");
                            }
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.$activity);
                            final Activity activity = this.$activity;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$4$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AuthorizeWalletComposable.C127664.AnonymousClass1.invoke$lambda$1$lambda$0(activity);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }
                }, composer422, 54), null, null, null, 0, 0L, 0L, WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, composer422, 6), ComposableLambda3.rememberComposableLambda(-1969295290, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt.AuthorizeWalletComposable.5
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer5, Integer num) {
                        invoke(paddingValues, composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer5, int i7) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i7 |= composer5.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1969295290, i7, -1, "com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposable.<anonymous> (AuthorizeWalletComposable.kt:104)");
                        }
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), false, ComposableLambda3.rememberComposableLambda(1414181233, true, new AnonymousClass1(navigator, context, current222, snapshotState4CollectAsStateWithLifecycle32, activity), composer5, 54), AuthorizeWalletComposable2.INSTANCE.getLambda$767616094$feature_authorize_wallet_externalRelease(), composer5, 3456, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: AuthorizeWalletComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$5$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ Activity $activity;
                        final /* synthetic */ Context $context;
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ Navigator $navigator;
                        final /* synthetic */ SnapshotState4<AuthorizeWalletViewState> $viewState$delegate;

                        AnonymousClass1(Navigator navigator, Context context, EventLogger eventLogger, SnapshotState4<AuthorizeWalletViewState> snapshotState4, Activity activity) {
                            this.$navigator = navigator;
                            this.$context = context;
                            this.$eventLogger = eventLogger;
                            this.$viewState$delegate = snapshotState4;
                            this.$activity = activity;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1414181233, i, -1, "com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposable.<anonymous>.<anonymous> (AuthorizeWalletComposable.kt:141)");
                            }
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Screen.Name name = Screen.Name.GOLD_STATUS_NCW_AUTH;
                            Screen screen = new Screen(name, null, null, null, 14, null);
                            Component.ComponentType componentType = Component.ComponentType.BUTTON;
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ModifiersKt.autoLogEvents$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, new UserInteractionEventDescriptor(null, screen, null, null, new Component(componentType, "CONTINUE", null, 4, null), null, 45, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), null, null, new Component(componentType, "DISMISS", null, 4, null), null, 45, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                            boolean z = !AuthorizeWalletComposable.AuthorizeWalletComposable$lambda$0(this.$viewState$delegate).getLoading();
                            String strStringResource = StringResources_androidKt.stringResource(C12774R.string.authorize_wallet_primary_cta, composer, 0);
                            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.LINK_OUT_16;
                            BentoButtons.Icon.Position position = BentoButtons.Icon.Position.Trailing;
                            BentoButtons.Icon.Size16 size16 = new BentoButtons.Icon.Size16(serverToBentoAssetMapper2, position);
                            boolean z2 = !AuthorizeWalletComposable.AuthorizeWalletComposable$lambda$0(this.$viewState$delegate).getLoading();
                            String strStringResource2 = StringResources_androidKt.stringResource(C12774R.string.authorize_wallet_secondary_cta, composer, 0);
                            BentoButtons.Icon.Size16 size162 = new BentoButtons.Icon.Size16(serverToBentoAssetMapper2, position);
                            String strStringResource3 = StringResources_androidKt.stringResource(C12774R.string.gated_gold_authorize_wallet_disclaimer, composer, 0);
                            String strStringResource4 = StringResources_androidKt.stringResource(C12774R.string.gated_gold_authorize_wallet_disclaimer_learn_more, composer, 0);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$5$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AuthorizeWalletComposable.C127675.AnonymousClass1.invoke$lambda$1$lambda$0(navigator, context);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$context) | composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$activity);
                            final EventLogger eventLogger = this.$eventLogger;
                            final Context context2 = this.$context;
                            final Activity activity = this.$activity;
                            final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$5$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AuthorizeWalletComposable.C127675.AnonymousClass1.invoke$lambda$5$lambda$4(eventLogger, context2, activity, snapshotState4);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Function0 function02 = (Function0) objRememberedValue2;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1746271574);
                            boolean zChangedInstance3 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$context) | composer.changedInstance(this.$activity);
                            final EventLogger eventLogger2 = this.$eventLogger;
                            final Context context3 = this.$context;
                            final Activity activity2 = this.$activity;
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletComposableKt$AuthorizeWalletComposable$5$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AuthorizeWalletComposable.C127675.AnonymousClass1.invoke$lambda$8$lambda$7(eventLogger2, context3, activity2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            int i2 = BentoButtons.Icon.Size16.$stable;
                            BentoButtonBar2.BentoButtonBar(modifierAutoLogEvents$default, strStringResource3, strStringResource4, false, function0, null, function02, strStringResource, false, size16, z, (Function0) objRememberedValue3, strStringResource2, false, size162, z2, composer, i2 << 27, i2 << 12, 8488);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4(EventLogger eventLogger, Context context, Activity activity, SnapshotState4 snapshotState4) {
                            EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.GOLD_STATUS_NCW_AUTH, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "CONTINUE", null, 4, null), null, null, false, 57, null);
                            Intent intent = new Intent("com.robinhood.wallet.AUTHORIZE_WALLET");
                            intent.putExtra("token", AuthorizeWalletComposable.AuthorizeWalletComposable$lambda$0(snapshotState4).getToken());
                            context.sendBroadcast(intent, context.getString(C12774R.string.permission_wallet_authorization_sender));
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            intent2.setData(Uri.parse("robinhood-wallet://home"));
                            context.startActivity(intent2);
                            activity.finish();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$8$lambda$7(EventLogger eventLogger, Context context, Activity activity) {
                            EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.GOLD_STATUS_NCW_AUTH, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "DISMISS", null, 4, null), null, null, false, 57, null);
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse("robinhood-wallet://"));
                            context.startActivity(intent);
                            activity.finish();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context) {
                            Navigators3.showHelpCenterWebViewFragment(navigator, context, "https://robinhood.com/us/en/support/articles/crypto-gold-month-promotions/");
                            return Unit.INSTANCE;
                        }
                    }
                }, composer422, 54), composer422, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                composer3 = composer422;
                if (ComposerKt.isTraceInProgress()) {
                }
                authorizeWalletDuxo4 = authorizeWalletDuxo3;
                modifier4 = modifier522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthorizeWalletViewState AuthorizeWalletComposable$lambda$0(SnapshotState4<AuthorizeWalletViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<AuthorizeWalletDuxo2> AuthorizeWalletComposable$lambda$1(SnapshotState4<Event<AuthorizeWalletDuxo2>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
