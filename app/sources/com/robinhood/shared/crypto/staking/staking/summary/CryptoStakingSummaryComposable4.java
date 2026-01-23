package com.robinhood.shared.crypto.staking.staking.summary;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material3.ScaffoldDefaults;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.view.compose.LocalActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.Tabbed;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import com.robinhood.shared.crypto.staking.staking.C37760R;
import com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposable4;
import com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryViewState;
import com.robinhood.shared.staking.contracts.CryptoStakingIntentKey;
import com.robinhood.shared.staking.contracts.CryptoStakingSummaryFragmentKey;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.UUID;
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
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoStakingSummaryComposable.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a-\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0012\u001a-\u0010\u0013\u001a\u00020\u00012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u00152\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0018\u001a)\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u001e¨\u0006\u001f²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, m3636d2 = {"TraderStakingSummaryComposable", "", "onBackPressed", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryDuxo;Landroidx/compose/runtime/Composer;II)V", "TopBarAction", "state", "Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "(Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState;Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryDuxo;Landroidx/compose/runtime/Composer;I)V", "Content", "(Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InfoRows", "infoRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Footer", "currencyPairId", "Ljava/util/UUID;", "footerState", "Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$FooterState;", "(Ljava/util/UUID;Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$FooterState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-staking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoStakingSummaryComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$7(CryptoStakingSummaryViewState cryptoStakingSummaryViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Content(cryptoStakingSummaryViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Footer$lambda$19(UUID uuid, CryptoStakingSummaryViewState.FooterState footerState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Footer(uuid, footerState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Footer$lambda$9(UUID uuid, CryptoStakingSummaryViewState.FooterState footerState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Footer(uuid, footerState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoRows$lambda$8(ImmutableList immutableList, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InfoRows(immutableList, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopBarAction$lambda$5(CryptoStakingSummaryViewState cryptoStakingSummaryViewState, Navigator navigator, Context context, CryptoStakingSummaryDuxo cryptoStakingSummaryDuxo, int i, Composer composer, int i2) {
        TopBarAction(cryptoStakingSummaryViewState, navigator, context, cryptoStakingSummaryDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TraderStakingSummaryComposable$lambda$1(Function0 function0, Modifier modifier, CryptoStakingSummaryDuxo cryptoStakingSummaryDuxo, int i, int i2, Composer composer, int i3) {
        TraderStakingSummaryComposable(function0, modifier, cryptoStakingSummaryDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TraderStakingSummaryComposable(final Function0<Unit> onBackPressed, Modifier modifier, CryptoStakingSummaryDuxo cryptoStakingSummaryDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoStakingSummaryDuxo cryptoStakingSummaryDuxo2;
        final Modifier modifier3;
        final CryptoStakingSummaryDuxo cryptoStakingSummaryDuxo3;
        final Modifier modifier4;
        final CryptoStakingSummaryDuxo cryptoStakingSummaryDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(638787301);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackPressed) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    cryptoStakingSummaryDuxo2 = cryptoStakingSummaryDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(cryptoStakingSummaryDuxo2) ? 256 : 128;
                    i3 |= i5;
                } else {
                    cryptoStakingSummaryDuxo2 = cryptoStakingSummaryDuxo;
                }
                i3 |= i5;
            } else {
                cryptoStakingSummaryDuxo2 = cryptoStakingSummaryDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoStakingSummaryDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt$TraderStakingSummaryComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt$TraderStakingSummaryComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        cryptoStakingSummaryDuxo3 = (CryptoStakingSummaryDuxo) baseDuxo;
                        i3 &= -897;
                        modifier3 = modifier5;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(638787301, i3, -1, "com.robinhood.shared.crypto.staking.staking.summary.TraderStakingSummaryComposable (CryptoStakingSummaryComposable.kt:68)");
                        }
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingSummaryDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        boolean z = composerStartRestartGroup.consume(LocalActivity.getLocalActivity()) instanceof Tabbed;
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                        composerStartRestartGroup.startReplaceGroup(-305712289);
                        WindowInsets windowInsetsWindowInsets$default = !z ? WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null) : ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, ScaffoldDefaults.$stable);
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer2 = composerStartRestartGroup;
                        Modifier modifier6 = modifier3;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, ComposableLambda3.rememberComposableLambda(-124880223, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt.TraderStakingSummaryComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-124880223, i6, -1, "com.robinhood.shared.crypto.staking.staking.summary.TraderStakingSummaryComposable.<anonymous> (CryptoStakingSummaryComposable.kt:82)");
                                }
                                Function2<Composer, Integer, Unit> lambda$2074791124$feature_crypto_staking_externalDebug = CryptoStakingSummaryComposable.INSTANCE.getLambda$2074791124$feature_crypto_staking_externalDebug();
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(221395456, true, new AnonymousClass1(onBackPressed), composer3, 54);
                                final Navigator navigator2 = navigator;
                                final Context context2 = context;
                                final CryptoStakingSummaryDuxo cryptoStakingSummaryDuxo5 = cryptoStakingSummaryDuxo3;
                                final SnapshotState4<CryptoStakingSummaryViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$2074791124$feature_crypto_staking_externalDebug, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-339161793, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt.TraderStakingSummaryComposable.1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer4, Integer num) {
                                        invoke(row5, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Row5 BentoAppBar, Composer composer4, int i7) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-339161793, i7, -1, "com.robinhood.shared.crypto.staking.staking.summary.TraderStakingSummaryComposable.<anonymous>.<anonymous> (CryptoStakingSummaryComposable.kt:85)");
                                        }
                                        CryptoStakingSummaryComposable4.TopBarAction(CryptoStakingSummaryComposable4.TraderStakingSummaryComposable$lambda$0(snapshotState4), navigator2, context2, cryptoStakingSummaryDuxo5, composer4, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), null, false, false, null, null, 0L, null, composer3, 3462, 0, 2034);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: CryptoStakingSummaryComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt$TraderStakingSummaryComposable$1$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                final /* synthetic */ Function0<Unit> $onBackPressed;

                                AnonymousClass1(Function0<Unit> function0) {
                                    this.$onBackPressed = function0;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                    invoke(bentoAppBarScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                                    function0.invoke();
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
                                        ComposerKt.traceEventStart(221395456, i, -1, "com.robinhood.shared.crypto.staking.staking.summary.TraderStakingSummaryComposable.<anonymous>.<anonymous> (CryptoStakingSummaryComposable.kt:88)");
                                    }
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(this.$onBackPressed);
                                    final Function0<Unit> function0 = this.$onBackPressed;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt$TraderStakingSummaryComposable$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoStakingSummaryComposable4.C378951.AnonymousClass1.invoke$lambda$1$lambda$0(function0);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, windowInsetsWindowInsets$default, ComposableLambda3.rememberComposableLambda(-1059449034, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt.TraderStakingSummaryComposable.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues innerPadding, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                                if ((i6 & 6) == 0) {
                                    i6 |= composer3.changed(innerPadding) ? 4 : 2;
                                }
                                if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1059449034, i6, -1, "com.robinhood.shared.crypto.staking.staking.summary.TraderStakingSummaryComposable.<anonymous> (CryptoStakingSummaryComposable.kt:93)");
                                }
                                CryptoStakingSummaryComposable4.Content(CryptoStakingSummaryComposable4.TraderStakingSummaryComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle), PaddingKt.padding(modifier3, innerPadding), composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        composerStartRestartGroup = composer2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier6;
                        cryptoStakingSummaryDuxo4 = cryptoStakingSummaryDuxo3;
                    } else {
                        modifier3 = modifier5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                cryptoStakingSummaryDuxo3 = cryptoStakingSummaryDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<CryptoStakingSummaryViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingSummaryDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                boolean z2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity()) instanceof Tabbed;
                Modifier modifierLogScreenTransitions$default2 = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                composerStartRestartGroup.startReplaceGroup(-305712289);
                WindowInsets windowInsetsWindowInsets$default2 = !z2 ? WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null) : ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, ScaffoldDefaults.$stable);
                composerStartRestartGroup.endReplaceGroup();
                Composer composer22 = composerStartRestartGroup;
                Modifier modifier62 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default2, ComposableLambda3.rememberComposableLambda(-124880223, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt.TraderStakingSummaryComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-124880223, i6, -1, "com.robinhood.shared.crypto.staking.staking.summary.TraderStakingSummaryComposable.<anonymous> (CryptoStakingSummaryComposable.kt:82)");
                        }
                        Function2<Composer, Integer, Unit> lambda$2074791124$feature_crypto_staking_externalDebug = CryptoStakingSummaryComposable.INSTANCE.getLambda$2074791124$feature_crypto_staking_externalDebug();
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(221395456, true, new AnonymousClass1(onBackPressed), composer3, 54);
                        final Navigator navigator22 = navigator2;
                        final Context context22 = context2;
                        final CryptoStakingSummaryDuxo cryptoStakingSummaryDuxo5 = cryptoStakingSummaryDuxo3;
                        final SnapshotState4<CryptoStakingSummaryViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$2074791124$feature_crypto_staking_externalDebug, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-339161793, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt.TraderStakingSummaryComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer4, Integer num) {
                                invoke(row5, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 BentoAppBar, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-339161793, i7, -1, "com.robinhood.shared.crypto.staking.staking.summary.TraderStakingSummaryComposable.<anonymous>.<anonymous> (CryptoStakingSummaryComposable.kt:85)");
                                }
                                CryptoStakingSummaryComposable4.TopBarAction(CryptoStakingSummaryComposable4.TraderStakingSummaryComposable$lambda$0(snapshotState4), navigator22, context22, cryptoStakingSummaryDuxo5, composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, false, false, null, null, 0L, null, composer3, 3462, 0, 2034);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: CryptoStakingSummaryComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt$TraderStakingSummaryComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $onBackPressed;

                        AnonymousClass1(Function0<Unit> function0) {
                            this.$onBackPressed = function0;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                            invoke(bentoAppBarScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                            function0.invoke();
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
                                ComposerKt.traceEventStart(221395456, i, -1, "com.robinhood.shared.crypto.staking.staking.summary.TraderStakingSummaryComposable.<anonymous>.<anonymous> (CryptoStakingSummaryComposable.kt:88)");
                            }
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$onBackPressed);
                            final Function0 function0 = this.$onBackPressed;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt$TraderStakingSummaryComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoStakingSummaryComposable4.C378951.AnonymousClass1.invoke$lambda$1$lambda$0(function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, windowInsetsWindowInsets$default2, ComposableLambda3.rememberComposableLambda(-1059449034, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt.TraderStakingSummaryComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues innerPadding, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                        if ((i6 & 6) == 0) {
                            i6 |= composer3.changed(innerPadding) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1059449034, i6, -1, "com.robinhood.shared.crypto.staking.staking.summary.TraderStakingSummaryComposable.<anonymous> (CryptoStakingSummaryComposable.kt:93)");
                        }
                        CryptoStakingSummaryComposable4.Content(CryptoStakingSummaryComposable4.TraderStakingSummaryComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2), PaddingKt.padding(modifier3, innerPadding), composer3, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer22, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                composerStartRestartGroup = composer22;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier62;
                cryptoStakingSummaryDuxo4 = cryptoStakingSummaryDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoStakingSummaryDuxo4 = cryptoStakingSummaryDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoStakingSummaryComposable4.TraderStakingSummaryComposable$lambda$1(onBackPressed, modifier4, cryptoStakingSummaryDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i4 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoStakingSummaryViewState TraderStakingSummaryComposable$lambda$0(SnapshotState4<CryptoStakingSummaryViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TopBarAction(final CryptoStakingSummaryViewState cryptoStakingSummaryViewState, final Navigator navigator, final Context context, final CryptoStakingSummaryDuxo cryptoStakingSummaryDuxo, Composer composer, final int i) {
        CryptoStakingSummaryViewState cryptoStakingSummaryViewState2;
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1768521860);
        if ((i & 6) == 0) {
            cryptoStakingSummaryViewState2 = cryptoStakingSummaryViewState;
            i2 = (composerStartRestartGroup.changedInstance(cryptoStakingSummaryViewState2) ? 4 : 2) | i;
        } else {
            cryptoStakingSummaryViewState2 = cryptoStakingSummaryViewState;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(navigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(context) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(cryptoStakingSummaryDuxo) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1768521860, i2, -1, "com.robinhood.shared.crypto.staking.staking.summary.TopBarAction (CryptoStakingSummaryComposable.kt:107)");
            }
            StringResource actionLabel = cryptoStakingSummaryViewState2.getActionLabel();
            if (actionLabel == null) {
                composer2 = composerStartRestartGroup;
            } else {
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 11, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(cryptoStakingSummaryDuxo);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoStakingSummaryComposable4.TopBarAction$lambda$4$lambda$3$lambda$2(navigator, context, cryptoStakingSummaryDuxo);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(StringResources6.getText(actionLabel, composerStartRestartGroup, StringResource.$stable).toString(), ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null), null, null, FontWeight.INSTANCE.getW700(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composer2, 24576, 0, 8172);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingSummaryComposable4.TopBarAction$lambda$5(cryptoStakingSummaryViewState, navigator, context, cryptoStakingSummaryDuxo, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopBarAction$lambda$4$lambda$3$lambda$2(Navigator navigator, Context context, CryptoStakingSummaryDuxo cryptoStakingSummaryDuxo) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new CryptoDetailFragmentKey(((CryptoStakingSummaryFragmentKey) CryptoStakingSummaryDuxo.INSTANCE.getArgs((HasSavedState) cryptoStakingSummaryDuxo)).getCurrencyPairId(), null, true, null, null, null, 58, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Content(final CryptoStakingSummaryViewState cryptoStakingSummaryViewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        CryptoStakingContext loggingContext;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-85105440);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(cryptoStakingSummaryViewState) ? 4 : 2) | i;
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
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-85105440, i3, -1, "com.robinhood.shared.crypto.staking.staking.summary.Content (CryptoStakingSummaryComposable.kt:132)");
                }
                composerStartRestartGroup.startReplaceGroup(-181941884);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                loggingContext = cryptoStakingSummaryViewState.getLoggingContext();
                if (loggingContext == null) {
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierFillMaxSize$default, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, loggingContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -536870913, -1, 16383, null), new Component(null, "page", null, 5, null), null, 39, null)), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                    Modifier modifier4 = modifierAutoLogEvents$default == null ? modifierFillMaxSize$default : modifierAutoLogEvents$default;
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier4, false, ComposableLambda3.rememberComposableLambda(-1942303083, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt.Content.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                            invoke(bentoButtonBar3, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i5 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1942303083, i5, -1, "com.robinhood.shared.crypto.staking.staking.summary.Content.<anonymous> (CryptoStakingSummaryComposable.kt:180)");
                            }
                            CryptoStakingSummaryComposable4.Footer(cryptoStakingSummaryViewState.getCurrencyPairId(), cryptoStakingSummaryViewState.getFooterState(), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1948483528, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt.Content.3
                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i5) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i5 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1948483528, i5, -1, "com.robinhood.shared.crypto.staking.staking.summary.Content.<anonymous> (CryptoStakingSummaryComposable.kt:148)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                            final CryptoStakingSummaryViewState cryptoStakingSummaryViewState2 = cryptoStakingSummaryViewState;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
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
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM()), composer2, 0);
                            LocalShowPlaceholder.Loadable(cryptoStakingSummaryViewState2.isCurrencyPairLoading(), null, null, ComposableLambda3.rememberComposableLambda(615757134, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt$Content$3$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i7) {
                                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(615757134, i7, -1, "com.robinhood.shared.crypto.staking.staking.summary.Content.<anonymous>.<anonymous>.<anonymous> (CryptoStakingSummaryComposable.kt:156)");
                                    }
                                    StringResource title = cryptoStakingSummaryViewState2.getTitle();
                                    if (title != null) {
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i8 = BentoTheme.$stable;
                                        BentoText2.m20747BentoText38GnDrw(StringResources6.getText(title, composer3, StringResource.$stable).toString(), PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme2.getSpacing(composer3, i8).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i8).getDisplayCapsuleLarge(), composer3, 0, 0, 8188);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 3072, 6);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i6).m21591getLargeD9Ej5fM()), composer2, 0);
                            StakingSummaryChart4.StakingSummaryChart(cryptoStakingSummaryViewState2.getChartState(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composer2, 48, 0);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i6).m21594getXlargeD9Ej5fM()), composer2, 0);
                            CryptoStakingSummaryComposable4.InfoRows(cryptoStakingSummaryViewState2.getInfoRows(), null, composer2, 0, 2);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                            invoke(boxScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 3504, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoStakingSummaryComposable4.Content$lambda$7(cryptoStakingSummaryViewState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startReplaceGroup(-181941884);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            loggingContext = cryptoStakingSummaryViewState.getLoggingContext();
            if (loggingContext == null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InfoRows(final ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(888470866);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(888470866, i3, -1, "com.robinhood.shared.crypto.staking.staking.summary.InfoRows (CryptoStakingSummaryComposable.kt:194)");
            }
            if (immutableList == null) {
                composerStartRestartGroup.startReplaceGroup(-1447700253);
                LocalShowPlaceholder.Loadable(true, null, null, CryptoStakingSummaryComposable.INSTANCE.getLambda$1069140605$feature_crypto_staking_externalDebug(), composerStartRestartGroup, 3078, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1447061746);
                GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(559779108, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt.InfoRows.1
                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(559779108, i5, -1, "com.robinhood.shared.crypto.staking.staking.summary.InfoRows.<anonymous> (CryptoStakingSummaryComposable.kt:215)");
                        }
                        ImmutableList<UIComponent<GenericAction>> immutableList2 = immutableList;
                        Modifier modifier2 = modifier;
                        composer2.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(immutableList2, GenericAction.class, modifier2, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 0, 0);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 15);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingSummaryComposable4.InfoRows$lambda$8(immutableList, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Footer(final UUID uuid, final CryptoStakingSummaryViewState.FooterState footerState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Composer composer2;
        Modifier.Companion companion;
        Modifier modifier3;
        Navigator navigator;
        int i5;
        Context context;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1491566491);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(uuid) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(footerState) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1491566491, i3, -1, "com.robinhood.shared.crypto.staking.staking.summary.Footer (CryptoStakingSummaryComposable.kt:228)");
                }
                if (footerState != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final Modifier modifier6 = modifier5;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoStakingSummaryComposable4.Footer$lambda$9(uuid, footerState, modifier6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifier7 = modifier5;
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier7);
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
                String disclosure = footerState.getDisclosure();
                composerStartRestartGroup.startReplaceGroup(802305213);
                if (disclosure == null) {
                    composer2 = composerStartRestartGroup;
                    i4 = 0;
                } else {
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                    TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS();
                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU();
                    long jM21426getFg20d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU();
                    i4 = 0;
                    MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(textS, TextAlign.INSTANCE.m7919getCentere0LSkKk(), jM21426getFg20d7_KjU, jM21426getFg20d7_KjU2, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 16);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(context2);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoStakingSummaryComposable4.Footer$lambda$18$lambda$12$lambda$11$lambda$10(context2, (String) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    BentoMarkdownText2.BentoMarkdownText(disclosure, modifierM5146paddingqDBjuR0$default, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composer2, (MarkdownStyle.$stable << 6) | 3072, 0);
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                Modifier.Companion companion5 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion5, 0.0f, bentoTheme2.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM(), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.Absolute.INSTANCE.m5092spacedBy0680j_4(bentoTheme2.getSpacing(composer2, i8).m21593getSmallD9Ej5fM()), companion2.getTop(), composer2, i4);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, i4);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                composer2.startReplaceGroup(648248153);
                if (footerState.getStakeButtonVisible()) {
                    companion = companion5;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "stake", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                    boolean stakeButtonEnabled = footerState.getStakeButtonEnabled();
                    String strStringResource = StringResources_androidKt.stringResource(C37760R.string.staking_summary_cta_stake, composer2, i4);
                    composer2.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = composer2.changedInstance(navigator2) | composer2.changedInstance(context2) | composer2.changedInstance(uuid);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoStakingSummaryComposable4.Footer$lambda$18$lambda$17$lambda$14$lambda$13(navigator2, context2, uuid);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    int i9 = i4;
                    composerStartRestartGroup = composer2;
                    i5 = i9;
                    navigator = navigator2;
                    context = context2;
                    modifier3 = modifier7;
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource, modifierAutoLogEvents$default, null, null, stakeButtonEnabled, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8152);
                } else {
                    companion = companion5;
                    modifier3 = modifier7;
                    navigator = navigator2;
                    i5 = i4;
                    context = context2;
                    composerStartRestartGroup = composer2;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(648292354);
                if (footerState.getUnstakeButtonVisible()) {
                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "unstake", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                    boolean unstakeButtonEnabled = footerState.getUnstakeButtonEnabled();
                    String strStringResource2 = StringResources_androidKt.stringResource(C37760R.string.staking_summary_cta_unstake, composerStartRestartGroup, i5);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    final Navigator navigator3 = navigator;
                    final Context context3 = context;
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(navigator3) | composerStartRestartGroup.changedInstance(context3) | composerStartRestartGroup.changedInstance(uuid);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoStakingSummaryComposable4.Footer$lambda$18$lambda$17$lambda$16$lambda$15(navigator3, context3, uuid);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, strStringResource2, modifierAutoLogEvents$default2, null, null, unstakeButtonEnabled, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8152);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryComposableKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoStakingSummaryComposable4.Footer$lambda$19(uuid, footerState, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (footerState != null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Footer$lambda$18$lambda$12$lambda$11$lambda$10(Context context, String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        WebUtils.viewUrl$default(context, uri, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Footer$lambda$18$lambda$17$lambda$14$lambda$13(Navigator navigator, Context context, UUID uuid) {
        Navigator.DefaultImpls.startActivity$default(navigator, context, new CryptoStakingIntentKey(uuid, CryptoStakingIntentKey.OrderType.DEPOSIT, false, null, null, null, 60, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Footer$lambda$18$lambda$17$lambda$16$lambda$15(Navigator navigator, Context context, UUID uuid) {
        Navigator.DefaultImpls.startActivity$default(navigator, context, new CryptoStakingIntentKey(uuid, CryptoStakingIntentKey.OrderType.WITHDRAW, false, null, null, null, 60, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }
}
