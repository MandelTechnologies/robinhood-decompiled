package com.robinhood.android.crypto.costbasis.hub;

import android.content.Context;
import androidx.compose.foundation.DarkTheme;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
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
import androidx.view.compose.ActivityResultRegistry3;
import androidx.view.compose.ActivityResultRegistry8;
import androidx.view.result.ActivityResult;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.contracts.CryptoCostBasisDetailsIntentKey;
import com.robinhood.android.crypto.contracts.CryptoCostBasisHubFragmentKey;
import com.robinhood.android.crypto.costbasis.C12782R;
import com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt;
import com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubEvent;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.android.util.p275rx.AbsErrorHandler2;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoCostBasisHubComposable.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aM\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0013\u001a6\u0010\u0014\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00162\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011H\u0002\u001a3\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c¨\u0006\u001e²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\u0012\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 X\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\u0012\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010$X\u008a\u0084\u0002"}, m3636d2 = {"CryptoCostBasisHubComposable", "", "fragmentKey", "Lcom/robinhood/android/crypto/contracts/CryptoCostBasisHubFragmentKey;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDuxo;", "(Lcom/robinhood/android/crypto/contracts/CryptoCostBasisHubFragmentKey;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDuxo;Landroidx/compose/runtime/Composer;II)V", "CryptoCostBasisHubContent", "viewState", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubViewState;", "onShowMore", "Lkotlin/Function2;", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSection;", "", "onRefreshRow", "Lkotlin/Function1;", "Lcom/robinhood/android/crypto/costbasis/hub/CostBasisRow;", "(Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubViewState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "section", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSectionViewState;", "Lkotlin/Function0;", "CostBasisRowItem", "row", "(Lcom/robinhood/android/crypto/costbasis/hub/CostBasisRow;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PreviewCryptoCostBasisHubComposableLoading", "(Landroidx/compose/runtime/Composer;I)V", "PreviewCryptoCostBasisHubComposableLoaded", "feature-crypto-cost-basis_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubEvent;", "capturedViewState", "additionalRefreshData", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoCostBasisHubComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CostBasisRowItem$lambda$26(CostBasisRow costBasisRow, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        CostBasisRowItem(costBasisRow, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoCostBasisHubComposable$lambda$3(CryptoCostBasisHubFragmentKey cryptoCostBasisHubFragmentKey, Modifier modifier, CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo, int i, int i2, Composer composer, int i3) {
        CryptoCostBasisHubComposable(cryptoCostBasisHubFragmentKey, modifier, cryptoCostBasisHubDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoCostBasisHubContent$lambda$14(CryptoCostBasisHubViewState cryptoCostBasisHubViewState, Function2 function2, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoCostBasisHubContent(cryptoCostBasisHubViewState, function2, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewCryptoCostBasisHubComposableLoaded$lambda$28(int i, Composer composer, int i2) {
        PreviewCryptoCostBasisHubComposableLoaded(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewCryptoCostBasisHubComposableLoading$lambda$27(int i, Composer composer, int i2) {
        PreviewCryptoCostBasisHubComposableLoading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoCostBasisHubComposable(final CryptoCostBasisHubFragmentKey fragmentKey, Modifier modifier, CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo2;
        final Modifier modifier3;
        Composer composer2;
        int i4;
        final CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo3;
        Composer composer3;
        final AbsErrorHandler absErrorHandler;
        String entryPointIdentifier;
        final Event<CryptoCostBasisHubEvent> eventCryptoCostBasisHubComposable$lambda$1;
        final CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo4;
        final Modifier modifier4;
        EventConsumer<CryptoCostBasisHubEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
        Composer composerStartRestartGroup = composer.startRestartGroup(-578793271);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(fragmentKey) ? 4 : 2) | i;
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
                    cryptoCostBasisHubDuxo2 = cryptoCostBasisHubDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoCostBasisHubDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    cryptoCostBasisHubDuxo2 = cryptoCostBasisHubDuxo;
                }
                i3 |= i6;
            } else {
                cryptoCostBasisHubDuxo2 = cryptoCostBasisHubDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, fragmentKey)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoCostBasisHubDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$CryptoCostBasisHubComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$CryptoCostBasisHubComposable$$inlined$duxo$1.1
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
                        CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo5 = (CryptoCostBasisHubDuxo) baseDuxo;
                        i4 = i3 & (-897);
                        cryptoCostBasisHubDuxo3 = cryptoCostBasisHubDuxo5;
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-578793271, i4, -1, "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposable (CryptoCostBasisHubComposable.kt:79)");
                    }
                    Composer composer4 = composer2;
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoCostBasisHubDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoCostBasisHubDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                    composer3 = composer4;
                    absErrorHandler = (AbsErrorHandler) composer3.consume(AbsErrorHandler2.getLocalErrorHandler());
                    Screen.Name name = Screen.Name.CRYPTO_TRANSFER_COST_BASIS_HUB;
                    entryPointIdentifier = fragmentKey.getEntryPointIdentifier();
                    if (entryPointIdentifier == null) {
                        entryPointIdentifier = "";
                    }
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(name, null, entryPointIdentifier, null, 10, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(515787316, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt.CryptoCostBasisHubComposable.1
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
                                ComposerKt.traceEventStart(515787316, i7, -1, "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposable.<anonymous> (CryptoCostBasisHubComposable.kt:93)");
                            }
                            final Modifier modifier5 = modifier3;
                            final CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo6 = cryptoCostBasisHubDuxo3;
                            final SnapshotState4<CryptoCostBasisHubViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1343972937, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt.CryptoCostBasisHubComposable.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                    invoke(composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer6, int i8) {
                                    if ((i8 & 3) == 2 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1343972937, i8, -1, "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposable.<anonymous>.<anonymous> (CryptoCostBasisHubComposable.kt:94)");
                                    }
                                    ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.logScreenTransitions$default(modifier5, null, 1, null), ComposableSingletons$CryptoCostBasisHubComposableKt.INSTANCE.m12935getLambda$606259195$feature_crypto_cost_basis_externalDebug(), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(929882394, true, new C497341(cryptoCostBasisHubDuxo6, snapshotState4), composer6, 54), composer6, 805306416, 508);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: CryptoCostBasisHubComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$CryptoCostBasisHubComposable$1$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C497341 implements Function3<PaddingValues, Composer, Integer, Unit> {
                                    final /* synthetic */ CryptoCostBasisHubDuxo $duxo;
                                    final /* synthetic */ SnapshotState4<CryptoCostBasisHubViewState> $viewState$delegate;

                                    C497341(CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo, SnapshotState4<CryptoCostBasisHubViewState> snapshotState4) {
                                        this.$duxo = cryptoCostBasisHubDuxo;
                                        this.$viewState$delegate = snapshotState4;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                        invoke(paddingValues, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                        if ((i & 6) == 0) {
                                            i |= composer.changed(paddingValues) ? 4 : 2;
                                        }
                                        if ((i & 19) == 18 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(929882394, i, -1, "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposable.<anonymous>.<anonymous>.<anonymous> (CryptoCostBasisHubComposable.kt:106)");
                                        }
                                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                        CryptoCostBasisHubViewState cryptoCostBasisHubViewStateCryptoCostBasisHubComposable$lambda$0 = CryptoCostBasisHubComposableKt.CryptoCostBasisHubComposable$lambda$0(this.$viewState$delegate);
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer.changedInstance(this.$duxo);
                                        final CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo = this.$duxo;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function2() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$CryptoCostBasisHubComposable$1$1$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return CryptoCostBasisHubComposableKt.C128881.AnonymousClass1.C497341.invoke$lambda$1$lambda$0(cryptoCostBasisHubDuxo, (CryptoCostBasisHubSection) obj, ((Integer) obj2).intValue());
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        Function2 function2 = (Function2) objRememberedValue;
                                        composer.endReplaceGroup();
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                                        final CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo2 = this.$duxo;
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$CryptoCostBasisHubComposable$1$1$1$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return CryptoCostBasisHubComposableKt.C128881.AnonymousClass1.C497341.invoke$lambda$3$lambda$2(cryptoCostBasisHubDuxo2, (CostBasisRow) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        CryptoCostBasisHubComposableKt.CryptoCostBasisHubContent(cryptoCostBasisHubViewStateCryptoCostBasisHubComposable$lambda$0, function2, (Function1) objRememberedValue2, modifierPadding, composer, StringResource.$stable, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo, CryptoCostBasisHubSection section, int i) {
                                        Intrinsics.checkNotNullParameter(section, "section");
                                        CryptoCostBasisHubDuxo.load$default(cryptoCostBasisHubDuxo, section, i, false, 4, null);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo, CostBasisRow it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        cryptoCostBasisHubDuxo.refreshRow(it);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composer5, 54), composer5, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 48);
                    eventCryptoCostBasisHubComposable$lambda$1 = CryptoCostBasisHubComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCryptoCostBasisHubComposable$lambda$1 != null && (eventCryptoCostBasisHubComposable$lambda$1.getData() instanceof CryptoCostBasisHubEvent.Error) && (eventConsumerInvoke = eventCryptoCostBasisHubComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventCryptoCostBasisHubComposable$lambda$1, new Function1() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$CryptoCostBasisHubComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m12946invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m12946invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                AbsErrorHandler.handleError$default(absErrorHandler, ((CryptoCostBasisHubEvent.Error) eventCryptoCostBasisHubComposable$lambda$1.getData()).getT(), false, 2, null);
                            }
                        });
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Modifier modifier5 = modifier3;
                    cryptoCostBasisHubDuxo4 = cryptoCostBasisHubDuxo3;
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
                cryptoCostBasisHubDuxo3 = cryptoCostBasisHubDuxo2;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                final SnapshotState4<CryptoCostBasisHubViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoCostBasisHubDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(cryptoCostBasisHubDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                composer3 = composer42;
                absErrorHandler = (AbsErrorHandler) composer3.consume(AbsErrorHandler2.getLocalErrorHandler());
                Screen.Name name2 = Screen.Name.CRYPTO_TRANSFER_COST_BASIS_HUB;
                entryPointIdentifier = fragmentKey.getEntryPointIdentifier();
                if (entryPointIdentifier == null) {
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(name2, null, entryPointIdentifier, null, 10, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(515787316, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt.CryptoCostBasisHubComposable.1
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
                            ComposerKt.traceEventStart(515787316, i7, -1, "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposable.<anonymous> (CryptoCostBasisHubComposable.kt:93)");
                        }
                        final Modifier modifier52 = modifier3;
                        final CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo6 = cryptoCostBasisHubDuxo3;
                        final SnapshotState4<CryptoCostBasisHubViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1343972937, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt.CryptoCostBasisHubComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i8) {
                                if ((i8 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1343972937, i8, -1, "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposable.<anonymous>.<anonymous> (CryptoCostBasisHubComposable.kt:94)");
                                }
                                ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.logScreenTransitions$default(modifier52, null, 1, null), ComposableSingletons$CryptoCostBasisHubComposableKt.INSTANCE.m12935getLambda$606259195$feature_crypto_cost_basis_externalDebug(), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(929882394, true, new C497341(cryptoCostBasisHubDuxo6, snapshotState4), composer6, 54), composer6, 805306416, 508);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: CryptoCostBasisHubComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$CryptoCostBasisHubComposable$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C497341 implements Function3<PaddingValues, Composer, Integer, Unit> {
                                final /* synthetic */ CryptoCostBasisHubDuxo $duxo;
                                final /* synthetic */ SnapshotState4<CryptoCostBasisHubViewState> $viewState$delegate;

                                C497341(CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo, SnapshotState4<CryptoCostBasisHubViewState> snapshotState4) {
                                    this.$duxo = cryptoCostBasisHubDuxo;
                                    this.$viewState$delegate = snapshotState4;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                    invoke(paddingValues, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i & 6) == 0) {
                                        i |= composer.changed(paddingValues) ? 4 : 2;
                                    }
                                    if ((i & 19) == 18 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(929882394, i, -1, "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposable.<anonymous>.<anonymous>.<anonymous> (CryptoCostBasisHubComposable.kt:106)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                    CryptoCostBasisHubViewState cryptoCostBasisHubViewStateCryptoCostBasisHubComposable$lambda$0 = CryptoCostBasisHubComposableKt.CryptoCostBasisHubComposable$lambda$0(this.$viewState$delegate);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(this.$duxo);
                                    final CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo = this.$duxo;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function2() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$CryptoCostBasisHubComposable$1$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return CryptoCostBasisHubComposableKt.C128881.AnonymousClass1.C497341.invoke$lambda$1$lambda$0(cryptoCostBasisHubDuxo, (CryptoCostBasisHubSection) obj, ((Integer) obj2).intValue());
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function2 function2 = (Function2) objRememberedValue;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                                    final CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo2 = this.$duxo;
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$CryptoCostBasisHubComposable$1$1$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CryptoCostBasisHubComposableKt.C128881.AnonymousClass1.C497341.invoke$lambda$3$lambda$2(cryptoCostBasisHubDuxo2, (CostBasisRow) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    CryptoCostBasisHubComposableKt.CryptoCostBasisHubContent(cryptoCostBasisHubViewStateCryptoCostBasisHubComposable$lambda$0, function2, (Function1) objRememberedValue2, modifierPadding, composer, StringResource.$stable, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo, CryptoCostBasisHubSection section, int i) {
                                    Intrinsics.checkNotNullParameter(section, "section");
                                    CryptoCostBasisHubDuxo.load$default(cryptoCostBasisHubDuxo, section, i, false, 4, null);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo, CostBasisRow it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    cryptoCostBasisHubDuxo.refreshRow(it);
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer5, 54), composer5, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 48);
                eventCryptoCostBasisHubComposable$lambda$1 = CryptoCostBasisHubComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoCostBasisHubComposable$lambda$1 != null) {
                    eventConsumerInvoke.consume(eventCryptoCostBasisHubComposable$lambda$1, new Function1() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$CryptoCostBasisHubComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m12946invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m12946invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(absErrorHandler, ((CryptoCostBasisHubEvent.Error) eventCryptoCostBasisHubComposable$lambda$1.getData()).getT(), false, 2, null);
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier3;
                cryptoCostBasisHubDuxo4 = cryptoCostBasisHubDuxo3;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoCostBasisHubDuxo4 = cryptoCostBasisHubDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoCostBasisHubComposableKt.CryptoCostBasisHubComposable$lambda$3(fragmentKey, modifier4, cryptoCostBasisHubDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                    cryptoCostBasisHubDuxo3 = cryptoCostBasisHubDuxo2;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer422 = composer2;
                final SnapshotState4<CryptoCostBasisHubViewState> snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(cryptoCostBasisHubDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer422, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(cryptoCostBasisHubDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer422, 0, 7);
                composer3 = composer422;
                absErrorHandler = (AbsErrorHandler) composer3.consume(AbsErrorHandler2.getLocalErrorHandler());
                Screen.Name name22 = Screen.Name.CRYPTO_TRANSFER_COST_BASIS_HUB;
                entryPointIdentifier = fragmentKey.getEntryPointIdentifier();
                if (entryPointIdentifier == null) {
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(name22, null, entryPointIdentifier, null, 10, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(515787316, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt.CryptoCostBasisHubComposable.1
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
                            ComposerKt.traceEventStart(515787316, i7, -1, "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposable.<anonymous> (CryptoCostBasisHubComposable.kt:93)");
                        }
                        final Modifier modifier522 = modifier3;
                        final CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo6 = cryptoCostBasisHubDuxo3;
                        final SnapshotState4<CryptoCostBasisHubViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle32;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1343972937, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt.CryptoCostBasisHubComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i8) {
                                if ((i8 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1343972937, i8, -1, "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposable.<anonymous>.<anonymous> (CryptoCostBasisHubComposable.kt:94)");
                                }
                                ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.logScreenTransitions$default(modifier522, null, 1, null), ComposableSingletons$CryptoCostBasisHubComposableKt.INSTANCE.m12935getLambda$606259195$feature_crypto_cost_basis_externalDebug(), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(929882394, true, new C497341(cryptoCostBasisHubDuxo6, snapshotState4), composer6, 54), composer6, 805306416, 508);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: CryptoCostBasisHubComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$CryptoCostBasisHubComposable$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C497341 implements Function3<PaddingValues, Composer, Integer, Unit> {
                                final /* synthetic */ CryptoCostBasisHubDuxo $duxo;
                                final /* synthetic */ SnapshotState4<CryptoCostBasisHubViewState> $viewState$delegate;

                                C497341(CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo, SnapshotState4<CryptoCostBasisHubViewState> snapshotState4) {
                                    this.$duxo = cryptoCostBasisHubDuxo;
                                    this.$viewState$delegate = snapshotState4;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                    invoke(paddingValues, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i & 6) == 0) {
                                        i |= composer.changed(paddingValues) ? 4 : 2;
                                    }
                                    if ((i & 19) == 18 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(929882394, i, -1, "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposable.<anonymous>.<anonymous>.<anonymous> (CryptoCostBasisHubComposable.kt:106)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                    CryptoCostBasisHubViewState cryptoCostBasisHubViewStateCryptoCostBasisHubComposable$lambda$0 = CryptoCostBasisHubComposableKt.CryptoCostBasisHubComposable$lambda$0(this.$viewState$delegate);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(this.$duxo);
                                    final CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo = this.$duxo;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function2() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$CryptoCostBasisHubComposable$1$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return CryptoCostBasisHubComposableKt.C128881.AnonymousClass1.C497341.invoke$lambda$1$lambda$0(cryptoCostBasisHubDuxo, (CryptoCostBasisHubSection) obj, ((Integer) obj2).intValue());
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function2 function2 = (Function2) objRememberedValue;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                                    final CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo2 = this.$duxo;
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$CryptoCostBasisHubComposable$1$1$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CryptoCostBasisHubComposableKt.C128881.AnonymousClass1.C497341.invoke$lambda$3$lambda$2(cryptoCostBasisHubDuxo2, (CostBasisRow) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    CryptoCostBasisHubComposableKt.CryptoCostBasisHubContent(cryptoCostBasisHubViewStateCryptoCostBasisHubComposable$lambda$0, function2, (Function1) objRememberedValue2, modifierPadding, composer, StringResource.$stable, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo, CryptoCostBasisHubSection section, int i) {
                                    Intrinsics.checkNotNullParameter(section, "section");
                                    CryptoCostBasisHubDuxo.load$default(cryptoCostBasisHubDuxo, section, i, false, 4, null);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo, CostBasisRow it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    cryptoCostBasisHubDuxo.refreshRow(it);
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer5, 54), composer5, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 48);
                eventCryptoCostBasisHubComposable$lambda$1 = CryptoCostBasisHubComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventCryptoCostBasisHubComposable$lambda$1 != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier522 = modifier3;
                cryptoCostBasisHubDuxo4 = cryptoCostBasisHubDuxo3;
                modifier4 = modifier522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoCostBasisHubViewState CryptoCostBasisHubComposable$lambda$0(SnapshotState4<CryptoCostBasisHubViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoCostBasisHubEvent> CryptoCostBasisHubComposable$lambda$1(SnapshotState4<Event<CryptoCostBasisHubEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CryptoCostBasisHubSection> CryptoCostBasisHubContent$lambda$12(SnapshotState4<? extends List<? extends CryptoCostBasisHubSection>> snapshotState4) {
        return (List) snapshotState4.getValue();
    }

    private static final CryptoCostBasisHubViewState CryptoCostBasisHubContent$lambda$8(SnapshotState4<CryptoCostBasisHubViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoCostBasisHubContent(final CryptoCostBasisHubViewState viewState, Function2<? super CryptoCostBasisHubSection, ? super Integer, Unit> function2, final Function1<? super CostBasisRow, Unit> onRefreshRow, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Context context;
        final Navigator navigator;
        boolean zChangedInstance;
        Object objRememberedValue;
        Object objRememberedValue2;
        Composer.Companion companion;
        SnapshotState4 snapshotState4;
        boolean z;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function2<? super CryptoCostBasisHubSection, ? super Integer, Unit> onShowMore = function2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onShowMore, "onShowMore");
        Intrinsics.checkNotNullParameter(onRefreshRow, "onRefreshRow");
        Composer composerStartRestartGroup = composer.startRestartGroup(388529822);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onShowMore) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRefreshRow) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(388529822, i4, -1, "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubContent (CryptoCostBasisHubComposable.kt:128)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                int i6 = i4 & 14;
                int i7 = i4 & 112;
                zChangedInstance = (i6 != 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(viewState))) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | (i7 != 32) | ((i4 & 896) != 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoCostBasisHubComposableKt.CryptoCostBasisHubContent$lambda$7$lambda$6(viewState, navigator, context, onRefreshRow, onShowMore, (LazyListScope) obj);
                        }
                    };
                    onShowMore = onShowMore;
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue = function1;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier3 = modifier2;
                LazyDslKt.LazyColumn(modifier3, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i4 >> 9) & 14, 510);
                modifier2 = modifier3;
                composerStartRestartGroup = composerStartRestartGroup;
                final SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(viewState, composerStartRestartGroup, i6 | StringResource.$stable);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoCostBasisHubComposableKt.CryptoCostBasisHubContent$lambda$11$lambda$10(snapshotState4RememberUpdatedState);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState4 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                List<CryptoCostBasisHubSection> listCryptoCostBasisHubContent$lambda$12 = CryptoCostBasisHubContent$lambda$12(snapshotState4);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z = i7 != 32;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new CryptoCostBasisHubComposableKt$CryptoCostBasisHubContent$2$1(snapshotState4, onShowMore, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(listCryptoCostBasisHubContent$lambda$12, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoCostBasisHubComposableKt.CryptoCostBasisHubContent$lambda$14(viewState, onShowMore, onRefreshRow, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i62 = i4 & 14;
            if (i62 != 4) {
                int i72 = i4 & 112;
                zChangedInstance = (i62 != 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(viewState))) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | (i72 != 32) | ((i4 & 896) != 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    Function1 function12 = new Function1() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoCostBasisHubComposableKt.CryptoCostBasisHubContent$lambda$7$lambda$6(viewState, navigator, context, onRefreshRow, onShowMore, (LazyListScope) obj);
                        }
                    };
                    onShowMore = onShowMore;
                    composerStartRestartGroup.updateRememberedValue(function12);
                    objRememberedValue = function12;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier32 = modifier2;
                    LazyDslKt.LazyColumn(modifier32, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i4 >> 9) & 14, 510);
                    modifier2 = modifier32;
                    composerStartRestartGroup = composerStartRestartGroup;
                    final SnapshotState4 snapshotState4RememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(viewState, composerStartRestartGroup, i62 | StringResource.$stable);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    snapshotState4 = (SnapshotState4) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    List<CryptoCostBasisHubSection> listCryptoCostBasisHubContent$lambda$122 = CryptoCostBasisHubContent$lambda$12(snapshotState4);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if (i72 != 32) {
                    }
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue3 = new CryptoCostBasisHubComposableKt$CryptoCostBasisHubContent$2$1(snapshotState4, onShowMore, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(listCryptoCostBasisHubContent$lambda$122, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoCostBasisHubContent$lambda$7$lambda$6(CryptoCostBasisHubViewState cryptoCostBasisHubViewState, final Navigator navigator, final Context context, Function1 function1, final Function2 function2, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        ComposableSingletons$CryptoCostBasisHubComposableKt composableSingletons$CryptoCostBasisHubComposableKt = ComposableSingletons$CryptoCostBasisHubComposableKt.INSTANCE;
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$CryptoCostBasisHubComposableKt.m12936getLambda$7837645$feature_crypto_cost_basis_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$CryptoCostBasisHubComposableKt.getLambda$1073243818$feature_crypto_cost_basis_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(515259755, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$CryptoCostBasisHubContent$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(515259755, i, -1, "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubContent.<anonymous>.<anonymous>.<anonymous> (CryptoCostBasisHubComposable.kt:145)");
                }
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                int i2 = C12782R.string.crypto_cost_basis_hub_subtitle;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
                long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
                final Navigator navigator2 = navigator;
                final Context context2 = context;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$CryptoCostBasisHubContent$1$1$1$1$1
                        @Override // androidx.compose.p011ui.text.LinkInteractionListener
                        public final void onClick(LinkAnnotation link) {
                            String url;
                            Intrinsics.checkNotNullParameter(link, "link");
                            LinkAnnotation.Url url2 = link instanceof LinkAnnotation.Url ? (LinkAnnotation.Url) link : null;
                            if (url2 == null || (url = url2.getUrl()) == null) {
                                url = "";
                            }
                            if (url.length() > 0) {
                                Navigators3.showHelpCenterWebViewFragment(navigator2, context2, url);
                            }
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(i2, jM21425getFg0d7_KjU, jM21425getFg0d7_KjU2, (LinkInteractionListener) objRememberedValue, composer, 0, 0), modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8188);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$CryptoCostBasisHubComposableKt.m12933getLambda$42724308$feature_crypto_cost_basis_externalDebug(), 3, null);
        for (final CryptoCostBasisHubSectionViewState cryptoCostBasisHubSectionViewState : CollectionsKt.listOf((Object[]) new CryptoCostBasisHubSectionViewState[]{cryptoCostBasisHubViewState.getSoldIn2025Section(), cryptoCostBasisHubViewState.getMissingDetailsSection(), cryptoCostBasisHubViewState.getConfirmedSection()})) {
            section(LazyColumn, cryptoCostBasisHubSectionViewState, new Function0() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoCostBasisHubComposableKt.CryptoCostBasisHubContent$lambda$7$lambda$6$lambda$5$lambda$4(function2, cryptoCostBasisHubSectionViewState);
                }
            }, function1);
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$CryptoCostBasisHubComposableKt.INSTANCE.m12934getLambda$600708371$feature_crypto_cost_basis_externalDebug(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoCostBasisHubContent$lambda$7$lambda$6$lambda$5$lambda$4(Function2 function2, CryptoCostBasisHubSectionViewState cryptoCostBasisHubSectionViewState) {
        function2.invoke(cryptoCostBasisHubSectionViewState.getSection(), 10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List CryptoCostBasisHubContent$lambda$11$lambda$10(SnapshotState4 snapshotState4) {
        List<CryptoCostBasisHubSectionViewState> listListOf = CollectionsKt.listOf((Object[]) new CryptoCostBasisHubSectionViewState[]{CryptoCostBasisHubContent$lambda$8(snapshotState4).getSoldIn2025Section(), CryptoCostBasisHubContent$lambda$8(snapshotState4).getMissingDetailsSection(), CryptoCostBasisHubContent$lambda$8(snapshotState4).getConfirmedSection()});
        ArrayList arrayList = new ArrayList();
        for (CryptoCostBasisHubSectionViewState cryptoCostBasisHubSectionViewState : listListOf) {
            CryptoCostBasisHubSection section = (cryptoCostBasisHubSectionViewState.isLoading() || cryptoCostBasisHubSectionViewState.getRows().size() >= 5 || cryptoCostBasisHubSectionViewState.getHideShowMore()) ? null : cryptoCostBasisHubSectionViewState.getSection();
            if (section != null) {
                arrayList.add(section);
            }
        }
        return arrayList;
    }

    private static final void section(LazyListScope lazyListScope, final CryptoCostBasisHubSectionViewState cryptoCostBasisHubSectionViewState, final Function0<Unit> function0, final Function1<? super CostBasisRow, Unit> function1) {
        String bannerMarkdownContent;
        if (cryptoCostBasisHubSectionViewState.getHideSection() || cryptoCostBasisHubSectionViewState.getRows().isEmpty()) {
            return;
        }
        ComposableSingletons$CryptoCostBasisHubComposableKt composableSingletons$CryptoCostBasisHubComposableKt = ComposableSingletons$CryptoCostBasisHubComposableKt.INSTANCE;
        LazyListScope.item$default(lazyListScope, null, null, composableSingletons$CryptoCostBasisHubComposableKt.getLambda$261873426$feature_crypto_cost_basis_externalDebug(), 3, null);
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(209853193, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt.section.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(209853193, i, -1, "com.robinhood.android.crypto.costbasis.hub.section.<anonymous> (CryptoCostBasisHubComposable.kt:224)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean zIsLoading = cryptoCostBasisHubSectionViewState.isLoading();
                final CryptoCostBasisHubSectionViewState cryptoCostBasisHubSectionViewState2 = cryptoCostBasisHubSectionViewState;
                LocalShowPlaceholder.Loadable(zIsLoading, companion, null, ComposableLambda3.rememberComposableLambda(-838323047, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt.section.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-838323047, i2, -1, "com.robinhood.android.crypto.costbasis.hub.section.<anonymous>.<anonymous> (CryptoCostBasisHubComposable.kt:228)");
                        }
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(cryptoCostBasisHubSectionViewState2.getTitle(), composer2, StringResource.$stable), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getDisplayCapsuleSmall(), composer2, 0, 0, 8188);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 3120, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(lazyListScope, null, null, composableSingletons$CryptoCostBasisHubComposableKt.getLambda$788619338$feature_crypto_cost_basis_externalDebug(), 3, null);
        if (!cryptoCostBasisHubSectionViewState.isLoading() && (bannerMarkdownContent = cryptoCostBasisHubSectionViewState.getBannerMarkdownContent()) != null) {
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(171951373, true, new CryptoCostBasisHubComposableKt$section$2$1(bannerMarkdownContent)), 3, null);
            LazyListScope.item$default(lazyListScope, null, null, composableSingletons$CryptoCostBasisHubComposableKt.getLambda$1410917942$feature_crypto_cost_basis_externalDebug(), 3, null);
        }
        final ImmutableList<CostBasisRow> rows = cryptoCostBasisHubSectionViewState.getRows();
        final CryptoCostBasisHubComposableKt$section$$inlined$items$default$1 cryptoCostBasisHubComposableKt$section$$inlined$items$default$1 = new Function1() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$section$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(CostBasisRow costBasisRow) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((CostBasisRow) obj);
            }
        };
        lazyListScope.items(rows.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$section$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return cryptoCostBasisHubComposableKt$section$$inlined$items$default$1.invoke(rows.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$section$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final CostBasisRow costBasisRow = (CostBasisRow) rows.get(i);
                composer.startReplaceGroup(524413083);
                boolean zIsLoading = cryptoCostBasisHubSectionViewState.isLoading();
                final Function1 function12 = function1;
                LocalShowPlaceholder.Loadable(zIsLoading, null, null, ComposableLambda3.rememberComposableLambda(-1254175555, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$section$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1254175555, i4, -1, "com.robinhood.android.crypto.costbasis.hub.section.<anonymous>.<anonymous> (CryptoCostBasisHubComposable.kt:266)");
                        }
                        CryptoCostBasisHubComposableKt.CostBasisRowItem(costBasisRow, null, function12, composer2, 0, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 3072, 6);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (cryptoCostBasisHubSectionViewState.getHideShowMore()) {
            return;
        }
        LazyListScope.item$default(lazyListScope, null, null, composableSingletons$CryptoCostBasisHubComposableKt.m12930getLambda$1387830428$feature_crypto_cost_basis_externalDebug(), 3, null);
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-736598821, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt.section.4
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-736598821, i, -1, "com.robinhood.android.crypto.costbasis.hub.section.<anonymous> (CryptoCostBasisHubComposable.kt:277)");
                }
                if (cryptoCostBasisHubSectionViewState.isLoadingMore()) {
                    composer.startReplaceGroup(-1027508259);
                    BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, ((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 2, null), BentoProgressIndicator3.f5151S, 0L, composer, 48, 4);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1027237040);
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, ((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 2, null);
                    BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C12782R.string.crypto_cost_basis_hub_show_more, composer, 0), modifierM5144paddingVpY3zN4$default, null, null, false, null, composer, 0, 120);
                    composer.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011a A[Catch: all -> 0x012d, TryCatch #1 {all -> 0x012d, blocks: (B:60:0x0114, B:62:0x011a, B:64:0x0127, B:67:0x0130, B:69:0x013a, B:71:0x0175, B:73:0x017a, B:74:0x017d, B:75:0x017e, B:70:0x016c), top: B:97:0x0114, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013a A[Catch: all -> 0x012d, TRY_LEAVE, TryCatch #1 {all -> 0x012d, blocks: (B:60:0x0114, B:62:0x011a, B:64:0x0127, B:67:0x0130, B:69:0x013a, B:71:0x0175, B:73:0x017a, B:74:0x017d, B:75:0x017e, B:70:0x016c), top: B:97:0x0114, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CostBasisRowItem(final CostBasisRow costBasisRow, Modifier modifier, final Function1<? super CostBasisRow, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        final Context context;
        final Navigator navigator;
        int i4;
        boolean z;
        Object objRememberedValue;
        final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult;
        AnnotatedString.Builder builder;
        int iPushStyle;
        String formattedDate;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2111064);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(costBasisRow) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2111064, i3, -1, "com.robinhood.android.crypto.costbasis.hub.CostBasisRowItem (CryptoCostBasisHubComposable.kt:299)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean z2 = (i3 & 896) != 256;
                i4 = i3 & 14;
                z = z2 | (i4 != 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoCostBasisHubComposableKt.CostBasisRowItem$lambda$18$lambda$17(function1, costBasisRow, (ActivityResult) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(2028747760);
                builder = new AnnotatedString.Builder(0, 1, null);
                iPushStyle = builder.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                try {
                    formattedDate = costBasisRow.getFormattedDate();
                    if (formattedDate != null) {
                        builder.append(formattedDate);
                        if (!StringsKt.isBlank(costBasisRow.getSummaryAdditionalText())) {
                            builder.append(" · ");
                        }
                    }
                    if (!StringsKt.isBlank(costBasisRow.getSummaryAdditionalText())) {
                        iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                        try {
                            builder.append(costBasisRow.getSummaryAdditionalText());
                            Unit unit = Unit.INSTANCE;
                            builder.pop(iPushStyle);
                        } finally {
                            builder.pop(iPushStyle);
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(2028767349);
                    AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                    builder2.append(StringResources_androidKt.stringResource(C12782R.string.crypto_cost_basis_hub_row_primary, new Object[]{costBasisRow.getCurrencySymbol()}, composerStartRestartGroup, 0));
                    AnnotatedString annotatedString2 = builder2.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowState.Meta.SingleLine singleLine = new BentoBaseRowState.Meta.SingleLine(costBasisRow.getAmount());
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | (i4 != 4) | composerStartRestartGroup.changedInstance(activityResultRegistry8RememberLauncherForActivityResult);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoCostBasisHubComposableKt.CostBasisRowItem$lambda$25$lambda$24(navigator, context, costBasisRow, activityResultRegistry8RememberLauncherForActivityResult);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierFillMaxWidth$default, null, annotatedString2, annotatedString, null, singleLine, null, false, false, false, false, false, 0L, (Function0) objRememberedValue2, composer2, BentoBaseRowState.Meta.SingleLine.$stable << 15, 0, 8146);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoCostBasisHubComposableKt.CostBasisRowItem$lambda$26(costBasisRow, modifier4, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult2 = new ActivityResultContracts$StartActivityForResult();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            if ((i3 & 896) != 256) {
            }
            i4 = i3 & 14;
            z = z2 | (i4 != 4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoCostBasisHubComposableKt.CostBasisRowItem$lambda$18$lambda$17(function1, costBasisRow, (ActivityResult) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult2, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(2028747760);
                builder = new AnnotatedString.Builder(0, 1, null);
                iPushStyle = builder.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                formattedDate = costBasisRow.getFormattedDate();
                if (formattedDate != null) {
                }
                if (!StringsKt.isBlank(costBasisRow.getSummaryAdditionalText())) {
                }
                Unit unit22 = Unit.INSTANCE;
                builder.pop(iPushStyle);
                AnnotatedString annotatedString3 = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(2028767349);
                AnnotatedString.Builder builder22 = new AnnotatedString.Builder(0, 1, null);
                builder22.append(StringResources_androidKt.stringResource(C12782R.string.crypto_cost_basis_hub_row_primary, new Object[]{costBasisRow.getCurrencySymbol()}, composerStartRestartGroup, 0));
                AnnotatedString annotatedString22 = builder22.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                BentoBaseRowState.Meta.SingleLine singleLine2 = new BentoBaseRowState.Meta.SingleLine(costBasisRow.getAmount());
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | (i4 != 4) | composerStartRestartGroup.changedInstance(activityResultRegistry8RememberLauncherForActivityResult);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoCostBasisHubComposableKt.CostBasisRowItem$lambda$25$lambda$24(navigator, context, costBasisRow, activityResultRegistry8RememberLauncherForActivityResult);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier52 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierFillMaxWidth$default2, null, annotatedString22, annotatedString3, null, singleLine2, null, false, false, false, false, false, 0L, (Function0) objRememberedValue2, composer2, BentoBaseRowState.Meta.SingleLine.$stable << 15, 0, 8146);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CostBasisRowItem$lambda$18$lambda$17(Function1 function1, CostBasisRow costBasisRow, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        function1.invoke(costBasisRow);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CostBasisRowItem$lambda$25$lambda$24(Navigator navigator, Context context, CostBasisRow costBasisRow, ActivityResultRegistry8 activityResultRegistry8) {
        activityResultRegistry8.launch(Navigator.DefaultImpls.createIntent$default(navigator, context, new CryptoCostBasisDetailsIntentKey(com.robinhood.utils.extensions.StringsKt.toUuid(costBasisRow.getId()), com.robinhood.utils.extensions.StringsKt.toUuid(costBasisRow.getAccountId()), "crypto_cost_basis_hub"), null, false, 12, null));
        return Unit.INSTANCE;
    }

    @DayNightPreview
    private static final void PreviewCryptoCostBasisHubComposableLoading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(252160137);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(252160137, i, -1, "com.robinhood.android.crypto.costbasis.hub.PreviewCryptoCostBasisHubComposableLoading (CryptoCostBasisHubComposable.kt:353)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, Boolean.TRUE, null, null, ComposableSingletons$CryptoCostBasisHubComposableKt.INSTANCE.getLambda$215348689$feature_crypto_cost_basis_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoCostBasisHubComposableKt.PreviewCryptoCostBasisHubComposableLoading$lambda$27(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    private static final void PreviewCryptoCostBasisHubComposableLoaded(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-208592918);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-208592918, i, -1, "com.robinhood.android.crypto.costbasis.hub.PreviewCryptoCostBasisHubComposableLoaded (CryptoCostBasisHubComposable.kt:426)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, Boolean.TRUE, null, null, ComposableSingletons$CryptoCostBasisHubComposableKt.INSTANCE.getLambda$2006976930$feature_crypto_cost_basis_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoCostBasisHubComposableKt.PreviewCryptoCostBasisHubComposableLoaded$lambda$28(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
