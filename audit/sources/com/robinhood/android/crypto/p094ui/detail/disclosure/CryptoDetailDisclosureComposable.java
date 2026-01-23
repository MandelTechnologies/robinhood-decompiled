package com.robinhood.android.crypto.p094ui.detail.disclosure;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
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
import com.robinhood.android.crypto.p094ui.detail.disclosure.CryptoDetailDisclosureDuxo;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.shared.common.contracts.RemoteDisclosureKey;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: CryptoDetailDisclosureComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, m3636d2 = {"CryptoDetailDisclosureComposable", "", "currencyPairId", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/ui/detail/disclosure/CryptoDetailDisclosureDuxo;", "(Ljava/util/UUID;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/ui/detail/disclosure/CryptoDetailDisclosureDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto_externalDebug", "viewState", "Lcom/robinhood/android/crypto/ui/detail/disclosure/CryptoDetailDisclosureViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.disclosure.CryptoDetailDisclosureComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoDetailDisclosureComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoDetailDisclosureComposable$lambda$6(UUID uuid, Modifier modifier, CryptoDetailDisclosureDuxo cryptoDetailDisclosureDuxo, int i, int i2, Composer composer, int i3) {
        CryptoDetailDisclosureComposable(uuid, modifier, cryptoDetailDisclosureDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoDetailDisclosureComposable$lambda$5$lambda$4$lambda$3(Navigator navigator, Context context, String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Uri uri2 = Uri.parse(uri);
        if (navigator.isDeepLinkSupported(uri2)) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri2, null, null, false, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoDetailDisclosureComposable(final UUID currencyPairId, Modifier modifier, CryptoDetailDisclosureDuxo cryptoDetailDisclosureDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoDetailDisclosureDuxo cryptoDetailDisclosureDuxo2;
        Modifier modifier3;
        int i4;
        CryptoDetailDisclosureDuxo cryptoDetailDisclosureDuxo3;
        final DisclosureLink disclosureLink;
        final CryptoDetailDisclosureDuxo cryptoDetailDisclosureDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Composer composerStartRestartGroup = composer.startRestartGroup(1934533212);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(currencyPairId) ? 4 : 2) | i;
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
                    cryptoDetailDisclosureDuxo2 = cryptoDetailDisclosureDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoDetailDisclosureDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    cryptoDetailDisclosureDuxo2 = cryptoDetailDisclosureDuxo;
                }
                i3 |= i6;
            } else {
                cryptoDetailDisclosureDuxo2 = cryptoDetailDisclosureDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        CryptoDetailDisclosureDuxo.InitArgs initArgs = new CryptoDetailDisclosureDuxo.InitArgs(currencyPairId);
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoDetailDisclosureDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.ui.detail.disclosure.CryptoDetailDisclosureComposableKt$CryptoDetailDisclosureComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.ui.detail.disclosure.CryptoDetailDisclosureComposableKt$CryptoDetailDisclosureComposable$$inlined$duxo$1.1
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
                        i4 = i3 & (-897);
                        cryptoDetailDisclosureDuxo3 = (CryptoDetailDisclosureDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1934533212, i4, -1, "com.robinhood.android.crypto.ui.detail.disclosure.CryptoDetailDisclosureComposable (CryptoDetailDisclosureComposable.kt:31)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoDetailDisclosureDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup = composerStartRestartGroup;
                        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        disclosureLink = CryptoDetailDisclosureComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDisclosureLink();
                        if (disclosureLink == null) {
                            composerStartRestartGroup.startReplaceGroup(1808286969);
                            String string2 = StringResource2.getString(CryptoDetailDisclosureComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDisclosureResource(), composerStartRestartGroup, StringResource.$stable);
                            String strStringResource = StringResources_androidKt.stringResource(disclosureLink.getTextRes(), composerStartRestartGroup, 0);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU();
                            TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS();
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(disclosureLink);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.disclosure.CryptoDetailDisclosureComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoDetailDisclosureComposable.CryptoDetailDisclosureComposable$lambda$2$lambda$1(navigator, context, disclosureLink);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(string2, strStringResource, (Function0) objRememberedValue2, modifier3, jM21426getFg20d7_KjU, 0L, textS, 0, composerStartRestartGroup, (i4 << 6) & 7168, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(1808977711);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String string3 = StringResource2.getString(CryptoDetailDisclosureComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDisclosureResource(), composerStartRestartGroup, StringResource.$stable);
                            MarkdownStyle style = BentoMarkdownText.INSTANCE.getStyle(composerStartRestartGroup, BentoMarkdownText.$stable);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            MarkdownStyle markdownStyleM16260copyR0sFphs$default = MarkdownStyle.m16260copyR0sFphs$default(style, null, null, null, null, bentoTheme2.getTypography(composerStartRestartGroup, i8).getTextS(), null, new MarkdownStyle.Link(bentoTheme2.getColors(composerStartRestartGroup, i8).m21426getFg20d7_KjU(), false, false, 6, null), bentoTheme2.getColors(composerStartRestartGroup, i8).m21426getFg20d7_KjU(), null, 0, null, 1839, null);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.disclosure.CryptoDetailDisclosureComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CryptoDetailDisclosureComposable.CryptoDetailDisclosureComposable$lambda$5$lambda$4$lambda$3(navigator, context, (String) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            BentoMarkdownText2.BentoMarkdownText(string3, (Modifier) null, markdownStyleM16260copyR0sFphs$default, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue3, composerStartRestartGroup, MarkdownStyle.$stable << 6, 10);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Modifier modifier5 = modifier3;
                        cryptoDetailDisclosureDuxo4 = cryptoDetailDisclosureDuxo3;
                        modifier4 = modifier5;
                    } else {
                        i4 = i3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                cryptoDetailDisclosureDuxo3 = cryptoDetailDisclosureDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoDetailDisclosureDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                disclosureLink = CryptoDetailDisclosureComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getDisclosureLink();
                if (disclosureLink == null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier3;
                cryptoDetailDisclosureDuxo4 = cryptoDetailDisclosureDuxo3;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoDetailDisclosureDuxo4 = cryptoDetailDisclosureDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.disclosure.CryptoDetailDisclosureComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoDetailDisclosureComposable.CryptoDetailDisclosureComposable$lambda$6(currencyPairId, modifier4, cryptoDetailDisclosureDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoDetailDisclosureComposable$lambda$2$lambda$1(Navigator navigator, Context context, DisclosureLink disclosureLink) {
        Navigator.DefaultImpls.startActivity$default(navigator, context, new RemoteDisclosureKey(disclosureLink.getContentfulId(), null, false, false, null, null, null, false, 250, null), null, false, null, NavigationType.PRESENT, 28, null);
        return Unit.INSTANCE;
    }

    private static final CryptoDetailDisclosureViewState CryptoDetailDisclosureComposable$lambda$0(SnapshotState4<CryptoDetailDisclosureViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
