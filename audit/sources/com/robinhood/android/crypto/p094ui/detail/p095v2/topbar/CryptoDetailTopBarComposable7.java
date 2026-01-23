package com.robinhood.android.crypto.p094ui.detail.p095v2.topbar;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.crypto.p094ui.detail.p095v2.topbar.CryptoDetailTopBarAction;
import com.robinhood.android.crypto.p094ui.detail.p095v2.topbar.CryptoDetailTopBarComposable7;
import com.robinhood.android.crypto.p094ui.detail.p095v2.topbar.CryptoDetailTopBarDuxo;
import com.robinhood.android.education.contracts.AdvancedAlert;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.librobinhood.data.store.alert.AdvancedAlertEntryPoint;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.Either2;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoDetailTopBarComposable.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001as\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aK\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001d\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u000f\u0010 \u001a\u00020\bH\u0003¢\u0006\u0004\b \u0010\u001e\u001a\u000f\u0010!\u001a\u00020\bH\u0003¢\u0006\u0004\b!\u0010\u001e\u001a\u000f\u0010\"\u001a\u00020\bH\u0003¢\u0006\u0004\b\"\u0010\u001e¨\u0006#²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, m3636d2 = {"Ljava/util/UUID;", "currencyPairId", "", "showTitle", "", "sduiPriceString", "Lkotlin/Function1;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "", "addToList", "removeFromList", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarDuxo;", "duxo", "Lkotlin/Function0;", "onNavigationIconClick", "CryptoDetailTopBarComposable", "(Ljava/util/UUID;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarDuxo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarViewState;", "viewState", "Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarAction;", "handleAction", "TopBarInternal", "(Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarViewState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "isDay", "content", "PreviewTheme", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PreviewStandard", "(Landroidx/compose/runtime/Composer;I)V", "PreviewLoading", "PreviewSubtitle", "PreviewSubtitleAnimation", "PreviewLongTitle", "feature-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoDetailTopBarComposable7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoDetailTopBarComposable$lambda$4(UUID uuid, boolean z, String str, Function1 function1, Function1 function12, Modifier modifier, CryptoDetailTopBarDuxo cryptoDetailTopBarDuxo, Function0 function0, int i, int i2, Composer composer, int i3) {
        CryptoDetailTopBarComposable(uuid, z, str, function1, function12, modifier, cryptoDetailTopBarDuxo, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoading$lambda$8(int i, Composer composer, int i2) {
        PreviewLoading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLongTitle$lambda$11(int i, Composer composer, int i2) {
        PreviewLongTitle(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewStandard$lambda$7(int i, Composer composer, int i2) {
        PreviewStandard(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSubtitle$lambda$9(int i, Composer composer, int i2) {
        PreviewSubtitle(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSubtitleAnimation$lambda$10(int i, Composer composer, int i2) {
        PreviewSubtitleAnimation(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTheme$lambda$6(boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        PreviewTheme(z, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopBarInternal$lambda$5(CryptoDetailTopBarViewState cryptoDetailTopBarViewState, boolean z, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TopBarInternal(cryptoDetailTopBarViewState, z, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoDetailTopBarComposable(final UUID currencyPairId, final boolean z, final String str, final Function1<? super UiCurrencyPair, Unit> addToList, final Function1<? super UiCurrencyPair, Unit> removeFromList, Modifier modifier, CryptoDetailTopBarDuxo cryptoDetailTopBarDuxo, final Function0<Unit> onNavigationIconClick, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        CryptoDetailTopBarDuxo cryptoDetailTopBarDuxo2;
        Composer composer2;
        boolean z2;
        Modifier modifier3;
        final CryptoDetailTopBarDuxo cryptoDetailTopBarDuxo3;
        final Navigator navigator;
        final Context context;
        final BaseActivity baseActivity;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Composer composer3;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean z3;
        Object objRememberedValue2;
        int i5;
        CryptoDetailTopBarDuxo cryptoDetailTopBarDuxo4;
        final Modifier modifier4;
        final CryptoDetailTopBarDuxo cryptoDetailTopBarDuxo5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(addToList, "addToList");
        Intrinsics.checkNotNullParameter(removeFromList, "removeFromList");
        Intrinsics.checkNotNullParameter(onNavigationIconClick, "onNavigationIconClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(478547441);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(currencyPairId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(addToList) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(removeFromList) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    cryptoDetailTopBarDuxo2 = cryptoDetailTopBarDuxo;
                    i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changedInstance(cryptoDetailTopBarDuxo2)) ? 1048576 : 524288;
                } else {
                    cryptoDetailTopBarDuxo2 = cryptoDetailTopBarDuxo;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onNavigationIconClick) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) == 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer3 = composerStartRestartGroup;
                    cryptoDetailTopBarDuxo5 = cryptoDetailTopBarDuxo2;
                    modifier4 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 64) == 0) {
                            CryptoDetailTopBarDuxo.InitArgs initArgs = new CryptoDetailTopBarDuxo.InitArgs(currencyPairId);
                            composerStartRestartGroup.startReplaceGroup(2050738472);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                            creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoDetailTopBarDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                            composer2 = composerStartRestartGroup;
                            composer2.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt$CryptoDetailTopBarComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt$CryptoDetailTopBarComposable$$inlined$duxo$1.1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                lifecycle2.removeObserver(duxoLifecycleObserver);
                                            }
                                        };
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer2, 0);
                            composer2.endReplaceGroup();
                            i3 &= -3670017;
                            z2 = false;
                            modifier3 = modifier5;
                            cryptoDetailTopBarDuxo3 = (CryptoDetailTopBarDuxo) baseDuxo;
                        } else {
                            composer2 = composerStartRestartGroup;
                            z2 = false;
                            modifier3 = modifier5;
                            cryptoDetailTopBarDuxo3 = cryptoDetailTopBarDuxo2;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        composer2 = composerStartRestartGroup;
                        cryptoDetailTopBarDuxo3 = cryptoDetailTopBarDuxo2;
                        modifier3 = modifier2;
                        z2 = false;
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(478547441, i3, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposable (CryptoDetailTopBarComposable.kt:69)");
                    }
                    navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                    context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Sequence sequenceFilter = SequencesKt.filter(BaseContexts.baseContexts(context), new Function1<Object, Boolean>() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt$CryptoDetailTopBarComposable$$inlined$findActivityTypeBaseContext$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(Object obj) {
                            return Boolean.valueOf(obj instanceof BaseActivity);
                        }
                    });
                    Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
                    AppCompatActivity appCompatActivity = (AppCompatActivity) SequencesKt.firstOrNull(sequenceFilter);
                    Composer composer4 = composer2;
                    baseActivity = !(appCompatActivity instanceof BaseActivity) ? (BaseActivity) appCompatActivity : null;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoDetailTopBarDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                    composer3 = composer4;
                    composer3.startReplaceGroup(-1633490746);
                    zChangedInstance = ((i3 & 896) != 256 ? true : z2) | composer3.changedInstance(cryptoDetailTopBarDuxo3);
                    objRememberedValue = composer3.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new CryptoDetailTopBarComposable8(cryptoDetailTopBarDuxo3, str, null);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, (i3 >> 6) & 14);
                    CryptoDetailTopBarViewState cryptoDetailTopBarViewStateCryptoDetailTopBarComposable$lambda$0 = CryptoDetailTopBarComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    composer3.startReplaceGroup(-1224400529);
                    boolean zChangedInstance3 = ((i3 & 7168) != 2048 ? true : z2) | composer3.changedInstance(baseActivity) | composer3.changedInstance(cryptoDetailTopBarDuxo3) | composer3.changedInstance(currencyPairId) | composer3.changed(snapshotState4CollectAsStateWithLifecycle) | composer3.changedInstance(context) | composer3.changedInstance(navigator);
                    if ((57344 & i3) == 16384) {
                        z2 = true;
                    }
                    z3 = zChangedInstance3 | z2;
                    objRememberedValue2 = composer3.rememberedValue();
                    if (!z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        i5 = i3;
                        Function1 function1 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoDetailTopBarComposable7.CryptoDetailTopBarComposable$lambda$3$lambda$2(baseActivity, cryptoDetailTopBarDuxo3, currencyPairId, context, navigator, addToList, removeFromList, snapshotState4CollectAsStateWithLifecycle, (CryptoDetailTopBarAction) obj);
                            }
                        };
                        cryptoDetailTopBarDuxo4 = cryptoDetailTopBarDuxo3;
                        composer3.updateRememberedValue(function1);
                        objRememberedValue2 = function1;
                    } else {
                        cryptoDetailTopBarDuxo4 = cryptoDetailTopBarDuxo3;
                        i5 = i3;
                    }
                    composer3.endReplaceGroup();
                    Modifier modifier6 = modifier3;
                    TopBarInternal(cryptoDetailTopBarViewStateCryptoDetailTopBarComposable$lambda$0, z, onNavigationIconClick, (Function1) objRememberedValue2, modifier6, composer3, (i5 & 112) | ((i5 >> 15) & 896) | ((i5 >> 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier6;
                    cryptoDetailTopBarDuxo5 = cryptoDetailTopBarDuxo4;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoDetailTopBarComposable7.CryptoDetailTopBarComposable$lambda$4(currencyPairId, z, str, addToList, removeFromList, modifier4, cryptoDetailTopBarDuxo5, onNavigationIconClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((i & 1572864) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((4793491 & i3) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 == 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                    context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Sequence sequenceFilter2 = SequencesKt.filter(BaseContexts.baseContexts(context), new Function1<Object, Boolean>() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt$CryptoDetailTopBarComposable$$inlined$findActivityTypeBaseContext$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(Object obj) {
                            return Boolean.valueOf(obj instanceof BaseActivity);
                        }
                    });
                    Intrinsics.checkNotNull(sequenceFilter2, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
                    AppCompatActivity appCompatActivity2 = (AppCompatActivity) SequencesKt.firstOrNull(sequenceFilter2);
                    Composer composer42 = composer2;
                    baseActivity = !(appCompatActivity2 instanceof BaseActivity) ? (BaseActivity) appCompatActivity2 : null;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoDetailTopBarDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                    composer3 = composer42;
                    composer3.startReplaceGroup(-1633490746);
                    zChangedInstance = ((i3 & 896) != 256 ? true : z2) | composer3.changedInstance(cryptoDetailTopBarDuxo3);
                    objRememberedValue = composer3.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new CryptoDetailTopBarComposable8(cryptoDetailTopBarDuxo3, str, null);
                        composer3.updateRememberedValue(objRememberedValue);
                        composer3.endReplaceGroup();
                        EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, (i3 >> 6) & 14);
                        CryptoDetailTopBarViewState cryptoDetailTopBarViewStateCryptoDetailTopBarComposable$lambda$02 = CryptoDetailTopBarComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        composer3.startReplaceGroup(-1224400529);
                        boolean zChangedInstance32 = ((i3 & 7168) != 2048 ? true : z2) | composer3.changedInstance(baseActivity) | composer3.changedInstance(cryptoDetailTopBarDuxo3) | composer3.changedInstance(currencyPairId) | composer3.changed(snapshotState4CollectAsStateWithLifecycle) | composer3.changedInstance(context) | composer3.changedInstance(navigator);
                        if ((57344 & i3) == 16384) {
                        }
                        z3 = zChangedInstance32 | z2;
                        objRememberedValue2 = composer3.rememberedValue();
                        if (z3) {
                            i5 = i3;
                            Function1 function12 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoDetailTopBarComposable7.CryptoDetailTopBarComposable$lambda$3$lambda$2(baseActivity, cryptoDetailTopBarDuxo3, currencyPairId, context, navigator, addToList, removeFromList, snapshotState4CollectAsStateWithLifecycle, (CryptoDetailTopBarAction) obj);
                                }
                            };
                            cryptoDetailTopBarDuxo4 = cryptoDetailTopBarDuxo3;
                            composer3.updateRememberedValue(function12);
                            objRememberedValue2 = function12;
                            composer3.endReplaceGroup();
                            Modifier modifier62 = modifier3;
                            TopBarInternal(cryptoDetailTopBarViewStateCryptoDetailTopBarComposable$lambda$02, z, onNavigationIconClick, (Function1) objRememberedValue2, modifier62, composer3, (i5 & 112) | ((i5 >> 15) & 896) | ((i5 >> 3) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier62;
                            cryptoDetailTopBarDuxo5 = cryptoDetailTopBarDuxo4;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i & 1572864) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((4793491 & i3) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final CryptoDetailTopBarViewState CryptoDetailTopBarComposable$lambda$0(SnapshotState4<CryptoDetailTopBarViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoDetailTopBarComposable$lambda$3$lambda$2(BaseActivity baseActivity, CryptoDetailTopBarDuxo cryptoDetailTopBarDuxo, UUID uuid, Context context, Navigator navigator, Function1 function1, Function1 function12, SnapshotState4 snapshotState4, CryptoDetailTopBarAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof CryptoDetailTopBarAction.Pip) {
            if (baseActivity == null) {
                return Unit.INSTANCE;
            }
            cryptoDetailTopBarDuxo.getPipSupportStore().launchPipMode(baseActivity, new PictureInPictureKey.Crypto(uuid));
        } else if (Intrinsics.areEqual(action, CryptoDetailTopBarAction.AdvancedAlerts.INSTANCE)) {
            UiCurrencyPair currencyPair = CryptoDetailTopBarComposable$lambda$0(snapshotState4).getCurrencyPair();
            if (currencyPair == null) {
                return Unit.INSTANCE;
            }
            context.startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new AdvancedAlert(Either2.asRight(currencyPair), true, null, AdvancedAlertEntryPoint.CDP_NAV_BAR_BUTTON, 4, null), false, false, false, null, false, false, false, false, false, null, false, 8180, null));
        } else if (action instanceof CryptoDetailTopBarAction.AddToList) {
            UiCurrencyPair currencyPair2 = CryptoDetailTopBarComposable$lambda$0(snapshotState4).getCurrencyPair();
            if (currencyPair2 == null) {
                return Unit.INSTANCE;
            }
            function1.invoke(currencyPair2);
        } else {
            if (!Intrinsics.areEqual(action, CryptoDetailTopBarAction.UpdateList.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            UiCurrencyPair currencyPair3 = CryptoDetailTopBarComposable$lambda$0(snapshotState4).getCurrencyPair();
            if (currencyPair3 == null) {
                return Unit.INSTANCE;
            }
            function12.invoke(currencyPair3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TopBarInternal(final CryptoDetailTopBarViewState cryptoDetailTopBarViewState, final boolean z, final Function0<Unit> function0, final Function1<? super CryptoDetailTopBarAction, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1662838480);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(cryptoDetailTopBarViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1662838480, i3, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.TopBarInternal (CryptoDetailTopBarComposable.kt:134)");
                }
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1698728739, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt.TopBarInternal.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1698728739, i5, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.TopBarInternal.<anonymous> (CryptoDetailTopBarComposable.kt:138)");
                        }
                        boolean z2 = z;
                        EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                        ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
                        final CryptoDetailTopBarViewState cryptoDetailTopBarViewState2 = cryptoDetailTopBarViewState;
                        AnimatedVisibilityKt.AnimatedVisibility(z2, (Modifier) null, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambda3.rememberComposableLambda(1833756155, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt.TopBarInternal.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                invoke(animatedVisibilityScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i6) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1833756155, i6, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.TopBarInternal.<anonymous>.<anonymous> (CryptoDetailTopBarComposable.kt:143)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer4, i7).m21593getSmallD9Ej5fM(), 0.0f, 2, null), C2002Dp.m7995constructorimpl(100), 0.0f, 2, null);
                                CryptoDetailTopBarViewState cryptoDetailTopBarViewState3 = cryptoDetailTopBarViewState2;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM5176widthInVpY3zN4$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                String title = cryptoDetailTopBarViewState3.getTitle();
                                TextStyle textL = bentoTheme.getTypography(composer4, i7).getTextL();
                                TextOverflow.Companion companion3 = TextOverflow.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, null, companion3.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textL, composer4, 817889280, 0, 7550);
                                composer4.startReplaceGroup(563059312);
                                if (cryptoDetailTopBarViewState3.getSubtitle().length() > 0) {
                                    BentoText2.m20747BentoText38GnDrw(cryptoDetailTopBarViewState3.getSubtitle().toString(), null, Color.m6701boximpl(bentoTheme.getColors(composer4, i7).m21426getFg20d7_KjU()), null, null, null, null, companion3.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer4, i7).getTextM(), composer4, 817889280, 0, 7546);
                                }
                                composer4.endReplaceGroup();
                                composer4.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 200064, 18);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), modifier4, ComposableLambda3.rememberComposableLambda(1720053583, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt.TopBarInternal.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                        int i6;
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 6) == 0) {
                            i6 = ((i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2) | i5;
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1720053583, i6, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.TopBarInternal.<anonymous> (CryptoDetailTopBarComposable.kt:168)");
                        }
                        if (cryptoDetailTopBarViewState.getShowBackButton()) {
                            composer3.startReplaceGroup(-1138471169);
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1138381827);
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(815821134, true, new C135183(cryptoDetailTopBarViewState, function1), composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, ((i3 >> 9) & 112) | 3462, 0, 2032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoDetailTopBarComposable7.TopBarInternal$lambda$5(cryptoDetailTopBarViewState, z, function0, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1698728739, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt.TopBarInternal.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1698728739, i5, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.TopBarInternal.<anonymous> (CryptoDetailTopBarComposable.kt:138)");
                    }
                    boolean z2 = z;
                    EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                    ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
                    final CryptoDetailTopBarViewState cryptoDetailTopBarViewState2 = cryptoDetailTopBarViewState;
                    AnimatedVisibilityKt.AnimatedVisibility(z2, (Modifier) null, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambda3.rememberComposableLambda(1833756155, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt.TopBarInternal.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                            invoke(animatedVisibilityScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i6) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1833756155, i6, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.TopBarInternal.<anonymous>.<anonymous> (CryptoDetailTopBarComposable.kt:143)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer4, i7).m21593getSmallD9Ej5fM(), 0.0f, 2, null), C2002Dp.m7995constructorimpl(100), 0.0f, 2, null);
                            CryptoDetailTopBarViewState cryptoDetailTopBarViewState3 = cryptoDetailTopBarViewState2;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM5176widthInVpY3zN4$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String title = cryptoDetailTopBarViewState3.getTitle();
                            TextStyle textL = bentoTheme.getTypography(composer4, i7).getTextL();
                            TextOverflow.Companion companion3 = TextOverflow.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, null, companion3.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textL, composer4, 817889280, 0, 7550);
                            composer4.startReplaceGroup(563059312);
                            if (cryptoDetailTopBarViewState3.getSubtitle().length() > 0) {
                                BentoText2.m20747BentoText38GnDrw(cryptoDetailTopBarViewState3.getSubtitle().toString(), null, Color.m6701boximpl(bentoTheme.getColors(composer4, i7).m21426getFg20d7_KjU()), null, null, null, null, companion3.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer4, i7).getTextM(), composer4, 817889280, 0, 7546);
                            }
                            composer4.endReplaceGroup();
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 200064, 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), modifier4, ComposableLambda3.rememberComposableLambda(1720053583, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt.TopBarInternal.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                    int i6;
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i5 & 6) == 0) {
                        i6 = ((i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2) | i5;
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1720053583, i6, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.TopBarInternal.<anonymous> (CryptoDetailTopBarComposable.kt:168)");
                    }
                    if (cryptoDetailTopBarViewState.getShowBackButton()) {
                        composer3.startReplaceGroup(-1138471169);
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-1138381827);
                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(815821134, true, new C135183(cryptoDetailTopBarViewState, function1), composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, ((i3 >> 9) & 112) | 3462, 0, 2032);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CryptoDetailTopBarComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt$TopBarInternal$3 */
    static final class C135183 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ Function1<CryptoDetailTopBarAction, Unit> $handleAction;
        final /* synthetic */ CryptoDetailTopBarViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C135183(CryptoDetailTopBarViewState cryptoDetailTopBarViewState, Function1<? super CryptoDetailTopBarAction, Unit> function1) {
            this.$viewState = cryptoDetailTopBarViewState;
            this.$handleAction = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, CryptoDetailTopBarAction cryptoDetailTopBarAction) {
            function1.invoke(cryptoDetailTopBarAction);
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            int i2 = (i & 6) == 0 ? i | (composer.changed(BentoAppBar) ? 4 : 2) : i;
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(815821134, i2, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.TopBarInternal.<anonymous> (CryptoDetailTopBarComposable.kt:175)");
            }
            composer.startReplaceGroup(-1974902656);
            ImmutableList<CryptoDetailTopBarAction> topBarActions = this.$viewState.getTopBarActions();
            final Function1<CryptoDetailTopBarAction, Unit> function1 = this.$handleAction;
            for (final CryptoDetailTopBarAction cryptoDetailTopBarAction : topBarActions) {
                String string2 = StringResources6.getText(cryptoDetailTopBarAction.getContentDescription(), composer, StringResource.$stable).toString();
                Painter painterPainterResource = PainterResources_androidKt.painterResource(cryptoDetailTopBarAction.getIcon().getResourceId(), composer, 0);
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(BentoAppBar.align(TestTag3.testTag(Modifier.INSTANCE, string2), Alignment.INSTANCE.getCenterVertically()), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(cryptoDetailTopBarAction);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt$TopBarInternal$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoDetailTopBarComposable7.C135183.invoke$lambda$2$lambda$1$lambda$0(function1, cryptoDetailTopBarAction);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                IconKt.m5871Iconww6aTOc(painterPainterResource, string2, ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierM5144paddingVpY3zN4$default, false, null, null, (Function0) objRememberedValue, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, cryptoDetailTopBarAction instanceof CryptoDetailTopBarAction.AddToList ? "add_to_list" : Intrinsics.areEqual(cryptoDetailTopBarAction, CryptoDetailTopBarAction.UpdateList.INSTANCE) ? "custom_alert_setting" : "", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null), 0L, composer, 0, 8);
            }
            composer.endReplaceGroup();
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    private static final void PreviewTheme(final boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(899374611);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                z = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(899374611, i3, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.PreviewTheme (CryptoDetailTopBarComposable.kt:212)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE), ComposableLambda3.rememberComposableLambda(197173971, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt.PreviewTheme.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(197173971, i5, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.PreviewTheme.<anonymous> (CryptoDetailTopBarComposable.kt:216)");
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    final Function2<Composer, Integer, Unit> function22 = function2;
                    BentoTheme2.BentoTheme(boolValueOf, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(2043992715, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt.PreviewTheme.1.1
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
                                ComposerKt.traceEventStart(2043992715, i6, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.PreviewTheme.<anonymous>.<anonymous> (CryptoDetailTopBarComposable.kt:217)");
                            }
                            function22.invoke(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoDetailTopBarComposable7.PreviewTheme$lambda$6(z, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewStandard(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(397234384);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(397234384, i, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.PreviewStandard (CryptoDetailTopBarComposable.kt:224)");
            }
            PreviewTheme(false, CryptoDetailTopBarComposable.INSTANCE.getLambda$1384045951$feature_crypto_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoDetailTopBarComposable7.PreviewStandard$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewLoading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(8431899);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(8431899, i, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.PreviewLoading (CryptoDetailTopBarComposable.kt:245)");
            }
            PreviewTheme(false, CryptoDetailTopBarComposable.INSTANCE.getLambda$1979927180$feature_crypto_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoDetailTopBarComposable7.PreviewLoading$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewSubtitle(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1595737557);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1595737557, i, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.PreviewSubtitle (CryptoDetailTopBarComposable.kt:266)");
            }
            PreviewTheme(false, CryptoDetailTopBarComposable.INSTANCE.m13129getLambda$608925990$feature_crypto_externalDebug(), composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoDetailTopBarComposable7.PreviewSubtitle$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewSubtitleAnimation(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1990374059);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1990374059, i, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.PreviewSubtitleAnimation (CryptoDetailTopBarComposable.kt:287)");
            }
            PreviewTheme(false, CryptoDetailTopBarComposable.INSTANCE.m13127getLambda$16581924$feature_crypto_externalDebug(), composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoDetailTopBarComposable7.PreviewSubtitleAnimation$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewLongTitle(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2017044379);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2017044379, i, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.PreviewLongTitle (CryptoDetailTopBarComposable.kt:319)");
            }
            PreviewTheme(false, CryptoDetailTopBarComposable.INSTANCE.m13128getLambda$1751535412$feature_crypto_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoDetailTopBarComposable7.PreviewLongTitle$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
