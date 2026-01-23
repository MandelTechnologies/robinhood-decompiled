package com.robinhood.shared.trade.crypto.p397ui.fee.notificationPrimer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
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
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionState2;
import com.google.accompanist.permissions.PermissionsUtil2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposable3;
import com.robinhood.shared.trade.crypto.p397ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerDuxo3;
import com.robinhood.utils.extensions.ContextsUiExtensions;
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

/* compiled from: CryptoFeeTierNotificationPrimerComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\u0012\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"CryptoFeeTierNotificationPrimerComposable", "", "finish", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-trade-crypto_externalDebug", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerViewState;", "events", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerEvent;", "showErrorAlert", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoFeeTierNotificationPrimerComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeTierNotificationPrimerComposable$lambda$15(Function0 function0, Modifier modifier, CryptoFeeTierNotificationPrimerDuxo cryptoFeeTierNotificationPrimerDuxo, int i, int i2, Composer composer, int i3) {
        CryptoFeeTierNotificationPrimerComposable(function0, modifier, cryptoFeeTierNotificationPrimerDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024c  */
    @SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoFeeTierNotificationPrimerComposable(final Function0<Unit> finish, Modifier modifier, CryptoFeeTierNotificationPrimerDuxo cryptoFeeTierNotificationPrimerDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final CryptoFeeTierNotificationPrimerDuxo cryptoFeeTierNotificationPrimerDuxo2;
        Modifier modifier3;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        Composer composer2;
        final SnapshotState snapshotState;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final Event<CryptoFeeTierNotificationPrimerDuxo3> eventCryptoFeeTierNotificationPrimerComposable$lambda$1;
        final CryptoFeeTierNotificationPrimerDuxo cryptoFeeTierNotificationPrimerDuxo3;
        final Modifier modifier4;
        EventConsumer<CryptoFeeTierNotificationPrimerDuxo3> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(finish, "finish");
        Composer composerStartRestartGroup = composer.startRestartGroup(276050693);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(finish) ? 4 : 2) | i;
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
                    cryptoFeeTierNotificationPrimerDuxo2 = cryptoFeeTierNotificationPrimerDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoFeeTierNotificationPrimerDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    cryptoFeeTierNotificationPrimerDuxo2 = cryptoFeeTierNotificationPrimerDuxo;
                }
                i3 |= i6;
            } else {
                cryptoFeeTierNotificationPrimerDuxo2 = cryptoFeeTierNotificationPrimerDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        CreationExtras defaultViewModelCreationExtras = current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoFeeTierNotificationPrimerDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposableKt$CryptoFeeTierNotificationPrimerComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposableKt$CryptoFeeTierNotificationPrimerComposable$$inlined$duxo$1.1
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
                        cryptoFeeTierNotificationPrimerDuxo2 = (CryptoFeeTierNotificationPrimerDuxo) baseDuxo;
                        i3 &= -897;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(276050693, i3, -1, "com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposable (CryptoFeeTierNotificationPrimerComposable.kt:70)");
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoFeeTierNotificationPrimerDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoFeeTierNotificationPrimerDuxo2.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Object[] objArr = new Object[i4];
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoFeeTierNotificationPrimerComposable3.CryptoFeeTierNotificationPrimerComposable$lambda$3$lambda$2();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                    context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composer2.startReplaceGroup(5004770);
                    zChangedInstance = composer2.changedInstance(cryptoFeeTierNotificationPrimerDuxo2);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoFeeTierNotificationPrimerComposable3.CryptoFeeTierNotificationPrimerComposable$lambda$7$lambda$6(cryptoFeeTierNotificationPrimerDuxo2, ((Boolean) obj).booleanValue());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    PermissionState permissionStateRememberPermissionState = PermissionState2.rememberPermissionState("android.permission.POST_NOTIFICATIONS", (Function1) objRememberedValue2, composer2, 6, i4);
                    eventCryptoFeeTierNotificationPrimerComposable$lambda$1 = CryptoFeeTierNotificationPrimerComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCryptoFeeTierNotificationPrimerComposable$lambda$1 != null && (eventCryptoFeeTierNotificationPrimerComposable$lambda$1.getData() instanceof CryptoFeeTierNotificationPrimerDuxo3) && (eventConsumerInvoke = eventCryptoFeeTierNotificationPrimerComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventCryptoFeeTierNotificationPrimerComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposableKt$CryptoFeeTierNotificationPrimerComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25825invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25825invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                CryptoFeeTierNotificationPrimerDuxo3 cryptoFeeTierNotificationPrimerDuxo32 = (CryptoFeeTierNotificationPrimerDuxo3) eventCryptoFeeTierNotificationPrimerComposable$lambda$1.getData();
                                if (cryptoFeeTierNotificationPrimerDuxo32 instanceof CryptoFeeTierNotificationPrimerDuxo3.ShowToastAndFinish) {
                                    Toast.makeText(context, C40095R.string.crypto_fee_tier_notification_primer_toast_updates_are_on, 1).show();
                                    finish.invoke();
                                } else if (cryptoFeeTierNotificationPrimerDuxo32 instanceof CryptoFeeTierNotificationPrimerDuxo3.ShowTurnOnErrorAlert) {
                                    CryptoFeeTierNotificationPrimerComposable3.CryptoFeeTierNotificationPrimerComposable$lambda$5(snapshotState, true);
                                }
                            }
                        });
                    }
                    Modifier modifier5 = modifier3;
                    cryptoFeeTierNotificationPrimerDuxo3 = cryptoFeeTierNotificationPrimerDuxo2;
                    int i7 = i4;
                    composerStartRestartGroup = composer2;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions(WindowInsetsPadding_androidKt.safeDrawingPadding(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Background3.m4872backgroundbw27NRU$default(modifier5, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null)), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.FEE_TIER_PUSH_NOTIF_UPSELL, null, null, null, 14, null), null, null, null, null, 61, null)), false, ComposableLambda3.rememberComposableLambda(1837939312, true, new C401942(context, permissionStateRememberPermissionState, cryptoFeeTierNotificationPrimerDuxo3, finish, snapshotState4CollectAsStateWithLifecycle), composer2, 54), CryptoFeeTierNotificationPrimerComposable.INSTANCE.m25823getLambda$299505379$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 3456, 2);
                    if (CryptoFeeTierNotificationPrimerComposable$lambda$4(snapshotState)) {
                        String strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_fee_tier_notification_primer_error_title, composerStartRestartGroup, i7);
                        BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C40095R.string.crypto_fee_tier_notification_primer_error_description, composerStartRestartGroup, i7));
                        String strStringResource2 = StringResources_androidKt.stringResource(C40095R.string.crypto_fee_tier_notification_primer_error_cta_try_again, composerStartRestartGroup, i7);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChanged = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(cryptoFeeTierNotificationPrimerDuxo3);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoFeeTierNotificationPrimerComposable3.CryptoFeeTierNotificationPrimerComposable$lambda$10$lambda$9(cryptoFeeTierNotificationPrimerDuxo3, snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue4);
                        String strStringResource3 = StringResources_androidKt.stringResource(C40095R.string.crypto_fee_tier_notification_primer_error_cta_dismiss, composerStartRestartGroup, i7);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChanged2 = composerStartRestartGroup.changed(snapshotState);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoFeeTierNotificationPrimerComposable3.CryptoFeeTierNotificationPrimerComposable$lambda$12$lambda$11(snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource3, (Function0) objRememberedValue5);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChanged3 = composerStartRestartGroup.changed(snapshotState);
                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3 || objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposableKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoFeeTierNotificationPrimerComposable3.CryptoFeeTierNotificationPrimerComposable$lambda$14$lambda$13(snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        Function0 function0 = (Function0) objRememberedValue6;
                        composerStartRestartGroup.endReplaceGroup();
                        int i8 = BentoAlertDialog2.Body.Text.$stable << 3;
                        int i9 = BentoAlertButton.$stable;
                        BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function0, composerStartRestartGroup, i8 | (i9 << 6) | (i9 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                i4 = 0;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoFeeTierNotificationPrimerDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(cryptoFeeTierNotificationPrimerDuxo2.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object[] objArr2 = new Object[i4];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composer2.startReplaceGroup(5004770);
                zChangedInstance = composer2.changedInstance(cryptoFeeTierNotificationPrimerDuxo2);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoFeeTierNotificationPrimerComposable3.CryptoFeeTierNotificationPrimerComposable$lambda$7$lambda$6(cryptoFeeTierNotificationPrimerDuxo2, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                    composer2.endReplaceGroup();
                    PermissionState permissionStateRememberPermissionState2 = PermissionState2.rememberPermissionState("android.permission.POST_NOTIFICATIONS", (Function1) objRememberedValue2, composer2, 6, i4);
                    eventCryptoFeeTierNotificationPrimerComposable$lambda$1 = CryptoFeeTierNotificationPrimerComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventCryptoFeeTierNotificationPrimerComposable$lambda$1 != null) {
                        eventConsumerInvoke.consume(eventCryptoFeeTierNotificationPrimerComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposableKt$CryptoFeeTierNotificationPrimerComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25825invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25825invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                CryptoFeeTierNotificationPrimerDuxo3 cryptoFeeTierNotificationPrimerDuxo32 = (CryptoFeeTierNotificationPrimerDuxo3) eventCryptoFeeTierNotificationPrimerComposable$lambda$1.getData();
                                if (cryptoFeeTierNotificationPrimerDuxo32 instanceof CryptoFeeTierNotificationPrimerDuxo3.ShowToastAndFinish) {
                                    Toast.makeText(context, C40095R.string.crypto_fee_tier_notification_primer_toast_updates_are_on, 1).show();
                                    finish.invoke();
                                } else if (cryptoFeeTierNotificationPrimerDuxo32 instanceof CryptoFeeTierNotificationPrimerDuxo3.ShowTurnOnErrorAlert) {
                                    CryptoFeeTierNotificationPrimerComposable3.CryptoFeeTierNotificationPrimerComposable$lambda$5(snapshotState, true);
                                }
                            }
                        });
                    }
                    Modifier modifier52 = modifier3;
                    cryptoFeeTierNotificationPrimerDuxo3 = cryptoFeeTierNotificationPrimerDuxo2;
                    int i72 = i4;
                    composerStartRestartGroup = composer2;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions(WindowInsetsPadding_androidKt.safeDrawingPadding(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Background3.m4872backgroundbw27NRU$default(modifier52, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null)), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.FEE_TIER_PUSH_NOTIF_UPSELL, null, null, null, 14, null), null, null, null, null, 61, null)), false, ComposableLambda3.rememberComposableLambda(1837939312, true, new C401942(context, permissionStateRememberPermissionState2, cryptoFeeTierNotificationPrimerDuxo3, finish, snapshotState4CollectAsStateWithLifecycle3), composer2, 54), CryptoFeeTierNotificationPrimerComposable.INSTANCE.m25823getLambda$299505379$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 3456, 2);
                    if (CryptoFeeTierNotificationPrimerComposable$lambda$4(snapshotState)) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier52;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoFeeTierNotificationPrimerDuxo3 = cryptoFeeTierNotificationPrimerDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoFeeTierNotificationPrimerComposable3.CryptoFeeTierNotificationPrimerComposable$lambda$15(finish, modifier4, cryptoFeeTierNotificationPrimerDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                    i4 = 0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(cryptoFeeTierNotificationPrimerDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(cryptoFeeTierNotificationPrimerDuxo2.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object[] objArr22 = new Object[i4];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composer2.startReplaceGroup(5004770);
                zChangedInstance = composer2.changedInstance(cryptoFeeTierNotificationPrimerDuxo2);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState CryptoFeeTierNotificationPrimerComposable$lambda$3$lambda$2() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoFeeTierNotificationPrimerComposable$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeTierNotificationPrimerComposable$lambda$7$lambda$6(CryptoFeeTierNotificationPrimerDuxo cryptoFeeTierNotificationPrimerDuxo, boolean z) {
        if (z) {
            cryptoFeeTierNotificationPrimerDuxo.turnOn();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoFeeTierNotificationPrimerViewState CryptoFeeTierNotificationPrimerComposable$lambda$0(SnapshotState4<CryptoFeeTierNotificationPrimerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoFeeTierNotificationPrimerDuxo3> CryptoFeeTierNotificationPrimerComposable$lambda$1(SnapshotState4<Event<CryptoFeeTierNotificationPrimerDuxo3>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean CryptoFeeTierNotificationPrimerComposable$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: CryptoFeeTierNotificationPrimerComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposableKt$CryptoFeeTierNotificationPrimerComposable$2 */
    static final class C401942 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ CryptoFeeTierNotificationPrimerDuxo $duxo;
        final /* synthetic */ Function0<Unit> $finish;
        final /* synthetic */ PermissionState $permissionState;
        final /* synthetic */ SnapshotState4<CryptoFeeTierNotificationPrimerViewState> $viewState$delegate;

        C401942(Context context, PermissionState permissionState, CryptoFeeTierNotificationPrimerDuxo cryptoFeeTierNotificationPrimerDuxo, Function0<Unit> function0, SnapshotState4<CryptoFeeTierNotificationPrimerViewState> snapshotState4) {
            this.$context = context;
            this.$permissionState = permissionState;
            this.$duxo = cryptoFeeTierNotificationPrimerDuxo;
            this.$finish = function0;
            this.$viewState$delegate = snapshotState4;
        }

        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1837939312, i, -1, "com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposable.<anonymous> (CryptoFeeTierNotificationPrimerComposable.kt:159)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            final Context context = this.$context;
            final PermissionState permissionState = this.$permissionState;
            final CryptoFeeTierNotificationPrimerDuxo cryptoFeeTierNotificationPrimerDuxo = this.$duxo;
            Function0<Unit> function0 = this.$finish;
            SnapshotState4<CryptoFeeTierNotificationPrimerViewState> snapshotState4 = this.$viewState$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_fee_tier_notification_primer_helper, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C40095R.string.crypto_fee_tier_notification_primer_helper_learn_more, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(context);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposableKt$CryptoFeeTierNotificationPrimerComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoFeeTierNotificationPrimerComposable3.C401942.invoke$lambda$4$lambda$1$lambda$0(context);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource, strStringResource2, (Function0) objRememberedValue, null, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), 0L, bentoTheme.getTypography(composer, i2).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), composer, 0, 40);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Screen.Name name = Screen.Name.FEE_TIER_PUSH_NOTIF_UPSELL;
            Screen screen = new Screen(name, null, null, null, 14, null);
            Component.ComponentType componentType = Component.ComponentType.BUTTON;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierFillMaxWidth$default, new UserInteractionEventDescriptor(null, screen, null, null, new Component(componentType, "turn_on", null, 4, null), null, 45, null), true, false, false, true, false, null, 108, null);
            String strStringResource3 = StringResources_androidKt.stringResource(C40095R.string.crypto_fee_tier_notification_primer_cta_turn_on, composer, 0);
            boolean zIsPrimaryButtonLoading = CryptoFeeTierNotificationPrimerComposable3.CryptoFeeTierNotificationPrimerComposable$lambda$0(snapshotState4).isPrimaryButtonLoading();
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(permissionState) | composer.changedInstance(cryptoFeeTierNotificationPrimerDuxo) | composer.changedInstance(context);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerComposableKt$CryptoFeeTierNotificationPrimerComposable$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoFeeTierNotificationPrimerComposable3.C401942.invoke$lambda$4$lambda$3$lambda$2(permissionState, cryptoFeeTierNotificationPrimerDuxo, context);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource3, modifierAutoLogEvents$default, null, null, false, zIsPrimaryButtonLoading, null, null, null, null, false, null, composer, 0, 0, 8120);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C40095R.string.crypto_fee_tier_notification_primer_cta_maybe_later, composer, 0), ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), null, null, new Component(componentType, "maybe_later", null, 4, null), null, 45, null), true, false, false, true, false, null, 108, null), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
            invoke(bentoButtonBar3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(Context context) {
            WebUtils.viewUrl$default(context, "https://robinhood.com/us/en/support/articles/crypto-fee-tiers/#Notifications", 0, 4, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(PermissionState permissionState, CryptoFeeTierNotificationPrimerDuxo cryptoFeeTierNotificationPrimerDuxo, Context context) {
            if (PermissionsUtil2.isGranted(permissionState.getStatus())) {
                cryptoFeeTierNotificationPrimerDuxo.turnOn();
            } else if (PermissionsUtil2.getShouldShowRationale(permissionState.getStatus())) {
                ContextsUiExtensions.openAppSystemSettings(context);
            } else {
                permissionState.launchPermissionRequest();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeTierNotificationPrimerComposable$lambda$10$lambda$9(CryptoFeeTierNotificationPrimerDuxo cryptoFeeTierNotificationPrimerDuxo, SnapshotState snapshotState) {
        CryptoFeeTierNotificationPrimerComposable$lambda$5(snapshotState, false);
        cryptoFeeTierNotificationPrimerDuxo.onTryAgainClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeTierNotificationPrimerComposable$lambda$12$lambda$11(SnapshotState snapshotState) {
        CryptoFeeTierNotificationPrimerComposable$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeTierNotificationPrimerComposable$lambda$14$lambda$13(SnapshotState snapshotState) {
        CryptoFeeTierNotificationPrimerComposable$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }
}
