package com.robinhood.android.pricealerts.libpricealertsbanner;

import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.util.Money;
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

/* compiled from: PriceAlertsBannerComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, m3636d2 = {"PriceAlertsBannerComposable", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "accountNumber", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerDuxo;", "(Lcom/robinhood/models/db/Instrument;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-price-alerts-banner_externalDebug", "viewState", "Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PriceAlertsBannerComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PriceAlertsBannerComposable$lambda$4(Instrument instrument, String str, Modifier modifier, PriceAlertsBannerDuxo priceAlertsBannerDuxo, int i, int i2, Composer composer, int i3) {
        PriceAlertsBannerComposable(instrument, str, modifier, priceAlertsBannerDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PriceAlertsBannerComposable$lambda$5(Instrument instrument, String str, Modifier modifier, PriceAlertsBannerDuxo priceAlertsBannerDuxo, int i, int i2, Composer composer, int i3) {
        PriceAlertsBannerComposable(instrument, str, modifier, priceAlertsBannerDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PriceAlertsBannerComposable(final Instrument instrument, final String accountNumber, Modifier modifier, PriceAlertsBannerDuxo priceAlertsBannerDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PriceAlertsBannerDuxo priceAlertsBannerDuxo2;
        boolean z;
        Composer composer2;
        Modifier modifier3;
        final PriceAlertsBannerDuxo priceAlertsBannerDuxo3;
        boolean z2;
        Object objRememberedValue;
        Composer composer3;
        final PriceAlertsBannerViewState.PriceAlert priceAlert;
        final PriceAlertsBannerDuxo priceAlertsBannerDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Composer composerStartRestartGroup = composer.startRestartGroup(-539318850);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(instrument) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(accountNumber) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    priceAlertsBannerDuxo2 = priceAlertsBannerDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(priceAlertsBannerDuxo2) ? 2048 : 1024;
                    i3 |= i5;
                } else {
                    priceAlertsBannerDuxo2 = priceAlertsBannerDuxo;
                }
                i3 |= i5;
            } else {
                priceAlertsBannerDuxo2 = priceAlertsBannerDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        z = false;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PriceAlertsBannerDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerComposableKt$PriceAlertsBannerComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerComposableKt$PriceAlertsBannerComposable$$inlined$duxo$1.1
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
                        priceAlertsBannerDuxo3 = (PriceAlertsBannerDuxo) baseDuxo;
                        i3 &= -7169;
                        modifier3 = modifier5;
                    } else {
                        z = false;
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier5;
                        priceAlertsBannerDuxo3 = priceAlertsBannerDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                    priceAlertsBannerDuxo3 = priceAlertsBannerDuxo2;
                    z = false;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-539318850, i3, -1, "com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerComposable (PriceAlertsBannerComposable.kt:31)");
                }
                composer2.startReplaceGroup(-1746271574);
                boolean zChangedInstance2 = composer2.changedInstance(priceAlertsBannerDuxo3) | composer2.changedInstance(instrument);
                if ((i3 & 112) == 32) {
                    z = true;
                }
                z2 = zChangedInstance2 | z;
                objRememberedValue = composer2.rememberedValue();
                if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PriceAlertsBannerComposable.PriceAlertsBannerComposable$lambda$2$lambda$1(priceAlertsBannerDuxo3, instrument, accountNumber, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                LifecycleEffectKt.LifecycleResumeEffect(instrument, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer2, i3 & 14, 2);
                final PriceAlertsBannerDuxo priceAlertsBannerDuxo5 = priceAlertsBannerDuxo3;
                Composer composer4 = composer2;
                composer3 = composer4;
                PriceAlertsBannerViewState priceAlertsBannerViewStatePriceAlertsBannerComposable$lambda$3 = PriceAlertsBannerComposable$lambda$3(FlowExtKt.collectAsStateWithLifecycle(priceAlertsBannerDuxo5.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7));
                priceAlert = !(priceAlertsBannerViewStatePriceAlertsBannerComposable$lambda$3 instanceof PriceAlertsBannerViewState.PriceAlert) ? (PriceAlertsBannerViewState.PriceAlert) priceAlertsBannerViewStatePriceAlertsBannerComposable$lambda$3 : null;
                if (priceAlert != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final Modifier modifier6 = modifier3;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return PriceAlertsBannerComposable.PriceAlertsBannerComposable$lambda$4(instrument, accountNumber, modifier6, priceAlertsBannerDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifier7 = modifier3;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier7, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                CardKt.Card(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer3, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer3, i6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer3, i6).m21593getSmallD9Ej5fM()), null, null, null, ComposableLambda3.rememberComposableLambda(-1173468404, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerComposableKt.PriceAlertsBannerComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer5, Integer num) throws Resources.NotFoundException {
                        invoke(column5, composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Column5 Card, Composer composer5, int i7) throws Resources.NotFoundException {
                        String strStringResource;
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i7 & 17) == 16 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1173468404, i7, -1, "com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerComposable.<anonymous> (PriceAlertsBannerComposable.kt:52)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme2.getColors(composer5, i8).m21372getBg20d7_KjU(), null, 2, null), bentoTheme2.getSpacing(composer5, i8).m21590getDefaultD9Ej5fM());
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        PriceAlertsBannerViewState.PriceAlert priceAlert2 = priceAlert;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer5, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierM5142padding3ABfNKs);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer5.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                            composer5.createNode(constructor);
                        } else {
                            composer5.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.NOTIFICATION_24), StringResources_androidKt.stringResource(C25864R.string.notification_icon_content_description, composer5, 0), bentoTheme2.getColors(composer5, i8).m21425getFg0d7_KjU(), null, null, false, composer5, BentoIcon4.Size24.$stable, 56);
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme2.getSpacing(composer5, i8).m21592getMediumD9Ej5fM()), composer5, 0);
                        if (priceAlert2.getIsUp()) {
                            composer5.startReplaceGroup(-862999114);
                            strStringResource = StringResources_androidKt.stringResource(C25864R.string.price_alert_is_up_banner_text, new Object[]{priceAlert2.getSymbol(), Money.format$default(priceAlert2.getPrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null)}, composer5, 0);
                            composer5.endReplaceGroup();
                        } else {
                            composer5.startReplaceGroup(-862766924);
                            strStringResource = StringResources_androidKt.stringResource(C25864R.string.price_alert_is_down_banner_text, new Object[]{priceAlert2.getSymbol(), Money.format$default(priceAlert2.getPrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null)}, composer5, 0);
                            composer5.endReplaceGroup();
                        }
                        BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme2.getColors(composer5, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer5, i8).getTextS(), composer5, 0, 0, 8186);
                        composer5.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 196608, 28);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                priceAlertsBannerDuxo4 = priceAlertsBannerDuxo5;
                modifier4 = modifier7;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                priceAlertsBannerDuxo4 = priceAlertsBannerDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PriceAlertsBannerComposable.PriceAlertsBannerComposable$lambda$5(instrument, accountNumber, modifier4, priceAlertsBannerDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i4 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2.startReplaceGroup(-1746271574);
                boolean zChangedInstance22 = composer2.changedInstance(priceAlertsBannerDuxo3) | composer2.changedInstance(instrument);
                if ((i3 & 112) == 32) {
                }
                z2 = zChangedInstance22 | z;
                objRememberedValue = composer2.rememberedValue();
                if (!z2) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PriceAlertsBannerComposable.PriceAlertsBannerComposable$lambda$2$lambda$1(priceAlertsBannerDuxo3, instrument, accountNumber, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                    composer2.endReplaceGroup();
                    LifecycleEffectKt.LifecycleResumeEffect(instrument, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer2, i3 & 14, 2);
                    final PriceAlertsBannerDuxo priceAlertsBannerDuxo52 = priceAlertsBannerDuxo3;
                    Composer composer42 = composer2;
                    composer3 = composer42;
                    PriceAlertsBannerViewState priceAlertsBannerViewStatePriceAlertsBannerComposable$lambda$32 = PriceAlertsBannerComposable$lambda$3(FlowExtKt.collectAsStateWithLifecycle(priceAlertsBannerDuxo52.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7));
                    if (!(priceAlertsBannerViewStatePriceAlertsBannerComposable$lambda$32 instanceof PriceAlertsBannerViewState.PriceAlert)) {
                    }
                    if (priceAlert != null) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult PriceAlertsBannerComposable$lambda$2$lambda$1(PriceAlertsBannerDuxo priceAlertsBannerDuxo, Instrument instrument, String str, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobInitPriceAlertsStream = priceAlertsBannerDuxo.initPriceAlertsStream(instrument, str);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerComposableKt$PriceAlertsBannerComposable$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobInitPriceAlertsStream, null, 1, null);
            }
        };
    }

    private static final PriceAlertsBannerViewState PriceAlertsBannerComposable$lambda$3(SnapshotState4<? extends PriceAlertsBannerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
